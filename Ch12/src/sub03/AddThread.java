package sub03;

public class AddThread extends Add implements Runnable{

		private int start;
		private int end;
	
		public AddThread(int start, int end) {
			this.start = start;
			this.end = end;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int k = start; k <= end; k++) {
			setNum(k);
			
		}
		
	}

}
