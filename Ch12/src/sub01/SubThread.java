package sub01;

public class SubThread extends Thread {

		private String name;
		
		
		public SubThread (String name) {
			this.name = name;
		}
		
		
		@Override
		public void run() {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i=0 ; i <= 10; i++) {
			System.out.println(name + "스레드 실행...");
		}
			
			System.out.println(name + "스레드 종료..");
			
		}
}
