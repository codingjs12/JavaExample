package day13;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {

	public MyFrame4() {
		setTitle("첫번째 GUI");

		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(null);

		JButton btn = new JButton("test");
		btn.setSize(75, 75);
		btn.setLocation(100, 200);
		c.add(btn);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame4 gui = new MyFrame4();
	}
}