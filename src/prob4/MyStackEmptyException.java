package prob4;

public class MyStackEmptyException extends Exception {

	public MyStackEmptyException(){
		super("  다출력함 ");
	}
	public MyStackEmptyException(String message){
		super(message);
	}
}
