package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnEvent extends JFrame {

	public BtnEvent() {
		setTitle("첫번째 GUI");

		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		btn.addActionListener(new MyEvent());
		c.add(btn);

		JButton btn2 = new JButton("Action");
		btn2.addActionListener(new MyEvent());
		c.add(btn2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		setVisible(true);

	}

	public static void main(String[] args) {
		BtnEvent gui = new BtnEvent();
	}

	class MyEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("액션!!!");
			} else {
				btn.setText("Action");
			}
		}

	}
}