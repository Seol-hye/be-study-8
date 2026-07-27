package be_study.quiz.quiz47;

import java.util.List;

public class DBStudentMain {

	public static void main(String[] args) {

		StudentDAO studDAO = new StudentDAO();

		// 전체 조회
		List<StudentDTO> studentList = studDAO.findStudentList();

		for (StudentDTO student : studentList) {
			System.out.println(student);
		}

		System.out.println("-----------------------");

		// 1학년 학생 조회
		List<StudentDTO> studentList2 = studDAO.findStudentListByGrade(1);

		for (StudentDTO student : studentList2) {
			System.out.println(student);
		}

		System.out.println("-----------------------");

		// 학생 데이터 저장
		StudentDTO s1 = new StudentDTO();

		s1.setStudno(9999);
		s1.setName("홍길동");
		s1.setId("hong99");
		s1.setGrade(2);
		s1.setJumin("0005311234567");
		s1.setTel("01012345678");
		s1.setHeight(175);
		s1.setWeight(70);
		s1.setDeptno1(101);
		s1.setDeptno2(0);
		s1.setProfno(0);

		int result1 = studDAO.saveStudent(s1);

		if (result1 > 0) {
			System.out.println("정상 저장 성공");
		}

	}

}
