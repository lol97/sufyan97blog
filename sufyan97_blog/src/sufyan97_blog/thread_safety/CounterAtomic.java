package sufyan97_blog.thread_safety;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {
	private AtomicInteger count = new AtomicInteger(0);
	
	public static void main(String[] args) {
		CounterAtomic counter = new CounterAtomic();

		for (int i = 1; i <= 5; i++) {
			System.out.print("running count at - " + i + " -> ");
			counter.countThread();
		}
	}
	
	public void increment() {
		count.incrementAndGet();
	}

	public int getCount() {
		return count.get();
	}
	
	public void resetCount() {
		count = new AtomicInteger();
	}
	
	public void countThread() {
		resetCount();
		// Membuat beberapa thread yang akan menjalankan increment secara bersamaan
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		});

		thread1.start();
		thread2.start();

		// Menunggu kedua thread selesai
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Count With Atomic : " + getCount());
	}
}
