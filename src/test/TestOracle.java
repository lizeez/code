package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestOracle {
	public void testOracle() {
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet result = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�����������ݿ�");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "system";
			String password = "147";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("���ӳɹ�");
			String sql = "SELECT * FROM student WHERE name=?";
			pre = con.prepareStatement(sql);
			result = pre.executeQuery();
			while(result.next()) {
				System.out.println("ѧ��" + result.getInt("id") + "����" + result.getString("name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(result != null)
					result.close();
				if(pre != null)
					pre.close();
				if(con != null)
					con.close();
				System.out.println("�ر����ݿ�");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
