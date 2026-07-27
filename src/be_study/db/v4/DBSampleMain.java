package be_study.db.v4;

public class DBSampleMain {

	public static void main(String[] args) {

		
		//student
		//department
		
		
		int pk = 9511;
		
		StudentDAO studentDAO = new StudentDAO();
		
		StudentDTO s1 = studentDAO.findStudentByStudno(pk);
		
		System.out.println(s1);
		
		
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO d1 = departmentDAO.findDepartmentByDeptno(s1.getDeptno1());
		System.out.println(d1);
		
		System.out.println(s1.getName() + "" + d1.getDname());
		
		
		// 2) join 쿼리 포함해서 한번 합쳐진 DTO 객체로 전달
		
		StudentMypageDTO smDTO = studentDAO.findStudentMypageByStudno(pk);
		System.out.println(smDTO);
		
				
		

	}

}
