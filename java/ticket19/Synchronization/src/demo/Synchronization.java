package demo;

class lock{}



class pressure extends Thread {
	static int p;
	static lock L = new lock();
	
	void delay(int n){
		int i, j;
		for(i = 0; i < n; i++)
			j = 1;
	}
	
	void update() {
		int t;
		synchronized (L) {
			t = p;
			delay(1000);
			p = t + 1;	
		}
	}
	
	
	public void run() {
		int i; 
		for(i = 0; i < 10000; i++) {
				update();
		}
	}
}


public class Synchronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pressure p1 = new pressure();
		pressure p2 = new pressure();
		
		p1.start();
		p2.start();
		
		try { 
			p1.join();
			p2.join();
		} catch (InterruptedException e){}
		
		System.out.println(pressure.p);

	}

}
