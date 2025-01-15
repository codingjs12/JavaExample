package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {

	public JComponentEx() {
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("색상버튼");
		JButton btn2 = new JButton("비활성버튼");
		JButton btn3 = new JButton("타이틀 버튼");

		btn.setBackground(new Color(205, 124, 47));
		btn.setForeground(new Color(116, 127, 0));
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		btn2.setEnabled(false);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn2.setEnabled(!btn2.isEnabled());
				c.remove(btn);
				revalidate();
				repaint();
			}
		});

		c.add(btn);
		c.add(btn2);
		c.add(btn3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComponentEx();

	}
}