public class Warrior extends GameCharacter{
private boolean shield;

    public Warrior(String name, int level, double health, boolean shield) {
        super(name, level, health);
        this.shield = shield;
    }
}
