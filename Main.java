import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new 
      Scanner(System.in);
      System.out.println("enter age:");
      int age = sc.nextInt();
      if (age == 18) {
        for (int i = 1; i <= 5; i++) {
          System.out.println(i);
        }
        System.out.println("exactly 18");
      } else  if (age > 18) {
        System.out.println("can vote");
      } else {
        System.out.println("nope");
      }
    }
}         