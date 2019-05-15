package vo;

public class empDept {
	private int id;
	private	String last_name;
	private	int salary;
	private String dept_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "empDept [id=" + id + ", last_name=" + last_name + ", salary=" + salary + ", dept_name=" + dept_name
				+ "]";
	}
}
