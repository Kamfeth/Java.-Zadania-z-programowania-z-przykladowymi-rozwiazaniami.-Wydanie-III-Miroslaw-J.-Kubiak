import java.util.Scanner;

class Zadanie
{
  public static void main(String[] args)
  {
    final Scanner skaner = new Scanner(System.in);
    System.out.print("Wprowadź wartość promienia kuli: ");
    final double r = skaner.nextDouble();
    final double objetosc = 4 * Math.PI * Math.pow(r, 3) / 3;
    System.out.printf("Objętość kuli o promieniu %.2f wynosi: %.2f\n", r, objetosc);
  }
}