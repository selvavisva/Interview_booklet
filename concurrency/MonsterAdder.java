package com.depth.concurrency;

public class MonsterAdder implements Runnable{
	private GameMonsterHunter gameMonsterHunt;
	
	public MonsterAdder(GameMonsterHunter gameMonsterHunt) {		
		this.gameMonsterHunt=gameMonsterHunt;
	}
	
	public void run() {		
		for(int i=1;i<=5;i++) {	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gameMonsterHunt.addMonster(i);
		}		
	}
}
