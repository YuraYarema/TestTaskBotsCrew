package SimpleTask;

import java.util.Iterator;


/**
 * Created by Yura Yarema
 */

public class Methods extends Main {

	static void findByHeadOfDepartment() {
		for (Department department : list) {
			System.out.println("Head of Department : "
					+ department.getHead_of_department()
							.getHead_of_department_name());
		}
	}

	static void showStatistic() {
		for (Department department : list) {
			System.out.println("Assistant : "
					+ department.getAssistant().getAssistant_name());
			System.out.println("Associate professor : "
					+ department.getAssociate_professors()
							.getAssociate_professors_name());
			System.out.println("Professor : "
					+ department.getProfessors().getProfessors_name());
		}
	}

	static void avarageSalary() {
		for (Department department : list) {
			int head = department.getHead_of_department().getSalary();
			int ass = department.getAssistant().getSalary();
			int doc = department.getAssociate_professors().getSalary();
			int pro = department.getProfessors().getSalary();
			int res = (head + ass + doc + pro) / 4;
			System.out.println("The average salary of the department is: " + res
					+ " $");
		}
	}

	static void findCountOfEmployee() {
		for (Department department : list) {
			System.out.println("There are  : "
					+ department.getEmployee_count() + "people in the department");
		}
	}

	static void FindByHeadOFDep() {
		System.out.println("Enter name");
		String name = sc.next();
		Iterator<Department> iter = list.iterator();
		while (iter.hasNext()) {
			Department department = iter.next();
			if (department.getHead_of_department().getHead_of_department_name()
					.contains(name)) {
				System.out.println(department);
			}
		}
	}

	static void FindByDoc() {
		System.out.println("Enter name");
		String name = sc.next();
		Iterator<Department> iter = list.iterator();
		while (iter.hasNext()) {
			Department department = iter.next();
			if (department.getAssociate_professors()
					.getAssociate_professors_name().contains(name)) {
				System.out.println(department);
			}
		}
	}

	static void FindByPro() {
		System.out.println("Enter name");
		String name = sc.next();
		Iterator<Department> iter = list.iterator();
		while (iter.hasNext()) {
			Department department = iter.next();
			if (department.getProfessors().getProfessors_name().contains(name)) {
				System.out.println(department);
			}
		}
	}

	static void FindByAss() {
		System.out.println("Enter name");
		String name = sc.next();
		Iterator<Department> iter = list.iterator();
		while (iter.hasNext()) {
			Department department = iter.next();
			if (department.getAssistant().getAssistant_name().contains(name)) {
				System.out.println(department);
			}
		}
	}

}
