package demo;

class pressure extends Thread {
	static int p;
	
	void delay(int n){
		int i, j;
		for(i = 0; i < n; i++)
			j = 1;
	}
	
	public void run() {
		int i, t;
		for(i = 0; i < 10000; i++) {
			t = p;
			delay(1000);
			p = t + 1;
		}
	}
}

public class Main {

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
