package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

//��¥�ð��� ���� �۾�
public class CalendarTest {
	public static void main(String[] args) {
		//���� ��¥�� �ð� ������ ǥ���� ��ü
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		
		System.out.print(cal.get(Calendar.YEAR)+"�� ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"�� ");
		System.out.print(cal.get(Calendar.DATE)+"�� ");
		System.out.print(cal.get(Calendar.HOUR)+"�� ");
		System.out.print(cal.get(Calendar.MINUTE)+"�� ");
		System.out.println(cal.get(Calendar.SECOND)+"�� ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/30/12);
		
		//���ú��� 9/21���� dday�� ���ϱ�
		//=> ���ó�¥��ü, 9/21��ü �� ���� �ʿ�
		//1. Calendar��ü �� �� �����
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		Calendar dday2 = new GregorianCalendar(2021, 8, 21);
		
		//2. �ϳ��� Calendar��ü�� 9��21�Ϸ� �����ϱ�
		dday.set(2021, 8, 21);
		
		System.out.print(dday.get(Calendar.HOUR)+"�� ");
		System.out.print(dday.get(Calendar.MINUTE)+"�� ");
		System.out.println(dday.get(Calendar.SECOND)+"�� ");
		
		System.out.print(dday2.get(Calendar.HOUR)+"�� ");
		System.out.print(dday2.get(Calendar.MINUTE)+"�� ");
		System.out.println(dday2.get(Calendar.SECOND)+"�� ");
		
		System.out.println("dday=>"+dday.getTimeInMillis());
		System.out.println("dday2=>"+dday2.getTimeInMillis());
		//3. �� ��ü�� ��¥ ���̸� ����ϱ�
		long ddayValue = dday.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(ddayValue/1000/60/60/24+"��");
		long ddayValue2 = dday2.getTimeInMillis() - today.getTimeInMillis();
		System.out.println(ddayValue2/1000/60/60/24+"��");
	}
}
