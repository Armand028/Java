public class Robot{
private String name;
private Point location;
//construteurs
	public Robot(String name,Point location){
		this.location=location;
		this.name=name;
	}
//accesseurs && modificateurs
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public Point getLocation(){
		return location;
	}
	public void setLocation(Point location){
		this.location=location;
	}
	public void display(){
		System.out.println("name :"+getname()+" location: "+getLocation());
	}
	public void moveTo(int hori, int verti){
		this.location.setX(location.getX()+hori);
		this.location.setY(location.getY()+verti);
	}
	public double distance( Robot other){
		return Math.sqrt(Math.pow((this.location.getX()-other.location.getX()),2)+Math.pow((this.location.getY()-other.location.getY()),2));
	}
	public static void main(String[] args){
		Point p= new Point(0,0);
		Robot rob =new Robot("Robot1",p);
		rob.display();
		rob.moveTo(1,2);
		rob.display();
		Point p2= new Point(3,4);
		Robot robot2=new Robot("rob2",p2);	
		robot2.display();
		System.out.println("Distance entre les deux robots :"+ rob.distance(robot2));
	}
}
