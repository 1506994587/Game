package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player{
	@Override
	public void inputName() {
		String[] name = {"a","b","c"};
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		setPlayerName(name[i-1]);
	}

	@Override
	public int myFist() {
		return (int)(Math.random()*3)+1;
	}
}
