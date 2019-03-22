package coding;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class CodingFrame extends JFrame {
	public CodingFrame() {
		super.setTitle("Testing");
		super.setBounds(300, 100, 500, 500);
		super.setLayout(null);
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.GREEN);
		g2d.fillRect(0, 0, 500, 500);
		
		
	}
}
