package SimpleTask;

/**
 * Created by Yura Yarema
 */

public class Associate_professors {

	private String associate_professors_name;
	
	private int salary;

	public Associate_professors(String associate_professors_name, int salary) {
		this.associate_professors_name = associate_professors_name;
		this.salary = salary;
	}

	public Associate_professors() {
	}

	public String getAssociate_professors_name() {
		return associate_professors_name;
	}

	public void setAssociate_professors_name(String associate_professors_name) {
		this.associate_professors_name = associate_professors_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Associate_professors [associate_professors_name="
				+ associate_professors_name + ", salary=" + salary + "]";
	}
	
	

}
