public class Ghost extends Unit{
    int invisible;

    public Ghost(String name, int damage, int invisible){
        super(name, damage);
        this.invisible = invisible;
    }
    @Override
    public void uron(int damage){
        if((int)(Math.random()*100) > invisible)
            super.uron(damage);
    }
}
