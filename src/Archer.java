public class Archer extends  GameCharacter {
    public Archer(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет из лука!");
    }
}
