package cn.edu.qdu.game;

public abstract class Player {
	// 属性
	private String playerName;
	private int winningTimes;

	// 静态块
	// 初始化块
	// 构造方法
	// 成员方法
	public abstract void inputName();

	public abstract int myFist();

	// getter&setter方法
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getWinningTimes() {
		return winningTimes;
	}

	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
}
