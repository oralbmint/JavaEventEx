package myswing;

//심플한 토글 버튼 구현 예제
//내부 클래스로 리스너를 구현

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EventSimple extends JFrame {

	public EventSimple() throws HeadlessException {
		super();
		this.setTitle("event simple");
		this.setSize(300, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout());

		JButton button1 = new JButton("Click!");
		contentPane.add(button1);
		
		MyActionListener listener = new MyActionListener();
		button1.addActionListener(listener);

		this.setVisible(true);
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (btn.getText().equals("Click!")) {
				btn.setText("Clicked!");
			} else {
				btn.setText("Click!");
			}
		}
	}

	public static void main(String[] args) {
		new EventSimple();
	}

}
