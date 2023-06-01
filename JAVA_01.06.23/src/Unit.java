public class Unit {
    private String name;
    private int health;
    private int damage;

    Unit(String name, int damage){
        this.name = name;
        this.damage = damage;
        this.health = 100;
    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public void uron(int damage){
        this.health -= damage;
    }
    public void print(){
        System.out.println(this.name + " " + this.health);
    }
}
