import java.util.Scanner;
class FinacialApp
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter subtotal :");
double subtotal = sc.nextDouble();
System.out.print("enter tip rate :");
double tiprate = sc.nextDouble();

double tip = (subtotal/100)*tiprate;
System.out.println(tip);
}
}


