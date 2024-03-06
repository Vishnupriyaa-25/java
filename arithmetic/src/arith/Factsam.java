package arith;
import java.util.*;
public class Factsam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,f = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
n = sc.nextInt();
for(i=1;i<=n;i++)
{
	f=f*i;
}
System.out.println("factorial of "+n+" "+f);


	


	}

}
