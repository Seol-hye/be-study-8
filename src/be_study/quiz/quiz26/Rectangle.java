package be_study.quiz.quiz26;

public class Rectangle {
	
	double bottom; //밑변
	double height; //높이

	Rectangle(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	double getArea(){
		return bottom * height;
	}

}
