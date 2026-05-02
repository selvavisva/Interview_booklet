package com.depth.threads;

public class RunnerAlpha implements Runnable{
	private AlphabetIdentifier alphabetIdentifier;
	private char alphabet;
	private int identifier;
	
		RunnerAlpha(AlphabetIdentifier alphabetIdentifier, char alphabet, int identifier){
			this.alphabetIdentifier=alphabetIdentifier;
			this.alphabet=alphabet;
			this.identifier=identifier;
		}
		
		public void run() {			
			alphabetIdentifier.print(alphabet, identifier);
		}
}