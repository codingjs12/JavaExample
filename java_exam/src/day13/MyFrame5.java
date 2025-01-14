package day13;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame5 extends JFrame {

	public MyFrame5() {
		setTitle("첫번째 GUI");

		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(null);

		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50, 20);
			btn.setLocation(i * 15, i * 15);
			c.add(btn);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame5 gui = new MyFrame5();
	}
}