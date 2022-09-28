package teste;

import java.util.Scanner;

public class Equacao2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			System.out.print("Digite valor de a: ");
			double a = input.nextDouble();
		
			System.out.print("Digite valor de b: ");
			double b = input.nextDouble();
			System.out.print("Digite valor de c: ");
			double c = input.nextDouble();
			double d= b * b - 4.0 * a * c;
		if (d> 0.0)
		{
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("As raízes são " + r1 + " e " + r2);
		}
		else if (d == 0.0)
		{
			double r1 = -b / (2.0 * a);
			System.out.println("A ráis é " + r1);
		}
		else
		{
			System.out.println("Raíz não é real.");
		}

	}

}
