package simplepainter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimplePainter {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("SimplePainter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		
		JLabel label = new JLabel("Hellow World");
		frame.add(label);
		
		Canvas canvas = new Canvas();
		frame.add(canvas);
		
		frame.setVisible(true);
	}

}

class Canvas extends JPanel implements MouseListener, MouseMotionListener {
	private int x = -100;
	private int y = -100;
	
	public Canvas() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(600, 400);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(100,  100,  50,  50);
		g.fillOval(x-5,  y-5,  10,  10);
	}
	
	@Override
		public void mouseClicked(MouseEvent e) {
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	x = e.getX();
	y = e.getY();
	repaint();
	}
	
	@Override
		public void mouseReleased(MouseEvent e) {
	}
	
	@Override
		public void mouseEntered(MouseEvent e) {
	}
	
	@Override
		public void mouseExited(MouseEvent e) {
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	@Override
		public void mouseMoved(MouseEvent e) {
	}
}
	
