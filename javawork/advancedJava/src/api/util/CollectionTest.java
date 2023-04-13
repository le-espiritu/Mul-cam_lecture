package api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

//���� for���� �̿��Ͽ� List,Set,Map�� ������ �� �ִ�.
//jdk5.0���Ŀ� ��밡���ϵ��� 
//for(���� : collection��ü){
//          ---------------
//              �ڷᱸ��
//   //�ݺ��ؼ� ������ ��ɹ�
//}
public class CollectionTest {
	public static void main(String[] args) {
		//�迭
		int[] arr = new int[] {10,20,30,40,50};
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("============================================");
		//List
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("swing");
		list.add("servlet");
		list.add("jsp");
		for(String data : list) {
			System.out.println(data);
		}
		System.out.println("============================================");
		//Set
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		for(String data : set) {
			System.out.println(data);
		}
		System.out.println("============================================");
		//Map
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("id","jang");
		map1.put("pass","1234");
		map1.put("name","�嵿��");
		map1.put("addr","����");
		map1.put("point","1000");
		map1.put("deptno","100");
		Collection<String> changeMap = map1.values();//map�� ����� ��� value�� Collection���� ����
		for(String data : changeMap) {
			System.out.println(data);
		}
	}
}











