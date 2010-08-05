package com.example;

class coffee extends Thread {
	public void run(){
		for(;;)
			System.out.println("THe Coffee is Ready");
	}
}

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coffee c = new coffee();
		c.start();
		for(;;)
			System.out.println("THe Man in thirsty");
		

	}

}
