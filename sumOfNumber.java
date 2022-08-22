import java.util.*;

public class sumOfNumber {

  public static void sum(int a, int b){
    int c;
    c= a+b;
    System.out.println("Sum of numbers is" + c);

  }
  /* BY USING INT AS A RETURN TYPE
   * public static int sum(int a, int b){
    c= a+b;
    return c;
  }
   THIS LINE CAN BE ADDED TO THE MAIN FUNCTION

   int c = sum(a,b);
  System.out.println("Sum of numbers is" + c);
   */
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    sum(a,b);
  }
}
