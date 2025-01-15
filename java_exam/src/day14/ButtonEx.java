package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {

	public ButtonEx() {
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon image1 = new ImageIcon("img/01.png");
		ImageIcon image2 = new ImageIcon("img/02.png");
		ImageIcon image3 = new ImageIcon("img/03.png");
		
		JButton btn = new JButton(image1);
		btn.setRolloverIcon(image2);
		btn.setPressedIcon(image3);
		c.add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonEx();
	}
}