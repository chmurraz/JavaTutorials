package day1.example;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class ExampleDrawingComponent extends JComponent{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;		//	Cast g as a Graphics2D object
		Color red = new Color(255,0,0);		//	RGB
		g2.setColor(red);
		
		
		//	Rectangle(x,y,width(pixels),height(pixels))
		Rectangle rect1 = new Rectangle(5, 5, 100, 200);
		g2.draw(rect1);
		
		//	Double is an "inner class" of Ellipse2D
		Ellipse2D.Double ellipse1 = new Ellipse2D.Double(100,100,50,20);
		g2.fill(ellipse1);
		g2.setColor(Color.BLUE);
		
		Line2D.Double line1 = new Line2D.Double(150, 150, 100, 50);
		g2.draw(line1);

		Point2D.Double p1 = new Point2D.Double(200,200);
		Point2D.Double p2 = new Point2D.Double(500, 200);
		
		Line2D.Double line2 = new Line2D.Double(p1, p2);
		g2.draw(line2);
		
	}
}
