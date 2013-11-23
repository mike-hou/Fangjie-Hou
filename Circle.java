
public class Circle {

	
private int x;
private int y;
private int radius;
private boolean isInside = false;


public Circle(int x,int y, int r){
	this.x=x;
	this.y=y;
	radius = r;
}



public int getX(){
	return x;
}

public void setX(int x){
	this.x=x;
}
public int getY(){
	return y;
}

public void setY(int y){
	this.y=y;
}
public int getRadius(){
	return radius;
}

public void setRadius(int r){
	this.radius=r;
}
public boolean isInside(){
	return isInside;
}

public void setIsInside(boolean is){
	this.isInside = is;
}




}
