public class QuestFactory {
    public static Quest createQuest(String type, String name, int diff) {
        if (type.equalsIgnoreCase("CODING")) {
            return new CodingQuest(name, diff);
        } else if (type.equalsIgnoreCase("THEORY")) {
            return new TheoryQuest(name, diff);
        }
        return null; 
    }
}