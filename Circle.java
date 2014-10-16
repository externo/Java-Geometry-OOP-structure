package _1.Geometry;

public class Circle extends PlaneShape {

	private Vertex[] vertices;
	private double radius;
	
	public Circle(Vertex[] vertices, double radius){
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
			System.out.println("The vertice must be only 1 !");
		}
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double width) {
		if (width>0) {
			this.radius = width;
		}else{
			System.out.println("Radius must be >0");
		}
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*this.getRadius();
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.getRadius(), 2);
	}
	
	@Override
	public String toString(){
		return "Type: " + this.getClass() + 
			   ". Center: " + this.vertices[0] +
			   " has perimeter: " + this.getPerimeter() +
			   " and area: " + this.getArea();
	}
	
}
