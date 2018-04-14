package SimpleTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Yura Yarema
 */

public class Main {

	public static final Scanner sc = new Scanner(System.in);
	public static final List<Department> list = new ArrayList<>();

	public static void main(String[] args) {

		list.add(new Department("KSA", 20, new Head_of_department(
				"Yura Yarema", 400), new Professors("Vasyl Raduk", 390),
				new Associate_professors("Pavlo Kharambura", 380),
				new Assistant("Diana Zavadska", 360)));
		
		
		while (true) {
			System.out.println("Enter 1 to find out the head of the department.");
			System.out.println("Enter 2 to view department statistics.");
			System.out
					.println("Enter 3 to calculate the average salary of the department.");
			System.out
					.println("Enter 4 to find out the number of employees in the department.");
			System.out.println("Enter 5 to find workers by name.");
			switch (sc.next()) {
			case "1":
				Methods.findByHeadOfDepartment();
				break;
			case "2":
				Methods.showStatistic();
				break;
			case "3":
				Methods.avarageSalary();
				break;
			case "4":
				Methods.findCountOfEmployee();
				break;
			case "5":

				while (true) {
					System.out
							.println("Enter 1 to find the head of the department.");
					System.out.println("Enter 2 to find an associate professor.");
					System.out
							.println("Enter 3 to find a professor.");
					System.out
							.println("Enter 4 to find an assistant.");
					switch (sc.next()) {
					case "1":
						Methods.findByHeadOfDepartment();
						break;
					case "2":
						Methods.FindByDoc();
						break;
					case "3":
						Methods.FindByPro();
						break;
					case "4":
						Methods.FindByAss();
						break;
					default:
						break;
					}
				}
			default:
				break;
			}
		}

	}
}
