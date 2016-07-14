package prob7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;     // 최고 점수
		int totalScore = 0;   // 점수 합계
		
		/* 코드를 작성하세요 */
		Set<String> set = map.keySet();
		//돌면서 네임에 셋팅  맵 순회
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
		String key = it.next();
		int value = map.get(key);
		if(maxScore<value){
		maxScore = value;
		
		name = key ;
		}
		totalScore+=value;
		}
		System.out.println("평균점수: "+totalScore/3);
		System.out.println("최고 점수: "+maxScore);
		System.out.println("최고 점수를 받은 아이디: "+name);
	}
}