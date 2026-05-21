package be_study.quiz.quiz26;

public class Circle {
	

	double radius; //반지름

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getArea(){
		return radius * radius * 3.14;
		
//		double area = radius * radius * 3.14;
//		return area;
	}

}
