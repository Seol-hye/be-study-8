package be_study.quiz.quiz47;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v3.DBConnectionManager;
import be_study.db.v3.ProfessorDTO;

public class StudentDAO {

	public List<StudentDTO> findStudentList() {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " select studno, name, id, grade, jumin, "
				+ " TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
				+ " tel, height, weight, deptno1, deptno2, profno "
				+ " from student ";

		List<StudentDTO> studentList = new ArrayList<>();

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				// 데이터가 있다
				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(rs.getString("birthday"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentList.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;

	}

	public List<StudentDTO> findStudentListByGrade(int grade) {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		String sqlQuery = " select studno, name, id, grade, jumin, "
				+ "TO_CHAR(birthday, 'YYYY-MM-DD') birthday, "
				+ "tel, height, weight, deptno1, deptno2, profno"
				+ " from student where grade = ? ";

		List<StudentDTO> studentList = new ArrayList<>();

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, grade); //첫번째 ?에 grade 값 넣기
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				// 데이터가 있다
				StudentDTO student = new StudentDTO();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(rs.getString("birthday"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));

				studentList.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;

	}
	
	public int saveStudent(StudentDTO studentDTO) {

		Connection conn = null;
		PreparedStatement psmt = null;

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " insert into student "
				+ " values (?, ?, ?, ?, ?, "
				+ " TO_DATE('2000-05-31', 'YYYY-MM-DD'), ?, "
				+ " ?, ?, ?, ?, ?) ";

		int result = 0;

		try {

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, studentDTO.getStudno());   // 학번
			psmt.setString(2, studentDTO.getName());  // 이름
			psmt.setString(3, studentDTO.getId());    // 아이디
			psmt.setInt(4, studentDTO.getGrade());   // 학년
			psmt.setString(5, studentDTO.getJumin());// 주민번호
			psmt.setString(6, studentDTO.getTel());  // 전화번호
			psmt.setInt(7, studentDTO.getHeight());  // 키
			psmt.setInt(8, studentDTO.getWeight());  // 몸무게
			psmt.setInt(9, studentDTO.getDeptno1());// 학과1
			psmt.setInt(10, studentDTO.getDeptno2());// 학과2
			psmt.setInt(11, studentDTO.getProfno());// 교수번호

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}

		return result;
	}

}
