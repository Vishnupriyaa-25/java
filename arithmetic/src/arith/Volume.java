package arith;

import java.util.Scanner;

public class Volume {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	float PI = 3.14f;
	Scanner Sc = new Scanner ("System.in");
	System.out.println("Enter the radius:");
	float r = Sc.nextFloat();
	System.out.println("Enter the height:");
	float h = Sc.nextFloat();
	float volume = PI*r*r*h;
	System.out.println("Enter the volume:" +volume);


		}

	}

