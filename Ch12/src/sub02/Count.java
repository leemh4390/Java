package sub02;

public class Count {
		
		private int num;
		
		public int getNum() {
			return num;
		}
		
		//동기화 블럭 : 스레드 간 경합을 막고 동기방식으로 실행
		public synchronized void setNum() {
			num++;
		}
}
