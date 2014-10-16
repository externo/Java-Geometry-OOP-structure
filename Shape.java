package _1.Geometry;

public abstract class Shape {
	private Vertex[] vertices;
	
	public Shape(Vertex[] vertices){
		this.setVertices(vertices);
	}
		
	public Vertex[] getVertices() {
		return this.vertices;
	}

	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}

}
