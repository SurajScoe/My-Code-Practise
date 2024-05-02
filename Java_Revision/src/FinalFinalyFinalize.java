import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinalFinalyFinalize {
	
	private final double PI = 3.14;
	
	public final void displayFinal(final double radius) {
		final double area = PI*radius*radius;
		System.out.println(area);
	}
	
	public void displayFinally() {
		FileReader file = null;
		
		try {
			file = new FileReader("myfile2.txt");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			//here closing the file whether the exception thrown or not
			if(file!=null) {
				try {
					file.close();
				}catch (IOException e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		}
	}
	
	@Override
	protected void finalize(){
		System.out.println("Inside the finalized method \n Garbage being collected");
		
	}
	
	public static void main(String[] args) {
		FinalFinalyFinalize f = new FinalFinalyFinalize();
		f.displayFinally();
		
		System.out.println(f.hashCode());
		
		f=null;
		
		//Calling a Garbage Collector
		System.gc();
		
		System.out.println("End of Garbage Collection !!");
		
	}
}
