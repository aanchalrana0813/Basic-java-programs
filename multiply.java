import java.util.*;

public class multiply {

  public static int productOfNumbers(int a, int b){
    int product = a*b;;
    return product;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();
    int product = productOfNumbers(a, b);
    System.out.println("The product of numbers is" + product);
  }
}
