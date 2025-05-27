import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEventEx01 extends JFrame {
	private JLabel label = new JLabel("마우스 움직임 없음");

	public MouseEventEx01() {
		this.setTitle("MouseEventEx01");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(label);

		contentPane.addMouseListener(new MyMouseListener());
		contentPane.addMouseMotionListener(new MyMouseMotionListener());

		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		
		public MyMouseListener() {
			super();
		}

		public void mousePressed(MouseEvent e) {
			label.setText("눌러짐 (" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseReleased(MouseEvent e) {
			label.setText("풀림 (" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
			Component c = (Component) e.getSource();
			c.setBackground(Color.CYAN);
		}

		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource();
			c.setBackground(Color.YELLOW);
		}
	}

	class MyMouseMotionListener implements MouseMotionListener {
		
		public MyMouseMotionListener() {
			super();
		}

		public void mouseDragged(MouseEvent e) {
			label.setText("드레그됨 (" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseMoved(MouseEvent e) {
			label.setText("움직임 (" + e.getX() + "," + e.getY() + ")");
		}
	}

	public static void main(String[] args) {
		new MouseEventEx01();
	}
}