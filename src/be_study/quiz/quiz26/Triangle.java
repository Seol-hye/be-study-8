package be_study.quiz.quiz26;

public class Triangle {
	
	double bottom; //밑변
	double height; //높이

	void setSize(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	double getArea(){
		return (bottom * height) / 2;
	}

}
