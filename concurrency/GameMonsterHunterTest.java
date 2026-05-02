package com.depth.concurrency;

public class GameMonsterHunterTest {
	public static void main(String[] args) {
		GameMonsterHunter gameMonsterHunter = new GameMonsterHunter();
		
		MonsterHunter hunter = new MonsterHunter(gameMonsterHunter);
		MonsterAdder adder = new MonsterAdder(gameMonsterHunter);
		
		Thread t1 = new Thread(hunter,"Monster Hunter Thread");
		Thread t2 = new Thread(adder,"Monster Adder Thread");
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----- CURRENT COUNT ----- :: "+gameMonsterHunter.getCurrentMonsterCount());
		Thread.interrupted();
	}

}
