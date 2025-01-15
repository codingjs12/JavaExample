package day14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickGame extends JFrame {

	private int checkNum = 1;

	private double startTime;
	private double endTime;
	private JLabel label;

	public ClickGame() {
		setTitle("클릭 게임");
		Container c = getContentPane();
		Random ran = new Random();
		c.setLayout(null);
		int i = 0;
		for (i = 1; i <= 10; i++) {
			int x = ran.nextInt(700);
			int y = ran.nextInt(700);
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			btn.setLocation(x, y);
			c.add(btn);
			
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (btn.getText().equals(String.valueOf(checkNum))) {
						checkNum++;
						c.remove(btn);
						revalidate();
						repaint();
					}
					if (checkNum == 11) {
						label = new JLabel("걸린시간 : ");
						label.setSize(100, 100);
						label.setLocation(100, 100);
						c.add(label);
					}
				}
			});
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ClickGame();
	}

}
