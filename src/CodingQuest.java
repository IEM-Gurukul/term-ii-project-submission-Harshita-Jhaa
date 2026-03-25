public class CodingQuest extends Quest {
    public CodingQuest(String name, int difficulty) {
        super(name, difficulty);
    }

    @Override
    public int calculateXP() {
        return difficulty * 100; 
    }
}