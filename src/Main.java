public class Main {
    public static void main(String[] args) {
        Person[] headquarters = new Person[9];
        headquarters[0] = new Soldier("Soldier 1", (Commander) headquarters[6]);
        headquarters[1] = new Soldier("Soldier 2", (Commander) headquarters[6]);
        headquarters[2] = new Soldier("Soldier 3", (Commander) headquarters[6]);
        headquarters[3] = new Soldier("Soldier 4", (Commander) headquarters[7]);
        headquarters[4] = new Soldier("Soldier 5", (Commander) headquarters[7]);
        headquarters[5] = new Soldier("Soldier 6", (Commander) headquarters[7]);
        headquarters[6] = new Commander("Commander 1", (Soldier) headquarters[0],(Soldier) headquarters[1],
                (Soldier) headquarters[2]);
        headquarters[7] = new Commander("Commander 1", (Soldier) headquarters[3],(Soldier) headquarters[4],
                (Soldier)  headquarters[5]);
        headquarters[8] = new General("General", (Commander)  headquarters[6], (Commander)  headquarters[7]);
    }
}
