package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame {

	public MouseEvent1() {
		setTitle("마우스 이벤트");

		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(null);

		JLabel label = new JLabel("test!");
		label.setSize(100, 100);
		JButton btn = new JButton("Action");
		btn.setSize(50, 50);
		btn.setLocation(50, 50);

		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});

		c.add(btn);
		c.add(label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		setVisible(true);

	}

	public static void main(String[] args) {
		MouseEvent1 gui = new MouseEvent1();
	}
}