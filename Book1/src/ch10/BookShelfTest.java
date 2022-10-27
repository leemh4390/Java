package ch10;

public class BookShelfTest {
		public static void main(String[] args) {
			
			Queue ShelfQueue = new BookShelf();
			ShelfQueue.EnQueue("태백산맥 1");
			ShelfQueue.EnQueue("태백산맥 2");
			ShelfQueue.EnQueue("태백산맥 3");
			
			System.out.println(ShelfQueue.deQueue());
			System.out.println(ShelfQueue.deQueue());
			System.out.println(ShelfQueue.deQueue());
		}
}
