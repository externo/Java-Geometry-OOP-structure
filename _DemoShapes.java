package _1.Geometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import sun.net.www.content.audio.x_aiff;

public class _DemoShapes {
	
	public static void main(String[] args) {
		
		Vertex[] vertices2D = new Vertex[30];
		Vertex[] vertices3D = new Vertex[30];
		
		for (int i = 0; i < 30; i++) { //random 2D vertices
			double x = new Random().nextInt(50)+50;
			double y = new Random().nextInt(50)+50;
			vertices2D[i] = new Vertex(x, y);
		}
		
		for (int i = 0; i < 30; i++) { //random 3D vertices
			double x = new Random().nextInt(50)+50;
			double y = new Random().nextInt(50)+50;
			double z = new Random().nextInt(50)+50;
			vertices3D[i] = new Vertex(x, y, z);
		}
						
		Shape[] shapes = new Shape[60];
		for (int i = 0; i < 60; i+=6) {
			double width = new Random().nextInt(200)/39+3;
			double height = new Random().nextInt(200)/39+3;
			double depth = new Random().nextInt(200)/39+3;
			double radius = new Random().nextInt(200)/39+3;
			Vertex v2D1 = vertices2D[new Random().nextInt(10)+10];
			Vertex v2D2 = vertices2D[new Random().nextInt(10)+10];
			Vertex v2D3 = vertices2D[new Random().nextInt(10)+10];
			Vertex v3D1 = vertices3D[new Random().nextInt(10)+10]; 
			Vertex v3D2 = vertices3D[new Random().nextInt(10)+10]; 
			Vertex v3D3 = vertices3D[new Random().nextInt(10)+10]; 
			shapes[i] = new Triangle(new Vertex[]{v2D1, v2D2, v2D3});
			shapes[i+1] = new Rectangle(new Vertex[]{v2D1}, width, height);
			shapes[i+2] = new Circle(new Vertex[]{v2D2}, radius);
			shapes[i+3] = new SquarePyramid(new Vertex[]{v3D1}, width, height);
			shapes[i+4] = new Cuboid(new Vertex[]{v3D2}, width, height, depth);
			shapes[i+5] = new Sphere(new Vertex[]{v3D3}, radius);
		}
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		
		//•	VolumeMeasurable shapes whose volume is over 40.00
		List<Shape> spaceShapes = Arrays.asList(shapes).stream()
				.filter(s -> s instanceof VolumeMeasurable)
				.filter(v -> ((VolumeMeasurable) v).getVolume() > 40)
				.collect(Collectors.toList());
		for (Shape shape : spaceShapes) {
			System.out.println(shape);
		}

		//•	Plane shapes and sort them by their perimeter in ascending order
		Comparator<Shape> perimeterComparator = 
				(Shape s1, Shape s2) -> 
					(((PlaneShape) s1).getPerimeter() < ((PlaneShape) s2).getPerimeter()? -1 :
					 ((PlaneShape) s1).getPerimeter() > ((PlaneShape) s2).getPerimeter() ? 1 : 0);
		List<Shape> planeShapes = Arrays.asList(shapes).stream()
				.filter(s -> s instanceof PlaneShape)
				.sorted(perimeterComparator)
				.collect(Collectors.toList());		
		for (Shape shape : planeShapes) {
			System.out.println(shape);
		}
	}

}
