public class Soldier extends Person {

    public Soldier(String lastName) {
        super(lastName);
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
