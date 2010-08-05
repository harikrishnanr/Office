import java.util.*;

class fun 
{
	public static void main(String args[]) {

		Vector<Object> V = new Vector<Object>();
		
		V.addElement(new Integer(1));

		V.addElement(new Integer(3));
		V.addElement(new Integer(4));
		V.addElement(new Integer(5));
		

		if (V.contains(new Integer(3)))
			System.out.println("Vector Contains 3");

		V.removeElementAt(2);
		Enumeration e = V.elements();

		while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
		System.out.println("Last Element: " +(Integer)V.lastElement());
		System.out.println("First Element: " +(Integer)V.firstElement());

	}
}
