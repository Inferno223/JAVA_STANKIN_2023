public class Wizard extends Unit{
    int critical;

    public Wizard(String name, int damage, int critical){
        super(name, damage);
        this.critical = critical;
    }
    @Override
    public int getDamage(){
        if((int)(Math.random()*100) > critical)
            return super.getDamage();
        else
            return super.getDamage()*2;
    }
}