import java.util.Deque;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.peek());
		// System.out.println(q.element());
		for (int i = 0; i <= 10; i++) {
			q.offer(i);
			
		}
		//
		
		System.out.println(q);
		System.out.println("First Polling  "+q.poll());
		//System.out.println(q);
		System.out.println("Second Polling  "+q.poll());
		System.out.println(q);
		System.out.println(q.peek());
	}

}
