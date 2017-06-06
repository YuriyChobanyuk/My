package algoritm_lab_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть коефіцієнти рівняння");
		System.out.println("Введіть а");
		a = scan.nextDouble();
		System.out.println("Введіть b");
		b = scan.nextDouble();
		System.out.println("Введіть c");
		c = scan.nextDouble();
		
		double disc;
		double x1, x2;
		disc = b * b - 4 * a * c;
		if(disc < 0){
			System.out.println("Рівняння коренів немає");
		} 
		else {
			x1 = (-b + Math.sqrt(disc))/(2 * a);
			x2 = (-b - Math.sqrt(disc))/(2 * a);
			System.out.println("Корені рівняння" + x1 + " та " + x2);
		}
		scan.close();
	}

}
