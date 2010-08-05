import java.util.*;

class fun{

	public static void main(String argv[]){
		Vector v = new Vector();
    		v.add(new Integer(1));
    		v.add(new Integer(2));

		int i;
    		for(i = 0; i < v.size(); i++){
        		Integer iw =(Integer) v.get(i);
        		System.out.println(iw.intValue());
    		}
   	}
}

