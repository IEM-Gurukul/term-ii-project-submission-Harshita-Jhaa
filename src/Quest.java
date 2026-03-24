public abstract class Quest {
    protected String name;
    protected int difficulty;

    public Quest(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }
    public abstract int calculateXP();
    
    public String getName() { return name; }
}
    

