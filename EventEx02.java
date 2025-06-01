//내부 클래스로 리스너 클래스를 구현

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventEx02 extends JFrame {

	private JTextArea textArea;

	public EventEx02() throws HeadlessException {
		super();
		this.setTitle("EventEx3");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		leftPanel.setLayout(new FlowLayout());
		rightPanel.setLayout(new BorderLayout());

		JButton button_1 = new JButton("버튼");
		leftPanel.add(button_1);

		textArea = new JTextArea();
		rightPanel.add(textArea);

		button_1.addActionListener(new MyActionListener());

		contentPane.add(leftPanel, BorderLayout.WEST);
		contentPane.add(rightPanel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.append("button_1이 눌러졌습니다!\n");
		}
	}

	public static void main(String[] args) {
		new EventEx02();
	}

}
