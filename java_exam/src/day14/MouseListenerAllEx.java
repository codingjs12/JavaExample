package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {

	public MouseListenerAllEx() {
		setTitle("마우스 이벤트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("이벤트 전");
		c.add(label);

		c.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label.setText("드래그 하는중 " + e.getX() + ", " + e.getY());
				c.setBackground(new Color(0, 82, 164));
			}
		});

		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				label.setText("클릭되었음 " + e.getX() + ", " + e.getY());
				c.setBackground(new Color(0, 168, 77));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("마우스 떼짐 " + e.getX() + ", " + e.getY());
				c.setBackground(new Color(239, 124, 28));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				c.setBackground(new Color(0, 164, 227));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				c.setBackground(new Color(153, 108, 172));
			}

		});

		c.setFocusable(true);
		c.requestFocus();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}