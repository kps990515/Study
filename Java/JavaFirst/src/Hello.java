
public class Hello {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("Hello Java");
		// �������� ������ �⺻ int�� ���ȴ�
		// long���� �ڿ� L�� ���δ�
		byte a = 10;
		byte b = 11;
		
		// byte�� �ϰ� ������ ��������ȯ �Ѵ�
		byte c = (byte)(a+b);
		
		// �Ǽ����� ������ double������ ���ȴ�
		// float���� �ڿ� f�� ���δ�
		
		float d = 3.14f;
		float e = 4.1928f;
		
		// �Ǽ� ������ �������� �ʴ´�.
		float f = Float.sum(d, e);
		
		double g = 5.232;
		double h = 6.323131;
		double i = Double.sum(g, h);
		
		int number = changeStringToInteger("123");
		int result = number+123123;
		test();
		
	}
	/**
	 * 
	 * @param number
	 * @return
	 */
	public String changeNumberToString(int number)
	{
		//���ڸ� ��Ʈ������ �ٲܶ��� Integer.tostring�� �ᵵ ������ �Ʒ������ �ַ� ����Ѵ�
		return number+"";
	}
	/**
	 * 
	 * @param word
	 * @return
	 */
	public static int changeStringToInteger(String word)
	{
		//���ڿ��� ���ڷ� ��ȯ
		return Integer.parseInt(word);
	}
	public static void test()
	{
		int a=2+3;
		int b=2-3;
		int c=2*3;
		int d=2/3;
		int e=5%3;
		int f=10%3;
		double dou=5.0%4.2;
		System.out.println(" 2+3 : "+a+"\n 2-3 : "+b+"\n 2*3 : "+c+"\n 2/3 : "+d+"\n 5%3 : "+e+"\n 10%3 : "+f+"\n 5.0%4.2 : "+dou);
	}
}

