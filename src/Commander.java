public class Commander extends Person {
    private final String position = "Командир";
    private Soldier mySoilder1;
    private Soldier mySoilder2;
    private Soldier mySoilder3;

    public Commander(String lastName, Soldier mySoilder1, Soldier mySoilder2, Soldier mySoilder3) {
        super(lastName);
        this.mySoilder1 = mySoilder1;
        this.mySoilder2 = mySoilder2;
        this.mySoilder3 = mySoilder3;
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
