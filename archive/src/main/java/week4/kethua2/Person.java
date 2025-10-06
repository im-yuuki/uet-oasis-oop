package week4.kethua2;

public class Person {

    private String name;
    private String address;

    /**
     * Constructor for Person class.
     * @param name    the name of the person
     * @param address the address of the person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Returns a string representation of the Person object.
     * @return a string
     */
    public String toString() {
        return String.format(
            "Person[name=%s,address=%s]",
            name, address
        );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
