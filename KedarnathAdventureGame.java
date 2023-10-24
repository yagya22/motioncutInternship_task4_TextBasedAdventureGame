import java.util.Scanner;

public class KedarnathAdventureGame {
    private static Scanner scanner = new Scanner(System.in);
    private static int spiritualPoints = 0;
    private static int pilgrimCompassLevel = 1;

    public static void main(String[] args) {
        System.out.println("******** Kedarnath Adventure Game Mai Aapka Swagat Hai! ********");
        System.out.println("Embark on a thrilling and spiritual pilgrimage to Kedarnath.");

        // Start the adventure
        visitHaridwar();
    }

    private static void visitHaridwar() {
        System.out.println("\nYou begin your journey in the holy city of Haridwar.");
        System.out.println("1. Attend the Ganga Aarti at Har Ki Pauri");
        System.out.println("2. Explore the local markets");
        System.out.println("3. Take a dip in the Ganges");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                spiritualPoints += 10;
                System.out.println("Attending the Ganga Aarti fills your soul with peace. Spiritual Points +10.");
                break;
            case 2:
                spiritualPoints += 5;
                System.out.println("Exploring the local markets is a delightful experience. Spiritual Points +5.");
                break;
            case 3:
                spiritualPoints -= 5;
                System.out.println("Taking a dip in the Ganges was a bit too cold. Spiritual Points -5.");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                visitHaridwar();
                return;
        }

        proceedToRishikesh();
    }

    private static void proceedToRishikesh() {
        System.out.println("\nYou travel to Rishikesh, the gateway to the Himalayas.");
        System.out.println("1. Visit the Beatles Ashram");
        System.out.println("2. Try white-water rafting");
        System.out.println("3. Attend a yoga class");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                spiritualPoints += 5;
                System.out.println("Exploring the Beatles Ashram connects you to the spiritual vibes. Spiritual Points +5.");
                break;
            case 2:
                spiritualPoints += 10;
                System.out.println("White-water rafting is an adventurous experience. Spiritual Points +10.");
                break;
            case 3:
                spiritualPoints += 7;
                System.out.println("Attending a yoga class rejuvenates your body and mind. Spiritual Points +7.");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                proceedToRishikesh();
                return;
        }

        continueToDehradun();
    }

    private static void continueToDehradun() {
        System.out.println("\nYou make your way to Dehradun, a city nestled in the foothills of the Himalayas.");
        System.out.println("1. Explore the Robber's Cave");
        System.out.println("2. Visit the Forest Research Institute");
        System.out.println("3. Enjoy local street food");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                spiritualPoints += 8;
                System.out.println("Exploring the Robber's Cave reveals its hidden wonders. Spiritual Points +8.");
                break;
            case 2:
                spiritualPoints += 6;
                System.out.println("Visiting the Forest Research Institute broadens your knowledge. Spiritual Points +6.");
                break;
            case 3:
                spiritualPoints += 10;
                System.out.println("Indulging in local street food delights your taste buds. Spiritual Points +10.");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                continueToDehradun();
                return;
        }

        exploreHimalayanVillages();
    }

    private static void exploreHimalayanVillages() {
        System.out.println("\nYou venture into the charming Himalayan villages on your way to Kedarnath.");
        System.out.println("1. Participate in a local festival");
        System.out.println("2. Help a villager with a task");
        System.out.println("3. Learn traditional Himalayan cooking");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                spiritualPoints += 12;
                System.out.println("Participating in the local festival brings joy to the entire village. Spiritual Points +12.");
                break;
            case 2:
                spiritualPoints += 9;
                System.out.println("Helping a villager with a task fosters a sense of community. Spiritual Points +9.");
                break;
            case 3:
                spiritualPoints += 8;
                System.out.println("Learning traditional Himalayan cooking is a delightful experience. Spiritual Points +8.");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                exploreHimalayanVillages();
                return;
        }

        reachKedarnath();
    }

    private static void reachKedarnath() {
        System.out.println("\nYou finally arrive in Kedarnath, the abode of Lord Shiva.");
        System.out.println("1. Visit the Kedarnath Temple");
        System.out.println("2. Trek to Vasuki Tal");
        System.out.println("3. Meditate in the serene surroundings");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                spiritualPoints += 15;
                System.out.println("Visiting the Kedarnath Temple fills your heart with divine energy. Spiritual Points +15.");
                break;
            case 2:
                spiritualPoints += 20;
                System.out.println("Trekking to Vasuki Tal rewards you with breathtaking views. Spiritual Points +20.");
                break;
            case 3:
                spiritualPoints += 10;
                System.out.println("Meditating in the serene surroundings brings inner peace. Spiritual Points +10.");
                break;
            default:
                System.out.println("Invalid choice. Please choose again.");
                reachKedarnath();
                return;
        }

        endGame();
    }

    private static void endGame() {
        System.out.println("\nCongratulations! You have completed your enhanced spiritual journey to Kedarnath.");
        System.out.println("Your Pilgrim's Compass level: " + pilgrimCompassLevel);
        System.out.println("Total Spiritual Points: " + spiritualPoints);
        System.out.println("Thank you for playing!");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice (1, 2, 3): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // consume the invalid input
        }
        return scanner.nextInt();
    }
}
