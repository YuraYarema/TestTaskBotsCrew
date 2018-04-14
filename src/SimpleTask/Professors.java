package SimpleTask;

/**
 * Created by Yura Yarema
 */

public class Professors {

	private String professors_name;
	
	private int salary;

	public Professors(String professors_name, int salary) {
		this.professors_name = professors_name;
		this.salary = salary;
	}

	public Professors() {
	}

	public String getProfessors_name() {
		return professors_name;
	}

	public void setProfessors_name(String professors_name) {
		this.professors_name = professors_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Professors [professors_name=" + professors_name + ", salary="
				+ salary + "]";
	}
	
	
}
