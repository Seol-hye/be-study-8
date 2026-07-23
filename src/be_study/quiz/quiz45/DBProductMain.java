package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBProductMain {

	public static void main(String[] args) {

		Product p1 = findProductByPcode(105);
		
		
		if( p1 == null) {
			System.out.println("조회 데이터 없음");
		} else {
			System.out.println("===단일 행을 읽어서 리턴해서 출력하기===");
			System.out.println(p1.toString());
		}

		
		List<Product> productList = findProductList();

		if (productList == null) {
			System.out.println("조회 데이터가 없음");
		} else { // 데이터있음
			System.out.println("===객체 리스트 단위로 리턴해서 출력하기===");
			for (Product p : productList) {
				System.out.println(p.toString());
			}
		}

	}

	public static Product findProductByPcode(int pCode) {

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
		
		Product product = null;

		// 실행할 쿼리 준비
		String sqlQuery = " select * from product where p_code = ? ";

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치에 값 채우기)
			psmt.setInt(1, pCode);

			rs = psmt.executeQuery(); // 쿼리 실행

			// 조회한 데이터가 1개인 경우
			if (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				
				//데이터가 있다
				product = new Product();
				
				product.setpCode(rs.getInt("p_code"));
				product.setpName(rs.getString("p_name"));
				product.setpPrice(rs.getInt("p_price"));

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
		
		return product;

	}

	public static List<Product> findProductList() {

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
		String sqlQuery = " select * from product ";

		List<Product> ProductList = null;

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회

				// 데이터가 있다

				// 한줄 조회 한 행 데이터
				// 한 행 데이터 -> Dept 객체 저장
				// List<Dept> .add(Dept)

				// column 이름(별칭) 기준 조회 -> 권장

				Product p = new Product();
				
				p.setpCode(rs.getInt("p_code"));
				p.setpName(rs.getString("p_name"));
				p.setpPrice(rs.getInt("p_price"));

				if (ProductList == null) {
					ProductList = new ArrayList<>();
				}
				ProductList.add(p);
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

		return ProductList;

	}

}
