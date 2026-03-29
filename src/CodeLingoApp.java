import java.util.Scanner;

public class CodeLingoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] savedData = QuestPersistence.loadStats();
        int totalXP = savedData[0];
        int streak = savedData[1];

        System.out.println("=== CodeLingo: High-Maturity Study Engine ===");
        System.out.println("Welcome back! Current XP: " + totalXP + " | Streak: " + streak);

        while (true) {
            System.out.println("\n[1] New Quest  [2] View Stats  [3] Exit");
            System.out.print("Choice: ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 3) {
                
                QuestPersistence.saveStats(totalXP, streak);
                break;
            }

            if (choice == 1) {
                try {
                    System.out.print("Type (Coding/Theory): ");
                    String type = sc.nextLine();
                    
                    System.out.print("Quest Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Difficulty (1-5): ");
                    int diff = sc.nextInt();

                    Quest myQuest = QuestFactory.createQuest(type, name, diff);

                    
                    if (myQuest == null) {
                        throw new InvalidQuestException("Quest type '" + type + "' is not supported!");
                    }

                    int earned = myQuest.calculateXP();
                    totalXP += earned;
                    streak++;
                    System.out.println("Success! You earned " + earned + " XP.");
                    
                } catch (InvalidQuestException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred. Please try again.");
                    sc.nextLine(); // Clear buffer
                }
            } else if (choice == 2) {
                System.out.println("--- User Profile ---");
                System.out.println("Total XP: " + totalXP);
                System.out.println("Current Streak: " + streak);
            }
        }
        System.out.println("Progress saved. Closing CodeLingo.");
        sc.close();
    }
}