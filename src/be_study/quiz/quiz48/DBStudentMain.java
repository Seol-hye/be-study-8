package be_study.quiz.quiz48;

import java.util.List;

public class DBStudentMain {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();
		
		int[] deptnos = {101, 102};

		List<StudentScoreDTO> list =
				studentDAO.findStudentScoreList(deptnos);

		for(StudentScoreDTO studentDTO : list){
		    System.out.println(studentDTO);
		}
		
		System.out.println("-----------------------------------------");
		
		StudentDAO studentScoreDAO = new StudentDAO();
		List<StudentScoreDTO> list1 = studentScoreDAO.findStudentScoreListByDeptno(101);
		
		for(StudentScoreDTO s : list1) {
			System.out.println(s);
		}
		
																			//  201   103 
		List<StudentScoreDTO> list2 = studentScoreDAO.findStudentScoreListByDeptno(102);
		for(StudentScoreDTO s : list2) {
			System.out.println(s);
		}

	}

}
