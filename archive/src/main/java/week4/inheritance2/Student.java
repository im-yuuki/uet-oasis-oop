package week4.inheritance2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor for Student class.
     * @param name    the name of the student
     * @param address the address of the student
     * @param program the program the student is enrolled in
     * @param year    the year of study
     * @param fee     the tuition fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * String representation of the Student object.
     * @return a string containing student details
     */
    @Override
    public String toString() {
        return String.format(
            "Student[%s,program=%s,year=%d,fee=%.1f]",
            super.toString(),
            program,
            year,
            fee
        );
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}
