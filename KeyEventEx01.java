import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyEventEx01 extends JFrame {
	private JLabel [] label;  // 배열 선언
	
	public KeyEventEx01() {
		this.setTitle("keyEventEx01");
		this.setSize(300,150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.addKeyListener(new MyKeyListener()); 

		label = new JLabel [3];    // 배열 생성
		label[0] = new JLabel();   // 개별 배열 생성
		label[1] = new JLabel();
		label[2] = new JLabel();
		label[0].setText(" getKeycode() ");  // 배열 초기화
		label[1].setText(" getKeyChar() ");
		label[2].setText(" getKeyText() ");
		
		for(int i=0; i<label.length; i++) {
			contentPane.add(label[i]);   // 컨텐트 페인에 추가
			label[i].setOpaque(true);    // 불투명 속성 설정
			label[i].setBackground(Color.WHITE); // 배경색 지정
		}
		
		this.setVisible(true);
		
		// Container(컨텐트페인)를 키보드 포커스를 받을 수 있는 상태로 설정
		// Container 클래스는 기본으로 focusable = false 임
		// 이를 true로 변경해야 키보드 입력을 받을 수 있음
		contentPane.setFocusable(true);
		contentPane.requestFocus();  // requestFocus()는 컴포넌트에게 키보드 포커스 요청
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();    // 키 코드 알아내기
			char keyChar = e.getKeyChar();   // 키 문자 값 알아내기
			label[0].setText(Integer.toString(keyCode));     // 키 코드 출력
			label[1].setText(Character.toString(keyChar));   // 키 문자 출력
			label[2].setText(KeyEvent.getKeyText(keyCode));  // 키 이름 문자열 출력
		}
	}
	
	public static void main(String [] args) {
		new KeyEventEx01();
	}
}