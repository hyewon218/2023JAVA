package shopping;

public class Lotte {
	//�Ǹűݾ�
		int money;
		
		public String buying(int money) {
			//�Ե���ȭ���� ��ǰ�ݾ�(����)�� money�� ���޹޾Ƽ� �մ��� ������ �ݾװ� ������
			//�Ե���ȭ���� ���� ����
			//�޼��� �ֿܼ� ���
			this.money +=money;
			if(money==Product.Lsandal) {
				return "������ �����߽��ϴ�.";
			}else if(money==Product.Lshirts) {
				return "Ƽ������ �����߽��ϴ�.";
			}else {
				return null;
			}
		}
}
