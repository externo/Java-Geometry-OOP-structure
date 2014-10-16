package _1.Geometry;

public class Cuboid extends SpaceShape {

	private Vertex[] vertices;
	private double width;
	private double height;
	private double depth;
	
	public Cuboid(Vertex[] vertices, double width, double height, double depth){
		super(vertices);
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
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
	
	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		if (depth>0) {
			this.depth = height;
		}else{
			System.out.println("Depth must be > 0");
		}
	}

	
	@Override
	public double getVolume() {
		return this.getWidth() * this.getHeight() * this.getDepth();
	}

	
	@Override
	public double getArea() {
		return 2*(this.getWidth()*this.getHeight() + 
				  this.getHeight()*this.getDepth() + 
				  this.getDepth()*this.getWidth());
	}

	@Override
	public String toString(){
		return "Type: " + this.getClass() + 
			   ". Center: " + this.vertices[0] +
			   " has volume: " + this.getVolume() +
			   " and area: " + this.getArea();
	}
	
}