package _1.Geometry;

public class Rectangle extends PlaneShape {

	private Vertex[] vertices;
	private double width;
	private double height;
	
	public Rectangle(Vertex[] vertices, double width, double height){
		super(vertices);
		this.setWidth(width);
		this.setHeight(height);
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

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		if (width>0) {
			this.width = width;
		}else{
			System.out.println("Width must be >0");
		}
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if (height>0) {
			this.height = height;
		}else{
			System.out.println("Height must be > 0");
		}
	}

	
	@Override
	public double getPerimeter() {
		return 2*(this.getWidth() + this.getHeight());
	}

	
	@Override
	public double getArea() {
		return this.getWidth()*this.getHeight();
	}
	
	@Override
	public String toString(){
		return "Type: " + this.getClass() + 
			   ". Center:" + this.vertices[0] +
			   " has perimeter: " + this.getPerimeter() +
			   " and area: " + this.getArea();
	}
}
