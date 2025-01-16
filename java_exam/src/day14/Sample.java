package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Sample extends JFrame {

	public Sample() {
		setTitle("");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Sample();

	}
}