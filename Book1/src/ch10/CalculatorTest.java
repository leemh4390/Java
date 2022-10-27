package ch10;

public class CalculatorTest {
		public static void main(String[] args) {
			
			int num1 = 10;
			int num2 = 5;
			
			CompleteCalc calc = new CompleteCalc();
			System.out.println(calc.add(num1, num2));
			System.out.println(calc.substract(num1, num2));
			System.out.println(calc.times(num1, num2));
			System.out.println(calc.divide(num1, num2));
			calc.showInfo();
			calc.descripion();
			
			//int [] arr = new int[] {1,2,3,4,5}; O
			//int [] arr = new int[5] {1,2,3,4,5}; <-- 오류 발생
			//int[] arr = {1,2,3,4,5}; O
			
			int[] arr;
			arr = new int[] {1,2,3,4,5};
			
			System.out.println(Calc.total(arr));
		}
}
