package com.depth.concurrency;

public class GamePlayer implements Runnable{
	private GameCounter gameCounter;
	
	GamePlayer(GameCounter gameCounter){
		this.gameCounter=gameCounter;
	}
	
	public void run() {
		int count=0;
		while(count<10) {
			System.out.println(Thread.currentThread().getName()+" :: "+gameCounter.increment());
			count++;
		}
		
	}
}