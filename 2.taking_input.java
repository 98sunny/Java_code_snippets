import java.util.*;
public class taking_input {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);//making a scan input object
			int a,b,c;//declaration of integer variable
			String d,e,f;
			System.out.println("Enter numbers\n");//taking integer inputs
			a=scan.nextInt();
			b=scan.nextInt();
			c=scan.nextInt();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("Enter string\n");//taking string inputs
			d=scan.next();
			e=scan.next();
			f=scan.next();
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
		}
}
