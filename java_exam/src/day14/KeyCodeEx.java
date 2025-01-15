package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyCodeEx extends JFrame {

	public KeyCodeEx() {
		setTitle("랜덤 버튼 배치");
		Container c = getContentPane();

		c.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyChar() == '%') {
					c.setBackground(Color.cyan);
				} else if (e.getKeyCode() == KeyEvent.VK_F1) {
					c.setBackground(Color.gray);
				}
			}
		});

		c.setFocusable(true);
		c.requestFocus();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}
}