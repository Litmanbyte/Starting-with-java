package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
public class prog {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee he = new Employee();
		System.out.print("Name :");
		he.name = sc.nextLine();
		System.out.print("Gross Salary :");
		Employee.grossSal = sc.nextDouble();
		System.out.print("Tax :");
		Employee.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee :"+he.name+", "+Employee.netSal());
		System.out.println();
		System.out.println("will increase by how much?");
		Employee.porct = sc.nextDouble();
		System.out.println();
		System.out.println("updated data :"+Employee.increaseSal());
	

	}

}
