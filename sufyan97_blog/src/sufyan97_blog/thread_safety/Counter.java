package sufyan97_blog.thread_safety;

public class Counter {
	private int count = 0;
	private int counter2 = 0;

	public static void main(String[] args) {
		Counter counter = new Counter();

		for (int i = 1; i <= 5; i++) {
			System.out.print("running count at - " + i + " -> ");
			counter.countThread();
		}
	}

	public void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public void resetCount() {
		count = 0;
		counter2 = 0;
	}

	public void countThread() {
		resetCount();

		// Membuat beberapa thread yang akan menjalankan increment secara bersamaan
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
				incrementSync();
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
				incrementSync();
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
		
		System.out.println();
		System.out.println("Final Count NOT SAFE : " + getCount());
		System.out.println("Final Count With Sync: " + getCountSync());
	}

	public synchronized void incrementSync() {
		counter2++;
	}

	public synchronized int getCountSync() {
		return counter2;
	}

}
