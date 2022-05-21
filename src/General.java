public class General extends Person {
    private final String position = "Генерал";
    private Commander mySubordinate1;
    private Commander mySubordinate2;
    public General(String lastName, Commander mySubordinate1, Commander mySubordinate2) {
        super(lastName);
        this.mySubordinate1 = mySubordinate1;
        this.mySubordinate2 = mySubordinate2;
    }

    public String getPosition() {
        return this.position;
    }

    public boolean iCanFight() {
        return true;
    }

    public void report() {
        System.out.println("Я " + this.getPosition() + " " + this.getLastName() + "готовий до виконання обов'язків!");
    }
}
