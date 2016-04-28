package cn.edu.qdu.game;

public class Judger {
	private int total;
	// ������ϵ
	private Person person = new Person();
	private Computer computer = new Computer();

	public void startGame() {
		// ������ʼ
		System.out.println("******�˻���ȭ��Ϸ*******");
		// ���ܹ���
		System.out.println("1�� 2�� 3��");
	}

	public void askName() {
		// ѡ���������
		System.out.println("��ѡ�����������1�� 2�� 3��");
		computer.inputName();
		// �����������
		System.out.println("���������������");
		person.inputName();
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
	}

	public void playGame() {
		String ret = null;
		do {
			System.out.println("��" + person.getPlayerName() + "��ȭ��");
			int personNum = person.myFist();
			System.out.println("��" + computer.getPlayerName() + "��ȭ��");
			int computerNum = computer.myFist();
			
			if(personNum == computerNum){
				System.out.println("ƽ��");
			}else if(personNum == 1 && computerNum == 2 || personNum == 2 && computerNum == 3 || personNum == 3 && computerNum == 1){
				System.out.println(person.getPlayerName() + "��ʤ");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else{
				System.out.println(computer.getPlayerName()+ "��ʤ");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
			total++;
			System.out.println("�Ƿ������");
			ret = person.askContinu();
		} while (ret.equals("y"));
	}

	public void finalResult() {
		System.out.println("һ������" + total);
		System.out.println(computer.getWinningTimes() + "VS" + person.getWinningTimes());
		
	}
	public static void main(String[] args) {
		Judger j = new Judger();
		j.startGame();
		j.askName();
		j.playGame();
		j.finalResult();
	}
}
