import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            if (isDivisibleBy(number, i)) {
                System.out.println("The number " + number + " is divisible by " + i + " because " + getReason(number, i));
            } else {
                System.out.println("The number " + number + " is not divisible by " + i);
            }
        }
    }
    
    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
    
    public static String getReason(int number, int divisor) {
        switch (divisor) {
            case 1:
                return "every number is divisible by 1";
            case 2:
                return number % 2 == 0 ? "it is even" : "";
            case 3:
                return "the sum of its digits is divisible by 3";
            case 4:
                return "the last two digits form a number divisible by 4";
            case 5:
                return number % 10 == 0 ? "it ends with a 0" : "it ends with a 5";
            case 6:
                return "it is divisible by both 2 and 3";
            case 7:
                return "there's a tricky rule for 7: double the last digit and subtract it from the rest of the number, then check the result";
            case 8:
                return "the last three digits form a number divisible by 8";
            case 9:
                return "the sum of its digits is divisible by 9";
            default:
                return "";
        }
    }
}
































































