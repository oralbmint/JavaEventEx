//독립된 클래스로 리스너 클래스 구현(같은 파일 내에 정의), 가장 전형적인 방법

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventEx01 extends JFrame {
	private JTextArea textArea;

	public EventEx01() throws HeadlessException {
		super();
		this.setTitle("EventEx4");
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

		button_1.addActionListener(new MyActionListener(textArea));

		contentPane.add(leftPanel, BorderLayout.WEST);
		contentPane.add(rightPanel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx01();
	}

}

class MyActionListener implements ActionListener {
	private JTextArea textArea;

	public MyActionListener(JTextArea textArea) {
		super();
		this.textArea = textArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.append("button_1이 눌러졌습니다!\n");
	}
}
