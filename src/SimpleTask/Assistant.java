package SimpleTask;

/**
 * Created by Yura Yarema
 */

public class Assistant {

	private String assistant_name;
	
	private int salary;

	public Assistant(String assistant_name, int salary) {
		this.assistant_name = assistant_name;
		this.salary = salary;
	}

	public String getAssistant_name() {
		return assistant_name;
	}

	public void setAssistant_name(String assistant_name) {
		this.assistant_name = assistant_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Assistant() {
	}

	@Override
	public String toString() {
		return "Assistant [assistant_name=" + assistant_name + ", salary="
				+ salary + "]";
	}
	
	
}
