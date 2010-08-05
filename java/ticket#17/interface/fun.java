interface Bicycle {

	void changeGear(int g);
	void changeSpeed(int accelerate, int time);
}

class BSA implements Bicycle {

	public void changeGear(int g) {
	}

	public void changeSpeed(int accelerate, int time) {
	}
}

class fun {

	public static void main(String args[]) {

		BSA b  = new BSA();
	}
}	
