package com.depth.concurrency;

public class MonsterHunter implements Runnable{
	
	private GameMonsterHunter gameMonsterHunt;
	
	public MonsterHunter(GameMonsterHunter gameMonsterHunt) {		
		this.gameMonsterHunt=gameMonsterHunt;
	}
	
	public void run() {		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			gameMonsterHunt.huntMonster(i);
		}		
	}

}
