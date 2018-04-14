package SimpleTask;

/**
 * Created by Yura Yarema
 */

public class Department {
	
	private String department_name;
	
	private int employee_count;
	
	private Head_of_department head_of_department;
	
	private Professors professors;
	
	private Associate_professors associate_professors;
	
	private Assistant assistant;

	public Department(String department_name, int employee_count,
			Head_of_department head_of_department, Professors professors,
			Associate_professors associate_professors, Assistant assistant) {
		this.department_name = department_name;
		this.employee_count = employee_count;
		this.head_of_department = head_of_department;
		this.professors = professors;
		this.associate_professors = associate_professors;
		this.assistant = assistant;
	}

	public Department() {
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getEmployee_count() {
		return employee_count;
	}

	public void setEmployee_count(int employee_count) {
		this.employee_count = employee_count;
	}

	public Head_of_department getHead_of_department() {
		return head_of_department;
	}

	public void setHead_of_department(Head_of_department head_of_department) {
		this.head_of_department = head_of_department;
	}

	public Professors getProfessors() {
		return professors;
	}

	public void setProfessors(Professors professors) {
		this.professors = professors;
	}

	public Associate_professors getAssociate_professors() {
		return associate_professors;
	}

	public void setAssociate_professors(Associate_professors associate_professors) {
		this.associate_professors = associate_professors;
	}

	public Assistant getAssistant() {
		return assistant;
	}

	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((assistant == null) ? 0 : assistant.hashCode());
		result = prime
				* result
				+ ((associate_professors == null) ? 0 : associate_professors
						.hashCode());
		result = prime * result
				+ ((department_name == null) ? 0 : department_name.hashCode());
		result = prime * result + employee_count;
		result = prime
				* result
				+ ((head_of_department == null) ? 0 : head_of_department
						.hashCode());
		result = prime * result
				+ ((professors == null) ? 0 : professors.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (assistant == null) {
			if (other.assistant != null)
				return false;
		} else if (!assistant.equals(other.assistant))
			return false;
		if (associate_professors == null) {
			if (other.associate_professors != null)
				return false;
		} else if (!associate_professors.equals(other.associate_professors))
			return false;
		if (department_name == null) {
			if (other.department_name != null)
				return false;
		} else if (!department_name.equals(other.department_name))
			return false;
		if (employee_count != other.employee_count)
			return false;
		if (head_of_department == null) {
			if (other.head_of_department != null)
				return false;
		} else if (!head_of_department.equals(other.head_of_department))
			return false;
		if (professors == null) {
			if (other.professors != null)
				return false;
		} else if (!professors.equals(other.professors))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [department_name=" + department_name
				+ ", employee_count=" + employee_count
				+ ", head_of_department=" + head_of_department
				+ ", professors=" + professors + ", associate_professors="
				+ associate_professors + ", assistant=" + assistant + "]";
	}
	
	
	

}
