package sub08;

import java.io.File;
import java.io.FileWriter;

public class Test09 {

		public static void main(String[] args) {
			
			String path = "c:\\Users\\java1\\Desktop\\Gugudan.txt";
			
			try {
				File file = new File(path);
				FileWriter fw = new FileWriter(file);
				
				for (int x = 2; x <=9; x++) {
					fw.write(x + "단\n");
					
					for (int y = 1; y <=9; y++) {
						int z = x * y;
						fw.write(x + "x" + y + "=" + z + "\n");
					}
				}
				
				fw.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("구구단 파일 생성 완료..");
		}
}
