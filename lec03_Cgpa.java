package lecture;

import java.util.Scanner;

public class lec03_Cgpa {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		float inputCgpa =  sc.nextFloat();
		if(inputCgpa >= 9){
			System.out.println("BIKE");
		}
		else if(inputCgpa >= 8 && inputCgpa < 9){
			System.out.println("BIKE");
		}
		else if(inputCgpa >= 7 && inputCgpa < 8){
			System.out.println("NOKIA");
		}
		else if(inputCgpa >= 6 && inputCgpa < 7){
			System.out.println("DINNER IN 3 STAR");
		}
		else {
			System.out.println("BETTER LUCK NEXT TIME");
		}
	}
}