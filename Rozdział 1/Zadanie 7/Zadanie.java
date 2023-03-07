import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    final Scanner skaner = new Scanner(System.in);
    System.out.print("Wprowadź pierwszą liczbę: ");
    final float x = skaner.nextFloat();
    System.out.print("Wprowadź drugą liczbę: ");
    final float y = skaner.nextFloat();
    final double suma = x + y;
    final double roznica = x - y;
    final double iloczyn = x * y;
    final double iloraz = x / y;
    System.out.printf("%.2f + %.2f = %.2f\n", x, y, suma);
    System.out.printf("%.2f - %.2f = %.2f\n", x, y, roznica);
    System.out.printf("%.2f * %.2f = %.2f\n", x, y, iloczyn);
    System.out.printf("%.2f / %.2f = %.2f\n", x, y, iloraz);
  }
}