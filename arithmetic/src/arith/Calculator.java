package arith;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Enter the operator do you want to calculate (+,-,*,/,%)");
char op = sc.next().charAt(0);
switch(op) {
case '+': System.out.println(a+b);
break;
case '-': System.out.println(a-b);
break;
case '*': System.out.println(a*b);
break;
case '/': System.out.println(a/b);
break;
case '%': System.out.println(a%b);
break;
default: System.out.println("Invalid");
break;
}




	}

}
