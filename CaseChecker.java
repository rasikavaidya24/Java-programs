import java.util.Scanner;

class CaseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        // Check if it is an alphabet
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
        {
            if (Character.isUpperCase(ch)) 
           {
                System.out.println(ch + " is an uppercase alphabet.");
           } 
             else 
             {
                System.out.println(ch + " is a lowercase alphabet.");
             }
           }    
             else 
             {
                System.out.println(ch + " is not an alphabet.");
             }

       
    }
}
