//Assignment 4

package assign1;

import java.util.Scanner;

public class assign1 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		System.out.println("Enter a Byte Value:");		
		a = scan.nextByte();

		System.out.println("Enter a Short Value:");
		b = scan.nextShort();
		
		c = a + b;
		System.out.println(c);
		
		d  = b + c;
		System.out.println(d);
		
		e = c + d;
		System.out.println(e);
		
		f =  e+ d;
		System.out.println(f);
		
		scan.close();
	}
}