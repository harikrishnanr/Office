package example;


class Tea extends Thread {
	public void run(){
		for(;;)
			System.out.println("Hello");
	}
}



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea t = new Tea();
		t.start();
		for(;;)
			System.out.println("World");

	}

}
