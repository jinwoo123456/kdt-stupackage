package ex2_switch;

//��Ʈ��a : ��ü����, ��Ʈ��i : �鿩���� ���� ������
public class Ex3_switch {
	public static void main(String[] args) {
		String s = "1";
		
		//����ġ���� ����(byte, int, short), ����, ���ڿ����� �񱳰����� ���� �� �ִ�.
		switch(s) {
		case "0" : 
			System.out.println("0 ����");
			break;
		case "1" :
			System.out.println("1 ����");
			//break;	//break�� ������ switch���� ���������� �ʴ´�. break�� ���� �� ���� switch���� 
		case "2" :
			System.out.println("2 ����");
			break;
		default :
			System.out.println("0�� 1�߿� �Ѱ����� ��������");
			break;
		}
	}
}
