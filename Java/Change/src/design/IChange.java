package design;

// �������̽��� �����ϴ� ���(������ �����Ѵ�)
// ���������� + interface + �̸�
// �ڵ��� ���� ����
public interface IChange {
	public void clac(int pay, int buy);
}

public interface IChangeMove{
	public void move();
}
// �������̽� ����
// class + Ŭ���� �̸� + implements + �������̽� �̸�
// ������ �ڵ带 ����(�������̽��� ����Ǿ������� ������ �����ؾߵ�)
class Change implements IChange, IChangeMove{

	@Override
	public void clac(int pay, int buy) {
		// �������� �ڵ带 �ۼ��ϴ� �κ�
		
	}

	@Override
	public void move() {
		// �������� �ڵ带 �ۼ��ϴ� �κ�
		
	}
	
}