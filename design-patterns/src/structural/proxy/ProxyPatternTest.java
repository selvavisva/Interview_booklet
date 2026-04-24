package structural.proxy;

public class ProxyPatternTest {
	public static void main(String[] args) {
		ProxyVideo video = new ProxyVideo("file1.mp4");
		/*
		 * Thread t1 = new Thread (() -> { for(int i=0;i<10;i++) { video.play(); } });
		 * t1.start();
		 */
		

			Thread t1 = new Thread(() -> {
				video.play();
			});

			Thread t2 = new Thread(() -> {
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				video.play();
			});

			Thread t3 = new Thread(() -> {
				try {
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				video.play();
			});

			t1.start();
			t2.start();
			t3.start();
		
	}

}

