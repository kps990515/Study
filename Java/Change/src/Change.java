
public class Change {
	
	public static void main(String[] args) {
		Change newClass = new Change();
		newClass.calc(10000, 3750);
		}
	public void calc(int pay, int buy)
	{	
		int changeArray[] = {5000,1000,500,100,50,10};
		int change = pay-buy;
		print("�� �Ž����� : ", change);
		for(int money : changeArray)
		{
			System.out.println(money+"�� : "+change/money);
			change %= money;
		}
	}
	public void print(String flag, int count) {
		System.out.println(flag+count);
		
	}
}
