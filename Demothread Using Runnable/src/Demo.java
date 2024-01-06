import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "kodnest";

    System.out.println("enter the number of integer");
    Scanner scan = new Scanner(System.in);

    int i2 = scan.nextInt();

    System.out.println("enter the number of double");
    double d2 = scan.nextDouble();

    // Consume the leftover newline
    scan.nextLine();


    System.out.println("enter the string");
    String s1 = scan.nextLine();

    scan.close();

    System.out.println(i + i2);
    System.out.println(d + d2);
    System.out.println(s + " " + s1);
  }
}