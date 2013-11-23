import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


	
	public class MovingCirclePanel extends JPanel{
		
		private ArrayList<Circle> circles =null;
		private ArrayList<Rectangle> rect =null;
		
		
		
		
		
		
		
		
		public MovingCirclePanel(){
		
			circles = new ArrayList();
			rect = new ArrayList();
			
			
			this.addMouseMotionListener(new MouseAdapter(){
				@Override
				public void mouseDragged(MouseEvent e){
					
					if(!circles.isEmpty()){
						
						for(int i=0;i<circles.size();i++){					
					if(((e.getX() < (circles.get(i).getX()+circles.get(i).getRadius())) && (e.getX() > (circles.get(i).getX()-circles.get(i).getRadius()) )) &&((e.getY() > (circles.get(i).getY()-circles.get(i).getRadius())) && (e.getY()< (circles.get(i).getY()+circles.get(i).getRadius())))){
						circles.get(i).setX(e.getX());
						circles.get(i).setY(e.getY());
						repaint();
						if((((circles.get(i).getX()>(rect.get(i).getX()+circles.get(i).getRadius()))&&circles.get(i).getX()<(rect.get(i).getX()+rect.get(i).getWidth()-circles.get(i).getRadius())&&(circles.get(i).getY()>(rect.get(i).getY()+circles.get(i).getRadius()))&&(circles.get(i).getY()<(rect.get(i).getY())+rect.get(i).getHeight()-circles.get(i).getRadius())))){
							
							circles.get(i).setIsInside(true);
							System.out.println("circle"+i+"is "+circles.get(i).isInside());
						}
						else {
							circles.get(i).setIsInside(false); 
							System.out.println("circle"+i+"is "+circles.get(i).isInside());
							}
					}
					
					}
					}
				}
					
					
				public void mouseMoved(MouseEvent e){
					
				}
			});
			
			
			
			
		}
		
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			for(int i=0;i<circles.size();i++){
			g.drawOval(circles.get(i).getX()-circles.get(i).getRadius(), circles.get(i).getY()-circles.get(i).getRadius(), 2*circles.get(i).getRadius(), 2*circles.get(i).getRadius());
			g.drawRect(rect.get(i).getX(), rect.get(i).getY(), rect.get(i).getWidth(), rect.get(i).getHeight());
			}
			
		}
		
		
		public void addCircle(int x,int y,int r,int rectX,int rectY,int rectW,int rectH){
			circles.add(new Circle(x,y,r));
			rect.add(new Rectangle(rectX,rectY,rectW,rectH));
			
		}

	}
	
