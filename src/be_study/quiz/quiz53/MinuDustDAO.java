package be_study.quiz.quiz53;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MinuDustDAO {

	public int insert(MinuDustDTO dto) {

		// DB 연결, 실행 객체
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();

		String sqlQuery = " INSERT INTO dust_week_forecast "
		        + " (pres_date, frcst_one_dt, frcst_one_cn, frcst_two_dt, frcst_two_cn, "
		        + "  frcst_three_dt, frcst_three_cn, frcst_four_dt, frcst_four_cn) "
		        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ";

		int result = 0;

		try {
			psmt = conn.prepareStatement(sqlQuery);

			psmt.setString(1, dto.getPresnatnDT());
			psmt.setString(2, dto.getFrcstOneDt());
			psmt.setString(3, dto.getFrcstOneCn());
			psmt.setString(4, dto.getFrcstTwoDt());
			psmt.setString(5, dto.getFrcstTwoCn());
			psmt.setString(6, dto.getFrcstThreeDt());
			psmt.setString(7, dto.getFrcstThreeCn());
			psmt.setString(8, dto.getFrcstFourDt());
			psmt.setString(9, dto.getFrcstFourCn());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}

}
