import java.util.Random;


public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        int rollNumber = 0;
        int die1, die2, die3;

        System.out.printf("%-4s %-6s %-6s %-6s %-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------");

        do {
            rollNumber++;
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%-4d %-6d %-6d %-6d %-6d%n", rollNumber, die1, die2, die3, sum);
        } while (!(die1 == die2 && die2 == die3));
    }
}
