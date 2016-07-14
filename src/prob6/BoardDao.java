package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList(){
	List<Board> list = new ArrayList<Board>();
	
	Board board1 = new Board();
	board1.setTitle("제목1");
	board1.setContent("내용1");
	
	Board board2 = new Board();
	board2.setTitle("제목2");
	board2.setContent("내용2");
	
	Board board3 = new Board();
	board3.setTitle("제목3");
	board3.setContent("내용3");
	
	
	list.add(board1);
	list.add(board2);
	list.add(board3);
	
	//Database 에서 데이터를 가져와서 
	//Board 객체를 만들고 리스트 저장
	//list.add();
	return list;
	
	}
	}
