package prob4;

public interface Stack {//구현하기 
	public void push(String item);
	public String pop() throws MyStackEmptyException;
	public boolean isEmpty();
	public int size();
	
	
}