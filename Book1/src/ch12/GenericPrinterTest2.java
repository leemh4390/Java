package ch12;

public class GenericPrinterTest2 {
		public static void main(String[] args) {
			
			GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
			powderPrinter.setMaterial(new Powder());
			powderPrinter.printing();
			
			GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
			plasticPrinter.setMaterial(new Plastic());
			plasticPrinter.printing();
			
		}
}
