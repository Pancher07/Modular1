public class Soldier extends Person {
    private Commander myCommander;
    public Soldier(String lastName, Commander myCommander) {
        super(lastName);
        this.myCommander = myCommander;
    }

    @Override
    public String getPosition() {
        return "Солдат";
    }

    public boolean iCanFight() {
        return true;
    }

    public void report() {
        System.out.println("Я " + this.getPosition() + " " + this.getLastName() + " готовий до виконання обов'язків!");
    }
}
