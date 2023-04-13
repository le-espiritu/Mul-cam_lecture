package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//다음과 같은 데이터를 HashMap에 저장하고 출력해보자.
		//id-jang, pass-1234,name-장동건, addr-서울,point-1000, deptno-100
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("id","jang");
		map1.put("pass","1234");
		map1.put("name","장동건");
		map1.put("addr","서울");
		map1.put("point","1000");
		map1.put("deptno","100");
		//HashMap에 저장된 데이터를 모두 꺼내서 출력하기
		//1. map에 저장된 모든 키를 꺼내기 - 저장된 모든 Key를 Set으로 변환하기
		Set<String> keylist = map1.keySet();
		
		//2. Set으로 변환된 keylist를 Iterator로 변환하기
		Iterator<String> it = keylist.iterator();
		
		//3. Iterator에 저장된 key 목록을 이용해서 HashMap에서 value를 추출
		while(it.hasNext()) {
			String key = it.next();
			String value = map1.get(key);
			System.out.println(key+":"+value);
		}
	}
}
