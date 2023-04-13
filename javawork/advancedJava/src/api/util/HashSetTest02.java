package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//������ ǥ���� �ڷᱸ�� - �����հ� �������� �����ϰ� ǥ���ϱ�
public class HashSetTest02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("oracle");
		set.add("swing");
		set.add("servlet");
		set.add("jsp");
		set.add("servlet");
		set.add("jsp");
		System.out.println("����� ����:"+set.size());
		
		//������ - Set��ü�� �����Ҷ� �Ű������� �ٸ� Set��ü�� �����ؼ� ����
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("spring");
		set2.add("hadoop");
		set2.add("R");
		print(set);
		print(set2);
		
		//������ - retainAll�޼ҵ带 �̿��ؼ� �� ������ �������� ���Ӱ� ����
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
		set3.add("oracle");
		set3.add("raspberry");
		System.out.println("����� ����:"+set3.size());
		set3.retainAll(set);//�� ���� Set���� �ߺ��Ǵ� ��Ҹ� ������ ���Ӱ� ������ �Ѵ�. ���??? �޼ҵ带 ȣ���ϴ� ��ü��
		print(set3);
		
	}
	//Set�� ����� ��Ҹ� ������ ����ϴ� �޼ҵ�
	public static void print(Set<String> set) {
		Iterator<String> it = set.iterator(); //1. Iterator�� ��ȯ
		while(it.hasNext()) {//2. Iterator�� ����� ��Ұ� �ִ��� Ȯ��
			String element = it.next(); //3. Iterator�� ����� ��Ҹ� ������
			System.out.println("set�� ����� ���=>"+element);
		}
		System.out.println("============================================");
	}
}




