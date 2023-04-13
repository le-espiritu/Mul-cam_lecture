package api.util;

import java.util.ArrayList;
//List는 중복이 허용된다.
public class ArrayListTest02 {
	public static void main(String[] args) {
		//String데이터가 저장될 ArrayList를 생성하고
		ArrayList<String> list = new ArrayList<String>();
		//java,oracle,swing,servlet,jsp의 문자열을 저장
		list.add("java");
		list.add("oracle");
		list.add("swing");
		list.add("servlet");
		list.add("jsp");
		list.add("servlet");
		list.add("jsp");
		//ArrayList에 저장된 모든 요소를 출력하기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//DM으로 전송
	}
}
