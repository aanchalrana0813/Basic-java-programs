import java.util.*;

public class table {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you want the table of");
    int a = sc.nextInt();
    for(int i =1; i<=10; i++){
      int res = a*i;
      System.out.println(a+ "*" +i+ "=" +res);
    }
    
  }
}
