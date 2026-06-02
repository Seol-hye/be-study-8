package be_study.quiz.quiz39;

class ExcerciseInstanceof {
	public static void main(String[] args) {
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
			
	} // main

	public static void action(Robot r) {
		if( r instanceof DanceRobot ) {
			((DanceRobot)r).dance();
		} else if( r instanceof SingRobot ) {
			((SingRobot)r).sing();
		} else if( r instanceof DrawRobot ) {
			((DrawRobot)r).draw();
		}
	}

}
