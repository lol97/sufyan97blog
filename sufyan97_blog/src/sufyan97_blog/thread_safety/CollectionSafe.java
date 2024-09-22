package sufyan97_blog.thread_safety;

import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionSafe {
	private CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {
		CollectionSafe coSafe = new CollectionSafe();

		for (int i = 1; i <= 5; i++) {
			System.out.print("running count at - " + i + " -> ");
			coSafe.countThread();
		}
	}

	public void addElement(Integer element) {
		list.add(element);
	}

	public Integer getElement(int index) {
		return list.get(index);
	}

	public void resetData() {
		list.clear();
	}

	public void countThread() {
		resetData();
		// Membuat beberapa thread yang akan menjalankan increment secara bersamaan
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				addElement(i);
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				addElement(i);
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

		System.out.println("Final size collection : " + list.size());
	}
}
