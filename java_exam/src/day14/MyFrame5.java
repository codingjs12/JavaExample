package day14;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame5 extends JFrame {

	public MyFrame5() {

		Random ran = new Random();

		setTitle("랜덤 버튼 배치");

		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(null);

		for (int i = 1; i <= 10; i++) {
			int x = ran.nextInt(700);
			int y = ran.nextInt(700);
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			btn.setLocation(x, y);
			c.add(btn);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame5 gui = new MyFrame5();
	}
}