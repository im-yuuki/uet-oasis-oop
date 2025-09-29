package week2.studentmanagement;

import java.util.HashSet;

public class StudentManagement {

    private final Student[] students = new Student[100];

    /**
     * Same group.
     *
     * @param s1 student
     * @param s2 student
     * @return true/false
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Add student.
     *
     * @param newStudent student
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    /**
     * Remove a student by ID.
     *
     * @param id student ID
     */
    public void removeStudent(String id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                students[i] = null;
                break;
            }
        }
    }

    /**
     * List by group.
     *
     * @return string representation
     */
    public String studentsByGroup() {
        HashSet<String> groups = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            if (student != null) {
                String group = student.getGroup();
                if (!groups.contains(group)) {
                    groups.add(group);
                    result.append(group).append("\n");
                    for (Student s : students) {
                        if (s != null && s.getGroup().equals(group)) {
                            result.append(s.getInfo()).append("\n");
                        }
                    }
                }
            }
        }
        return result.toString();
    }

    /**
     * Main method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Nguyen Van An");
        s1.setId("17020001");
        s1.setGroup("K62CC");
        s1.setEmail("17020001@vnu.edu.vn");
        System.out.println(s1.getInfo());
    }

}
