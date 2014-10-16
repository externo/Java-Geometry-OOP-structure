package _1.Geometry;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

	private Vertex[] vertices3D;
		
	public SpaceShape(Vertex[] vertices) {
		super(vertices);
	}

	public Vertex[] getVertices3D() {
		return this.vertices3D;
	}

	public void setVertices3D(Vertex[] vertices2d) {
		int count3D = 0;
		for (Vertex vertex : vertices2d) {
			if (vertex.isZ) {
				count3D++;
			}
		}
		if (count3D == vertices2d.length) {
			this.vertices3D = vertices2d;
		}else{
			System.out.println("Not all vertices are 2D!");
		}
	}
	
}
