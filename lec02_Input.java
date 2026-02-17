package lecture;

//class name capital sai shuru hota hai aur method ya function small sai hota hai aur uske aaage () laga hota hai

import java.util.Scanner;

public class lec02_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte byteNumber = sc.nextByte();
		short shortNumber=sc.nextShort();
		int intNumber =sc.nextInt();
		long longNumber =sc.nextLong();
		float floatNumber =sc.nextFloat();
		double doubleNumber = sc.nextDouble();
		sc.nextLine();
		
//		char character= sc.nextChar();//method * (not allowed)
		
		char character= sc.next().charAt(0);
		boolean bool =sc.nextBoolean();
		
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);
		System.out.println(longNumber);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(character);
		System.out.println(bool);
		
	}
}