package oop.inheritance;
//�Ϲ�ȭ��Ų ��
public class ����after{
	public static void main(String[] args) {
		��after obj = new ��after();
		obj.�̸� = "���ƹ�";
		obj.�̵���� = "��";
		obj.�̵��ϴ�();
	}
}
class ����{
	String �̸�;
	String �̵����;
	public void �̵��ϴ�(){
		System.out.println(�̵����+"���� �̵���");
	}
}
class ��after extends ����{
	int ������;
	public void set������(int ������){
		this.������ = ������;
	}
}
class ������after extends ����{
		int ��������;
		public void set��������(int ��������){
			this.�������� = ��������;
		}
}
class �ڳ���after extends ����{
	int ��ũ��;
	public void set��ũ��(int ��ũ��){
		this.��ũ�� = ��ũ��;
	}
}
class ��after extends ����{
	int �������̱���;
	public void set�������̱���(int �������̱���){
		this.�������̱��� = �������̱���;
	}
}





