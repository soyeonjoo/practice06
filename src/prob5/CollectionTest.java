package prob5;

import java.util.LinkedList;
import java.util.List;

import prob6.Board;
import prob6.BoardDao;

public class CollectionTest {

	public static void main(String[] args) {
		/* board 객체를 저장하는 boarList 변수를 정의하세요 */
		 Board boo= new Board(); 
		List<Board> boarList = new LinkedList();
		
		// List<Board> list = boo.getBoardList();
			
		
	//	Map.
		/* 키:학번, 값:점수  를 저장할 수 있는 켈렉션을 정의 하세요.*/
		 
	}

}
/*[문제 5]
단일 스레드 환경에서 Board 객체를 저장 순서에 맞게 일고 싶습니다. 
가장 적합한 컬렉션을 생성하도록 코드를 작성해 보세요. 
그리고 단일 스레드 환경에서 학번을 키로, 점수를 값으로 저장하는 가장 적합한 컬렉션을 생성하도록 코드를 작성해 보세요, list 사용 arraylist 나 linkedlist 사용
*/