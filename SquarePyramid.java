package _1.Geometry;

public class SquarePyramid extends SpaceShape {

	private Vertex[] vertices;
	private double width;
	private double height;
	
	public SquarePyramid(Vertex[] vertices, double width, double height){
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

	
	@Override
	public double getVolume() {
		return Math.pow(this.getWidth(), 2)*this.getHeight()/3;
	}

	
	@Override
	public double getArea() {
		double slantLength = Math.sqrt(Math.pow(getWidth()/2, 2) + 
									   Math.pow(this.getHeight(), 2));
		return 2*this.width*slantLength + Math.pow(this.getWidth(), 2);
	}
	
	@Override
	public String toString(){
		return "Type: " + this.getClass() + 
			   ". Center: " + this.vertices[0] +
			   " has volume: " + this.getVolume() +
			   " and area: " + this.getArea();
	}
	
}
