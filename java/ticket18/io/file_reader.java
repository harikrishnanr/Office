import java.io.*;

class file_reader{
  public static void main(String args[])
  {
    FileReader f;
	 BufferedReader in;
	 String s;
	 try{
	   f = new FileReader("dat");
		in = new BufferedReader(f);
		while(true) {
			s = in.readLine();
			if (s == null) break;
			System.out.println(s);
		}
	 }catch(IOException e){
	   System.out.println("IO error");
	 }
  }
}

