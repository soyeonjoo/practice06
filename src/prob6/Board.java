package prob6;

public class Board {
	private String title;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}/*
[문제 6]
BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴합니다.
ListExample 클래스를 실행 시켰을 때 다음과 같이 출력될 수 있도록 BoardDao 클래스를 작성하세요.*/