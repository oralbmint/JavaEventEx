//익명 클래스로 리스너 클래스를 작성

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventEx03 extends JFrame {

	private JTextArea textArea;

	public EventEx03() throws HeadlessException {
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

        // 익명 클래스로 ActionListener 구현
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("button_1이 눌러졌습니다!\n");
			}
		});

		contentPane.add(leftPanel, BorderLayout.WEST);
		contentPane.add(rightPanel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx03();
	}

}
