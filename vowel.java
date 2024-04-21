import java.util.Scanner;
class Vowel
{
  public static void main(String [] args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the name :");
  String name = sc.next();
  char ch = name.charAt(0);
  System.out.println("hi my name is "+name+" and my first character is "+ ch);
  
  if(ch =='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u')
  {
    System.out.println("charcter "+ ch +"is a vowel.");
  }
  else
  {
    System.out.println("character "+ ch +"is a consonent.");
  
  }
  }
