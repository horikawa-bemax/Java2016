package test;

import human.*;

public class HumanTest{
	
	public static void main(String[] args){
		String test1 = "HORIKAWA";
		Human human = new Horikawa();
		
		System.out.println(test1.equals(human.getName())?"�e�X�g��������":"�e�X�g���s��");
	}
}
