package _1.Geometry;

public class Triangle extends PlaneShape {

	private Vertex[] vertices;
	private double a;
	private double b;
	private double c;
	
	public Triangle(Vertex[] vertices){
		super(vertices);
	}

	public Vertex[] getVertices() {
		return this.vertices;
	}

	public void setVertices(Vertex[] vertices) {
		if (vertices.length==3) {
			this.vertices = vertices;
		}else{
			System.out.println("The vertices must be exactly 3 !");
		}
	}

	@Override
	public double getPerimeter() {
		this.a = Double.parseDouble(this.vertices[0].distance(this.vertices[1]));
		this.b = Double.parseDouble(this.vertices[1].distance(this.vertices[2]));
		this.c = Double.parseDouble(this.vertices[2].distance(this.vertices[0]));
		return a + b + c;
	}

	@Override
	public double getArea() {
		double p = this.getPerimeter(); // Heron formula
		return Math.sqrt(p * (p-this.a) * (p-this.b) * (p-this.c));
	}
	
	@Override
	public String toString(){
		return "Type: " + this.getClass() + 
				". Coordinates- A: " + this.vertices[0] +
							  " B: " + this.vertices[1] +
							  " C: " + this.vertices[2] +
			   " has perimeter: " + this.getPerimeter() +
			   " and area: " + this.getArea();
	}
}
