package chapter08;

public class Employee {
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
}

public class Engineer extends Employee {
	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkilSet(String skillset) {
		this.skillset = skillset;
	}
	
}
