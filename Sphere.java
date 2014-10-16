package _1.Geometry;

public class Sphere extends SpaceShape {

	private Vertex[] vertices;
	private double radius;
	
	public Sphere(Vertex[] vertices, double radius){
		super(vertices);
		this.setRadius(radius);
	}

	public Vertex[] getVertices() {
		return this.vertices;
	}

	public void setVertices(Vertex[] vertices) {
		if (vertices.length==1) {
			this.vertices = vertices;
		}else{
			System.out.println("The vertices must be only 1 !");
		}
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if (radius>0) {
			this.radius = radius;
		}else{
			System.out.println("Radius must be >0");
		}
	}
	
	@Override
	public double getVolume() {
		return Math.PI*Math.pow(getRadius(), 3)*4/3;
	}
	
	@Override
	public double getArea() {
		return 4*Math.PI*Math.pow(getRadius(), 2);
	}	

	@Override
	public String toString(){
		return "Type: " + this.getClass() + 
			   ". Center: " + this.vertices[0] +
			   " has volume: " + this.getVolume() +
			   " and area: " + this.getArea();
	}
	
}
