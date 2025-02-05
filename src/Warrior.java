public class Warrior extends GameCharacter{
private boolean shield;

    public Warrior(String name, int level, double health, boolean shield) {
        super(name, level, health);
        this.shield = shield;
    }
    @Override
    public void damage(int damage){
        if (shield){
            damage/=2;
        }super.damage(damage);
    }
    @Override
    public void attack(){
        System.out.println(name + " атакует   мечом ");
    }

}
