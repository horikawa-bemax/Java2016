package test;

import human.*;

public class HumanTest{
	
	public static void main(String[] args){
		String test1 = "HORIKAWA";
		Human human = new Horikawa();
		
		System.out.println(test1.equals(human.getName())?"テスト成功だよ":"テスト失敗だ");
	}
}
