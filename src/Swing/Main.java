package Swing;

//	 Based off of CaveOfProgramming.com YouTube playlist

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
		MainFrame frame = new MainFrame("Hello World Swing!");
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
