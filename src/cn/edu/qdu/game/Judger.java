package cn.edu.qdu.game;

public class Judger {
	private int total;
	// 关联关系
	private Person person = new Person();
	private Computer computer = new Computer();

	public void startGame() {
		// 宣布开始
		System.out.println("******人机猜拳游戏*******");
		// 介绍规则
		System.out.println("1、 2、 3、");
	}

	public void askName() {
		// 选择电脑姓名
		System.out.println("请选择电脑姓名：1、 2、 3、");
		computer.inputName();
		// 输入玩家姓名
		System.out.println("请输入玩家姓名：");
		person.inputName();
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
	}

	public void playGame() {
		String ret = null;
		do {
			System.out.println("请" + person.getPlayerName() + "出拳：");
			int personNum = person.myFist();
			System.out.println("请" + computer.getPlayerName() + "出拳：");
			int computerNum = computer.myFist();
			
			if(personNum == computerNum){
				System.out.println("平手");
			}else if(personNum == 1 && computerNum == 2 || personNum == 2 && computerNum == 3 || personNum == 3 && computerNum == 1){
				System.out.println(person.getPlayerName() + "获胜");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else{
				System.out.println(computer.getPlayerName()+ "获胜");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
			total++;
			System.out.println("是否继续？");
			ret = person.askContinu();
		} while (ret.equals("y"));
	}

	public void finalResult() {
		System.out.println("一共玩了" + total);
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
