package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//key�� value�� ���·� ����Ǵ� ������
//key�� value�� ������Ÿ���� ��� ���
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		//HashMap���� ������ Ű�� �����͸� put�ϸ� ����Ⱑ �ȴ�. - Ű�� �ߺ��� �� ����.
		map1.put(1,"swing");
		map1.put(1,"oracle");
		map1.put(1,"java");
		System.out.println(map1.size());//map1�� ����� ����� ������ ����
		System.out.println(map1.get(1));//map1�� ����� ��� �� key���� 1�� �������� value�� ����
		
		System.out.println("==============================================================");
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("A01","servlet");
		map2.put("B02","jsp");
		map2.put("C03","spring");
		map2.put("D04","mybatis");
		map2.put("F05","ajax");
		System.out.println(map2.size());
		System.out.println(map2.get("1"));
		System.out.println("==============================================================");
	
		
		//HashMap�� ����� �����͸� ��� ������ ����ϱ�
		//1. map�� ����� ��� Ű�� ������ - ����� ��� Key�� Set���� ��ȯ�ϱ�
		Set<String> keylist = map2.keySet();
		
		//2. Set���� ��ȯ�� keylist�� Iterator�� ��ȯ�ϱ�
		Iterator<String> it = keylist.iterator();
		
		//3. Iterator�� ����� key ����� �̿��ؼ� HashMap���� value�� ����
		while(it.hasNext()) {
			String key = it.next();
			String value = map2.get(key);
			System.out.println(key+":"+value);
		}
		
		
		
	}
}










