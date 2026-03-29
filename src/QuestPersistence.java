import java.io.*;

public class QuestPersistence {
    private static final String FILE_NAME = "user_stats.txt";

    public static void saveStats(int xp, int streak) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            writer.println(xp);
            writer.println(streak);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static int[] loadStats() {
        int[] stats = {0, 0}; // Default XP and Streak
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                stats[0] = Integer.parseInt(reader.readLine());
                stats[1] = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("No previous data found. Starting fresh.");
            }
        }
        return stats;
    }
}
