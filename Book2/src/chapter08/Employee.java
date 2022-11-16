package chapter08;

public class Employee{
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
	
	public class Engineer extends Employee{
		public Engineer(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		
		private String skillset;
		public String getSkillSet() {
			return skillset;
		}
		public void setSkillSet(String skillset) {
			this.skillset = skillset;
		}
	}
}


