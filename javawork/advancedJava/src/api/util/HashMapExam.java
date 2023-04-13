package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		//������ ���� �����͸� HashMap�� �����ϰ� ����غ���.
		//id-jang, pass-1234,name-�嵿��, addr-����,point-1000, deptno-100
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("id","jang");
		map1.put("pass","1234");
		map1.put("name","�嵿��");
		map1.put("addr","����");
		map1.put("point","1000");
		map1.put("deptno","100");
		//HashMap�� ����� �����͸� ��� ������ ����ϱ�
		//1. map�� ����� ��� Ű�� ������ - ����� ��� Key�� Set���� ��ȯ�ϱ�
		Set<String> keylist = map1.keySet();
		
		//2. Set���� ��ȯ�� keylist�� Iterator�� ��ȯ�ϱ�
		Iterator<String> it = keylist.iterator();
		
		//3. Iterator�� ����� key ����� �̿��ؼ� HashMap���� value�� ����
		while(it.hasNext()) {
			String key = it.next();
			String value = map1.get(key);
			System.out.println(key+":"+value);
		}
	}
}
