import java.util.Scanner;

class DigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check if the character is a digit
        if (Character.isDigit(ch)) 
        {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is not a digit.");
        }

    }
}
