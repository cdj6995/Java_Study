package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain02 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();	// 딱 한번만 쓰기 때문에 이렇게 쓴다
			
			String sql = "select * from t_test";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
//				String name = rs.getString(2);		// 위의 결과와 동일
				
				System.out.println("id : " + id + ", name : " + name);
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCClose.close(pstmt, conn);
		}
	}
}









