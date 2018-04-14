package SimpleTask;

/**
 * Created by Yura Yarema
 */

public class Head_of_department {

	private String head_of_department_name;
	
	private int salary;

	public Head_of_department(String head_of_department_name, int salary) {
		this.head_of_department_name = head_of_department_name;
		this.salary = salary;
	}

	public Head_of_department() {
	}

	public String getHead_of_department_name() {
		return head_of_department_name;
	}

	public void setHead_of_department_name(String head_of_department_name) {
		this.head_of_department_name = head_of_department_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Head_of_department [head_of_department_name="
				+ head_of_department_name + ", salary=" + salary + "]";
	}
	
	
}
