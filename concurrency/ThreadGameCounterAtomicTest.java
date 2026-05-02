package com.depth.concurrency;

public class ThreadGameCounterAtomicTest {
	public static void main(String[] args) {
		GameCounter gameCounter = new GameCounter();
		GamePlayer player1 = new GamePlayer(gameCounter);
		GamePlayer player2 = new GamePlayer(gameCounter);
		
		Thread t1 = new Thread(player1); t1.setName("Player 1");
		Thread t2 = new Thread(player2); t2.setName("Player 2");
		
		t1.start();
		t2.start();
		
	}
}
