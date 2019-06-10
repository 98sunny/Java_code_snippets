//In this code, it shows how we can string inputs after the integer or double values.
/*
 * If you use the nextLine() method immediately following the nextInt() method, 
 * recall that nextInt() reads integer tokens; because of this, the last newline 
 * character for that line of integer input is still queued in the input buffer 
 * and the next nextLine() will be reading the remainder of the integer line (which is empty).
 * */
import java.util.*;
public class j4_input_output {
public static void main(String args[]) {
	 Scanner scan = new Scanner(System.in);
     //Scanner scan1 = new Scanner(System.in);
     int i = scan.nextInt();
     double d=scan.nextDouble();
     scan.nextLine();
     String s;
     s=scan.nextLine();
     // Write your code here.

     System.out.println("String: " + s);
     System.out.println("Double: " + d);
     System.out.println("Int: " + i);
}


}
