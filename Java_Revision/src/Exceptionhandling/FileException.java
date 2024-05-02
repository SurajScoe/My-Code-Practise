package Exceptionhandling;

public class FileException extends Exception {
	public FileException(String str,Throwable e) {

		super(str,e);
	}
}
