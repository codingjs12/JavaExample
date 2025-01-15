package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Images extends JFrame {

	public Images() {
		setTitle("레이블 실습");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("자바 재밋다");

		c.add(label);

		ImageIcon image1 = new ImageIcon("img/3.jpg");

		Image image = image1.getImage();
		Image scaledImage = image.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(scaledImage);
		JLabel label2 = new JLabel(scaledIcon);
		c.add(label2);
		
		ImageIcon phone = new ImageIcon("img/2.png");
		JLabel label3 = new JLabel("자바 좋아!", phone, SwingConstants.CENTER);
		c.add(label3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 1000);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Images();
	}

}
