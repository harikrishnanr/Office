import java.io.*;

class fun7{
  public static void main(String args[])
  {
    int s;
	 try{
		while(true) {

			s = System.in.read();
			if (s == -1) break;
			System.out.print((char)s);
		}
	 }catch(IOException e){
	   System.out.println("IO error");
	 }
  }
}

