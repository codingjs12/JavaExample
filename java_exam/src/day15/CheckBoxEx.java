package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEx extends JFrame {
	private JLabel result;
	private int sum = 0;

	public CheckBoxEx() {
		setTitle("체크박스 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		int apple = 100;
		int pear = 1000;
		int cherry = 10000;
		JLabel label1 = new JLabel("사과는 " + apple + "원" + " 배는 " + pear + "원" + " 체리는 " + cherry + "원");

		JCheckBox check1 = new JCheckBox("사과");
		JCheckBox check2 = new JCheckBox("배");
		JCheckBox check3 = new JCheckBox("체리");

		check1.setBorderPainted(true);
		check2.setBorderPainted(true);
		check3.setBorderPainted(true);

		c.add(label1);

		String names[] = { "사과", "배", "체리" };

		for (int i = 0; i < names.length; i++) {
			JCheckBox fruit = new JCheckBox(names[i]);
			fruit.setBorderPainted(true);
			fruit.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					JCheckBox fruit = (JCheckBox) e.getItem();

					if (e.getStateChange() == ItemEvent.SELECTED) {
						if (fruit.getText().equals("사과")) {
							sum += apple;
						} else if (fruit.getText().equals("배")) {
							sum += pear;
						} else {
							sum += cherry;
						}
					} else {
						if (fruit.getText().equals("사과")) {
							sum -= apple;
						} else if (fruit.getText().equals("배")) {
							sum -= pear;
						} else {
							sum -= cherry;
						}
					}
					result.setText("현재" + sum + "원입니다.");
				}
			});
			c.add(fruit);
		}

		result = new JLabel("현재 0원입니다.");
		c.add(result);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}
}