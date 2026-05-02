package com.depth.concurrency;

public class ThreadGameCounterAtomicWithJoin {
	public static void main(String[] args) {
		GameCounter gameCounter = new GameCounter();
		GamePlayer player1 = new GamePlayer(gameCounter);
		GamePlayer player2 = new GamePlayer(gameCounter);
		GamePlayer player3 = new GamePlayer(gameCounter);
		GamePlayer player4 = new GamePlayer(gameCounter);
		GamePlayer player5 = new GamePlayer(gameCounter);
		
		Thread t1 = new Thread(player1); t1.setName("Player 1");
		Thread t2 = new Thread(player2); t2.setName("Player 2");
		Thread t3 = new Thread(player3); t3.setName("Player 3");
		Thread t4 = new Thread(player4); t4.setName("Player 4");
		Thread t5 = new Thread(player5); t5.setName("Player 5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			
		}catch(InterruptedException exp) {
			exp.printStackTrace();
		}
		System.out.println("Counter final value :: "+gameCounter.get());
		
	}
}
