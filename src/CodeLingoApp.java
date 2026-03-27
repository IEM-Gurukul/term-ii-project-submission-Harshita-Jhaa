import java.util.Scanner;

public class CodeLingoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalXP = 0;
        int streak = 0;

        System.out.println("=== CodeLingo: High-Maturity Study Engine ===");

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

            if (choice == 3) break;

            if (choice == 1) {
                System.out.print("Type (Coding/Theory): ");
                String type = sc.nextLine();
                System.out.print("Quest Name: ");
                String name = sc.nextLine();
                System.out.print("Difficulty (1-5): ");
                int diff = sc.nextInt();

                Quest myQuest = QuestFactory.createQuest(type, name, diff);

                if (myQuest != null) {
                    int earned = myQuest.calculateXP();
                    totalXP += earned;
                    streak++; 
                    System.out.println("Success! You earned " + earned + " XP.");
                } else {
                    System.out.println("Error: Unknown quest type!");
                }
            } else if (choice == 2) {
                System.out.println("--- User Profile ---");
                System.out.println("Total XP: " + totalXP);
                System.out.println("Current Streak: " + streak);
            }
        }
        System.out.println("Closing CodeLingo. Keep coding!");
        sc.close();
    }
}