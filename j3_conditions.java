//demo of if-else condition usage
import java.util.*;
public class j3_conditions {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=scan.nextInt();
	if(n%2==0)
		System.out.println("Weird");
	else if(n%2==0 && n>=2 && n<=5)
		System.out.println("Not weird");
	else if(n%2==0 && n>20)
		System.out.println("Not weird");
	scan.close();
	}
}
