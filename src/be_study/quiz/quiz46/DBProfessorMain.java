package be_study.quiz.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v1.Dept;
import be_study.quiz.quiz45.Product;

public class DBProfessorMain {

	public static void main(String[] args) {
		
		
		List<Professor> profList = findProfessorListByDeptno(201);
		
		if( profList.size() == 0 ) { //초기화는 O, 추가된 데이터가 X
									// --> 조회된 데이터가 없다
			System.out.println("데이터가 없다...");
		} else {
			
			for(Professor p : profList) {
				System.out.println( p.toString() );
			}
		}
		
	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행할 쿼리 준비
		String sqlQuery = " select profno, name, id, position, pay, deptno "
							+ " from professor "
							+ " where deptno = ? ";
		

		List<Professor> profList = new ArrayList<>();

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회

				// 데이터가 있다

				// 한줄 조회 한 행 데이터
				// 한 행 데이터 -> Dept 객체 저장
				// List<Dept> .add(Dept)

				// column 이름(별칭) 기준 조회 -> 권장
				Professor prof = new Professor();

				prof.setProfno(rs.getInt("profno"));
				prof.setName(rs.getString("name"));
				prof.setId(rs.getString("id"));
				prof.setPosition(rs.getString("position"));
				prof.setPay(rs.getInt("pay"));
				prof.setDeptno(rs.getInt("deptno"));

				profList.add(prof);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null)
				rs.close(); // null 객체 메소드 호출 -> NullPointerException
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return profList;

	}

}
