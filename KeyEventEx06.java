// 키보드 r --> 배경 빨강, b --> 파랑색으로

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventEx06 extends JFrame {
	private JLabel label;

	public KeyEventEx06() throws HeadlessException {
		super();
		this.setTitle("Red or Blue");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		label = new JLabel();
		label.setText("Color");

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(label);

		contentPane.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
//				label.setText(Character.toString(keyChar));
				if (keyChar == 'b') {
					contentPane.setBackground(Color.BLUE);					
				}else if (keyChar == 'r') {
					contentPane.setBackground(Color.RED);					
				}else {
					contentPane.setBackground(Color.GRAY);
				}
						
			}
		});

		this.setVisible(true);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
	}

	public static void main(String[] args) {
		new KeyEventEx06();
	}

}
