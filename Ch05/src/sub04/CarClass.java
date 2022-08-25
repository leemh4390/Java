package sub04;

public class CarClass {

	private static CarClass car = new CarClass();
	
	public static CarClass getinstance() {
		return car;
	}
	
	private static boolean isUse = false;
	
	//차 사용 시작
	public static void drive() {
		isUse = true;
		System.out.println("Start Driving");
	}
	
	//차 사용 종료
	public static void parking() {
		isUse = false;
		System.out.println("parking");
	}
	
	
	public static boolean isEnableUseCar() {
		return !isUse;
	}
}
