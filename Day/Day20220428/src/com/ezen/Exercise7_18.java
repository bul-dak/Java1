package com.ezen;

//import com.ezen.Robot.DanceRobot;
//import com.ezen.Robot.DrawRobot;
//import com.ezen.Robot.SingRobot;

public class Exercise7_18 {
	static void action(Robot r) { //static main ���� action �޼��带 ȣ���ϱ� ���ؼ� �޼��嵵 static�޼��忩����.
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		} else if(r instanceof SingRobot) {
			((SingRobot)r).sing();
		} else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
	
	public static void main(String[] args) {
		//Exercise7_18 ex = new Exercise7_18();
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0;i<arr.length;i++)
			action(arr[i]);
		
	     
	} //main
	
}
class Robot{
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}