//Demonstrate the Inheritance and overloading

class base {

	void ring(int i) {
		System.out.println("Integer");
	}

	void ring(double j) {
		System.out.println("Double");
	}
}

class abc {
}

class def extends base  {
	
 	int ring(abc a) {
		System.out.println("abc");
		return 1;
	}
}

class fun {

	public static void main(String args[]) {
		
		abc a = new abc();
		def d = new def();
		/* ring method is called according to the arguments
		 */   
		d.ring(2);
		d.ring(2.3);
		d.ring(a);
	}
}
