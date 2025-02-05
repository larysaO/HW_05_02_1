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
    public void levelUp(){
        if (level <5) {
            level++;
            System.out.println(name + " Povisil level do" + level);
        }else {
            System.out.println(name+ "Max level");
        }

    }

}
