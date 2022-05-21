public abstract class Person implements CapableOfCombat {
    private final String lastName;


    public String getLastName() {
        return lastName;
    }

    public abstract String getPosition();

    public Person(String lastName) {
        this.lastName = lastName;
    }
}
