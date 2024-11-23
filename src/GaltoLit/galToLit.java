package GaltoLit;
import java.util.Scanner;

public class galToLit

{
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

	    double litros = 3.875;

		System.out.println("Quantos galoes?");

		int galões = sc.nextInt();

		System.out.println("a quantidade e " + galões*litros + " litros");

	}

}