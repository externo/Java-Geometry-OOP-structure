package _1.Geometry;

public class Vertex {
	
	private double x;
	private double y;
	private double z;
	public boolean isZ = false;

	public Vertex(double x, double y){
		this.setX(x);
		this.setY(y);
	}
	
	public Vertex(double x, double y, double z){
		this(x, y);
		this.setZ(z);
		this.isZ = true;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public void setZ(double z) {
		this.z = z;
	}

	public String distance(Vertex v) {
		if (this.isZ && v.isZ) {
			return Double.toString(
					Math.sqrt(Math.pow(this.getX() - v.getX(), 2) + 
							  Math.pow(this.getY() - v.getY(), 2) +
							  Math.pow(this.getZ() - v.getZ(), 2)));
		}else if (!(this.isZ && v.isZ)) {
			return Double.toString(
					Math.sqrt(Math.pow(this.getX() - v.getX(), 2) + 
					 		  Math.pow(this.getY() - v.getY(), 2)));
		}else{
			return "The point must have the same measurement";
		}
		
	}
	
	@Override
	public String toString(){
		if (!this.isZ){
			return "x, y = " + "[" + this.getX() + ", " + 
					  this.getY() + "]";
		}else {
			return "x, y, z = " + "[" + this.getX() + ", " + 
					  this.getY() + ", " + 
					  this.getZ() + "]";
		}
	}

}
