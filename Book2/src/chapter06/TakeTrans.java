package chapter06;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James",5000); 
		Student studentTomas = new Student(); 
		studentTomas.studentName = "Tomas";
		studentTomas.money = 10000;
		Student studentLee = new Student();
		studentLee.studentName = "이민혁";
		studentLee.money = 20000;
		
		Bus bus100 = new Bus("부산",100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi = new Taxi(200);
		studentLee.takeTaxi(taxi);
		studentLee.showInfo();
		taxi.showinfo();
		
	}
}
