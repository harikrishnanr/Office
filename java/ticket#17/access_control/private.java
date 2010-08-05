class base {

	private int i = 10;

	int fun() {
		return i;
	}
}

class fun {

	public static void main(String args[]) {

		base b = new base();
//		System.out.println(b.i);
		System.out.println(b.fun());

	}
}
