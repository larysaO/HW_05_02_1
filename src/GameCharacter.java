public abstract class GameCharacter {
    String name;
    int level;
    int health;

    public GameCharacter(String name, int level, double health) {
        this.name = name;
        this.level = 0;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getHealth() {
        return health;
    }

}
