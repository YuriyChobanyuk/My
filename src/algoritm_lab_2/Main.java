package algoritm_lab_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ����������� �������");
		System.out.println("������ �");
		a = scan.nextDouble();
		System.out.println("������ b");
		b = scan.nextDouble();
		System.out.println("������ c");
		c = scan.nextDouble();
		
		double disc;
		double x1, x2;
		disc = b * b - 4 * a * c;
		if(disc < 0){
			System.out.println("г������ ������ ����");
		} 
		else {
			x1 = (-b + Math.sqrt(disc))/(2 * a);
			x2 = (-b - Math.sqrt(disc))/(2 * a);
			System.out.println("����� �������" + x1 + " �� " + x2);
		}
		scan.close();
	}

}
