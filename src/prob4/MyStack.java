package prob4;

public class MyStack implements Stack {
	String[] buffer=null ;
	int position = 0;
	public MyStack(int capacity){
		buffer = new String[capacity];
	
		
	}
	
	@Override
	public void push(String item) {
		
		buffer[position] = item;
		position ++;
		if(position+1 == buffer.length){
			resize();
		}
	}

	@Override
	public String pop() throws MyStackEmptyException {

		if(position==-1){
			throw new MyStackEmptyException();//???
		}
		return buffer[position--];
		
		
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}
	public void resize() {
		String[] temp = new String[ buffer.length * 2 ];  
		 		 
		 		// 새 버퍼에 복사 
		 		for( int i = 0; i <= position; i++ ) { 
		 			temp[ i ] = buffer[ i ]; 
		 		} 
		 		 
		 		// 버퍼를 새로 바꿈 
		 		buffer = temp;
	}

	
	@Override
	public int size() {
		int n = buffer.length; 
		
		return n;
	}

}
