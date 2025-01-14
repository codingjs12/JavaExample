package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {

	public MyFrame2() {
		setTitle("첫번째 GUI");

		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(new BorderLayout(10, 10));

		JButton btn = new JButton("1번버튼");
		JButton btn2 = new JButton("2번버튼");
		JButton btn3 = new JButton("3번버튼");
		JButton btn4 = new JButton("4번버튼");
		JButton btn5 = new JButton("5번버튼");

		c.add(btn, BorderLayout.EAST);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.SOUTH);
		c.add(btn4, BorderLayout.NORTH);
		c.add(btn5, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame2 gui = new MyFrame2();
	}

}
