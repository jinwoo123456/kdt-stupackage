package ex2_overloading;

public class MakeOverloadMain {

	public static void main(String[] args) {
		MakeOverload ov = new MakeOverload();
		ov.getResult();
		ov.getResult(3);
		ov.getResult('a');
		ov.getResult("string");
		ov.getResult(10, "string");
		ov.getResult("string", 10);
		
		System.out.println(); //println�� ��쿡�� �����ε��� ����
	}
}
