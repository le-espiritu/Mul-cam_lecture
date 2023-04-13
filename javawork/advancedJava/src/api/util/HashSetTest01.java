package api.util;

import java.util.HashSet;
import java.util.Iterator;

//������ ���� - List�� �ٸ��� �ߺ��� �����͸� ������ �� ����. 
//�ڷᱸ���� �������� ����/�����Ⱑ �߿�
public class HashSetTest01 {
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
		
		//Set�� ���������� �ƴ϶� ������� �о�� �� ����.(for���� �̿��ؼ� i���� ��ȭ��Ű�� �׼����ϴ� ���� �Ұ���)
		//��� �ڷ� �������� ǥ�� ������ Iterator�� ��ȯ�ϰ� �о�;� �Ѵ�.
		//1. HashSet�� Iterator�� ��ȯ�ϱ�
		Iterator<String> it = set.iterator();
		//2. Iterator�� ����� �����͸� �о����
		while(it.hasNext()) {//Iterator�ȿ� ������Ʈ�� �ִ��� ������ Ȯ�� - ������ true/������ false�� ����
			String element = it.next(); //next()�� Iterator���� ������Ʈ ������
			System.out.println("set�� ����� ���=>"+element);
		}
	}
}









