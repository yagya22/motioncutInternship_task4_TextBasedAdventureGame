import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventureGame {

    public static class Player {
        private String name;
        private String playerClass;
        private List<String> inventory = new ArrayList<>();

        public Player(String name, String playerClass) {
            this.name = name;
            this.playerClass = playerClass;
        }

        public String getName() {
            return name;
        }

        public String getPlayerClass() {
            return playerClass;
        }

        public void addToInventory(String item) {
            inventory.add(item);
            System.out.println("You obtained: " + item);
        }

        public void displayInventory() {
            System.out.println("Inventory: " + inventory);
        }
    }

    public static void main(String[] args) {
        System.out.println("*********Welcome to the Enhanced Adventure Game!**********");
        System.out.println("You find yourself in a vast and enigmatic world filled with endless possibilities.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to embark on your Adventurous journey...");
        scanner.nextLine();

        while (true) {
            Player player = createCharacter();
            playGame(player);

            System.out.print("Do you want to play again? (yes/no): ");
            String restart = scanner.nextLine().toLowerCase();
            if (!restart.equals("y")) {
                break;
            }
        }
    }

    public static Player createCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCreate your character:");
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();
        System.out.println("Choose your class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Rogue");
        System.out.print("Enter your choice (1/2/3): ");
        String classChoice = scanner.nextLine();

        return new Player(name, classChoice);
    }

    public static void playGame(Player player) {
        System.out.println("\nWelcome, " + player.getName() + "! You are a " + player.getPlayerClass() + ".");
        System.out.println("You stand at a crossroads. Which path will you choose?");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1/2): ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            leftPath();
        } else if (choice.equals("2")) {
            rightPath();
        } else {
            System.out.println("Invalid input. Please choose 1 or 2.");
            playGame(player);
        }
    }
    public static void leftPath() {
        System.out.println("\nYou chose the left path.");
        System.out.println("You enter a dense, enchanted forest.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("As you venture deeper, you encounter a hidden village of magical creatures.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("They invite you to stay and learn their ways.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("What will you do?");

        while (true) {
            System.out.println("\n1. Accept their invitation and become part of their magical world.");
            System.out.println("2. Politely decline and continue your journey.");
            Scanner innerScanner = new Scanner(System.in);
            System.out.print("Enter your choice (1/2): ");
            String choice = innerScanner.nextLine();

            if (choice.equals("1")) {
                learnMagic();
                break;
            } else if (choice.equals("2")) {
                System.out.println("You thank the magical creatures and continue your adventure.");
                continueJourney();
                break;
            } else {
                System.out.println("Invalid input. Please choose either 1 or 2.");
            }
        }
    }

    public static void learnMagic() {
        System.out.println("\nYou accept the magical creatures' invitation.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("You spend years in their village, mastering the arts of magic and unlocking your potential.");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("With newfound powers, you face a choice.");

        while (true) {
            System.out.println("\n1. Use your powers for good, helping those in need.");
            System.out.println("2. Use your powers to amass wealth and power for yourself.");
            Scanner innerScanner = new Scanner(System.in);
            System.out.print("Enter your choice (1/2): ");
            String choice = innerScanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("You become a renowned wizard, known for your benevolence and wisdom.");
                System.out.println("Please Press Enter to continue...");
                continueJourney();
                break;
            } else if (choice.equals("2")) {
                System.out.println("You become a feared sorcerer, using your powers to control and dominate.");
                System.out.println("Please Press Enter to continue...");
                continueJourney();
                break;
            } else {
                System.out.println("Invalid input. Please choose 1 or 2.");
            }
        }
    }

    public static void continueJourney() {
        System.out.println("Your adventure continues...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("You embark on numerous quests, face formidable foes, and explore uncharted territories.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("As time passes, you face another choice.");

        while (true) {
            System.out.println("\n1. Seek the ultimate treasure you were originally searching for.");
            System.out.println("2. Pursue a new and unexpected adventure.");
            Scanner innerScanner = new Scanner(System.in);
            System.out.print("Enter your choice (1/2): ");
            String choice = innerScanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("You embark on a quest to find the ultimate treasure.");
                System.out.println("Please Press Enter to continue...");
                findTreasure();
                break;
            } else if (choice.equals("2")) {
                System.out.println("You decide to explore a new and unexpected adventure.");
                System.out.println("Please Press Enter to continue...");
                continueUnexpectedAdventure();
                break;
            } else {
                System.out.println("Invalid input. Please choose 1 or 2.");
            }
        }
    }

    public static void findTreasure() {
        System.out.println("You journey to distant lands, face dangerous challenges, and eventually find the ultimate treasure.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Congratulations, you've completed your epic adventure!");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
    }

    public static void continueUnexpectedAdventure() {
        System.out.println("Your new adventure leads you to a series of unexpected and exciting quests.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("You encounter and befriend powerful allies who aid you in your epic journey.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Your adventure continues with new surprises and challenges.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Finally, you find a different kind of treasure, bringing your adventure to a close.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("Congratulations, you've successfully completed your epic adventure!");
    }

    public static void rightPath() {
        System.out.println("\nYou chose the right path.");
        System.out.println("You arrive at a grand castle with a towering drawbridge.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("A kind-hearted princess greets you and offers to assist you in your quest.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("She tells you about a legendary treasure hidden deep within the castle's dungeons.");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("What will you do?");

        while (true) {
            System.out.println("\n1. Accept the princess's offer and explore the dungeons together.");
            System.out.println("2. Decline and continue your quest independently.");
            Scanner innerScanner = new Scanner(System.in);
            System.out.print("Enter your choice (1/2): ");
            String choice = innerScanner.nextLine();

            if (choice.equals("1")) {
                exploreDungeons();
                break;
            } else if (choice.equals("2")) {
                System.out.println("You thank the princess but decide to continue your adventure alone.");
                continueJourney();
                break;
            } else {
                System.out.println("Invalid input. Please choose 1 or 2.");
            }
        }
    }

    public static void exploreDungeons() {
        System.out.println("\nYou agree to explore the castle's dungeons with the princess.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("The dungeons are filled with elaborate traps, intricate puzzles, and formidable challenges.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("After a long and perilous journey, you discover the legendary treasure.");
        System.out.println("Please Press Enter to continue...");
        scanner.nextLine();
        System.out.println("The princess offers to join you on your quest as a trusted companion.");
        System.out.println("Please Press Enter to continue...");
        continueJourney();
    }
}