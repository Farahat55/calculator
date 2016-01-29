package e00;
import java.util.Scanner;
public class E00 {
    public static void main(String[] args) {
       
       int a,b,c,d,f;
       float e;
        
    System.out.println("Enter First number");
    Scanner input1 =  new Scanner(System.in);
    a = input1.nextInt();
  
  System.out.println("Enter First number");
  Scanner input2 =  new Scanner(System.in);
  b = input1.nextInt();
  c=a+b;
  System.out.println("Sum is " + c);
   d=b-a;
  System.out.println("sub is " + d);
  f=a*b;
  System.out.println("multi is " + f);
  e=b/a;
  System.out.println("divid is "+e);
 
    }
    
}
