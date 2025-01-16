package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {

	JTextField input = new JTextField(20);
	JTextArea save = new JTextArea(7, 20);

	public TextAreaEx() {
		setTitle("TextArea 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		save.setEditable(false);
		JScrollPane scroll = new JScrollPane(save);

		c.add(input);
		c.add(scroll);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JTextField name = (JTextField) e.getSource();
				save.append(name.getText() + "\n");
				name.setText("");

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaEx();

	}
}