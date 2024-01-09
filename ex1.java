package application;
import java.util.Locale;
import java.util.Scanner;
import entities.codes;
public class ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		codes dol = new codes();
		System.out.print("What is the cotation for today? ");
		codes.juros = sc.nextDouble();
		System.out.print("How many will you buy today?");
		codes.valI =  sc.nextDouble();
		System.out.print("In how much time do you intend to pay us back?");
		codes.qMes = sc.nextInt();
	System.out.print(dol.toString());
	}
}
