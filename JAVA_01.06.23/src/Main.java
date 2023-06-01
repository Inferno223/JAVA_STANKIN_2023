public class Main {
    public static void main(String[] args) {
        Ghost petya = new Ghost("petya", 20, 50);
        Wizard vasiliy = new Wizard("vasiliy", 20, 30);

        while (petya.getHealth() > 0 && vasiliy.getHealth() > 0) {
            petya.uron(vasiliy.getDamage());
            petya.print();
            vasiliy.uron(petya.getDamage());
            vasiliy.print();
        }
    }
}