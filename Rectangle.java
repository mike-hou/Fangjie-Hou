
public class Rectangle {

	
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	public Rectangle(int x, int y, int w, int h){
		this.x=x;
		this.y=y;
		width =w;
		height =h;
		
	}
	
	
	public int getY(){
		return y;
	}

	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return x;
	}

	public void setX(int x){
		this.x=x;
	}
	
	public int getWidth(){
		return width;
	}

	public void setWidth(int w){
		this.width=w;
	}
	public int getHeight(){
		return height;
	}

	public void setHeight(int h){
		this.height=h;
	}
	
}
