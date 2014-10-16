package _1.Geometry;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

	private Vertex[] vertices2D;
		
	public PlaneShape(Vertex[] vertices) {
		super(vertices);
	}

	public Vertex[] getVertices2D() {
		return this.vertices2D;
	}

	public void setVertices2D(Vertex[] vertices2d) {
		int count2D = 0;
		for (Vertex vertex : vertices2d) {
			if (!vertex.isZ) {
				count2D++;
			}
		}
		if (count2D == vertices2d.length) {
			this.vertices2D = vertices2d;
		}else{
			System.out.println("Not all vertices are 2D!");
		}
	}
	
}
