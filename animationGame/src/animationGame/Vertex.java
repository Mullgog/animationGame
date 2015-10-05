package animationGame;

public class Vertex {
	public double x;
	public double y;
	public Vertex(double x, double y){
		this.x=x;
		this.y=y;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vertex v1 = new Vertex(42,0);
Vertex v2 = new Vertex(0,0);

System.out.println("v1.x="+v1.x);
System.out.println("v1.y="+v1.y);

System.out.println("v2.x="+v2.x);
System.out.println("v2.y="+v2.y);

System.out.println("v1.x="+v1);
System.out.println("v1.x="+v2);

System.out.println("v1 ="+v1.toString());


	}
	public String toString(){
		return "("+x+","+y+")";
		}
	
	
	public double length(){
		return Math.sqrt(x*x+y*y);
		}
	
	public Vertex skalarMult(double s){
		return new Vertex(x*s,y*s);
		}
	
	public void skalarMultiMod(double s){
	  x = x*s;
	  y = y*s;
		}

	
	
	public void addMod(Vertex v2){
		x=x+v2.x;
		y=y+v2.y;
			}

	public Vertex add(Vertex v2){
		return new Vertex(x+v2.x,y+v2.y);
	}
	public Vertex normalized(){
		double factor = 1/length();
		return new Vertex (x*factor, y*factor);
		}
	public void normalizedModd(){
	
	
		
	}
	public boolean equals(Object thatObject){
		if (thatObject instanceof Vertex){
			Vertex that = (Vertex)thatObject;
			
		return this.x == that.x && this.y == that.y;
		}
		return false;
			}


		
}
