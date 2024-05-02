package Exceptionhandling;

import java.io.FileInputStream;

public class CheckedExc {
	
public static void main(String[] args) {
	FileInputStream file;
	try {
		 file = new FileInputStream("file.txt");
	} catch (Exception e) {
		// TODO: handle exception
		try {
			throw new FileException("This is file is not found !!",e);
		}catch (Exception e1) {
			// TODO: handle exception
			e1.getMessage();
			e1.printStackTrace();
		}
	}
}
}
