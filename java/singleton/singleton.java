class singletonObject {

	private singletonObject() { }
	private static singletonObject ref;

        public static singletonObject getSingletonObject() { 
		if(ref == null)
			ref = new singletonObject();
		return ref;	
	}

	void run() {
		System.out.println("Hello World");
	}

}

class fun {
	public static void main(String args[]) {
		singletonObject s;
		s = singletonObject.getSingletonObject();
		s.run();
			
	}
}
