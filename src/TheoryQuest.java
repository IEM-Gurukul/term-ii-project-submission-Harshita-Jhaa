public class TheoryQuest extends Quest {
    public TheoryQuest(String name, int difficulty) {
        super(name, difficulty);
    }

    @Override
    public int calculateXP() {
        return difficulty * 50; 
    }
}