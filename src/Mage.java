public class Mage extends  GameCharacter {
    public Mage(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " использует магическое заклинание!");
    }
}
