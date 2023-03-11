import java.util.InputMismatchException;
import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    try
    {
      final Scanner skaner = new Scanner(System.in);
      System.out.print("Wprowadź pierwszy bok prostokąta: ");
      final double a = skaner.nextDouble();
      System.out.print("Wprowadź drugi bok prostokąta: ");
      final double b = skaner.nextDouble();
      final double pole = a * b;
      System.out.println("Pole prostokąta jest równe " + pole);
    }
    catch (InputMismatchException wyjatek)
    {
      System.out.println("Błąd programu: wprowadzono nieprawidłową wartość boku prostokąta!");
    }
  }
}