package day14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Click extends JFrame {

	private double startTime;
	private double endTime;

	private int checkNum = 1;

	public Click() {
		setTitle("Click Game");
		Container c = getContentPane();
		Random ran = new Random();
		c.setLayout(null);

		for (int i = 1; i <= 10; i++) {
			int x = ran.nextInt(500);
			int y = ran.nextInt(500);
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			btn.setLocation(x, y);
			c.add(btn);

			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton) e.getSource();

					int btnNum = Integer.parseInt(btn.getText());
					if (btnNum == checkNum) {
						btn.setVisible(false);
						checkNum++;
						if (checkNum == 2) {
							startTime = System.currentTimeMillis();
						}
						if (checkNum > 10) {
							endTime = System.currentTimeMillis();
							double time = (endTime - startTime) / 1000;
							JLabel label = new JLabel("걸린시간 : " + time);
							label.setSize(200, 200);
							label.setLocation(100, 100);
							c.add(label);
						}
					}
				}
			});
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Click();

	}
}