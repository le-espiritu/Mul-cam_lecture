package api.util;

import java.util.ArrayList;
//List�� �ߺ��� ���ȴ�.
public class ArrayListTest02 {
	public static void main(String[] args) {
		//String�����Ͱ� ����� ArrayList�� �����ϰ�
		ArrayList<String> list = new ArrayList<String>();
		//java,oracle,swing,servlet,jsp�� ���ڿ��� ����
		list.add("java");
		list.add("oracle");
		list.add("swing");
		list.add("servlet");
		list.add("jsp");
		list.add("servlet");
		list.add("jsp");
		//ArrayList�� ����� ��� ��Ҹ� ����ϱ�
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//DM���� ����
	}
}
