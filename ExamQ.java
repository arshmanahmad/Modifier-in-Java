//Write JAVA program to create a class called "Circle" with a radius attribute.
//You can access and modify this attribute. Calculate the area and 
//circumference of the circle

class Circle {
	
	double r;
	final double pi = 3.141;

	Circle (double r) {
		this.r=r;
	}	

	void modifyCircle(double r1) {
		r=r1;
	}	

	double areaCircle() {
		return pi*r*r;
	}

	double circumCircle() {
		return 2*pi*r;
	}
}

class ExamQ {
	public static void main(String arg[]) {

		Circle c1 = new Circle(3);

		System.out.println("The area of circle is = " + c1.areaCircle());
		System.out.println("The circumference of circle is = " + c1.circumCircle());
	}
}