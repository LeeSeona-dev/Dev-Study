package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "service";
			String pw = "12345";

			conn = DriverManager.getConnection(url, id, pw);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//활 정보를 전부 가져오는 메서드
	public ArrayList<itemVO> BowchekAll() {

		ArrayList<itemVO> bowList= new ArrayList<>();
		getConn();
		try {
			String sql = "select * from Bow";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			//rs의 커서를 기준으로 다음에 데이터가 있는지 없는지 확인
			while(rs.next()) {
				BowVO item = new BowVO(0,null,0,0);
				item.setItemNum(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setAttackPower(rs.getInt(3));
				item.setDurability(rs.getInt(4));
				bowList.add(item); //upcasting => 
					   //bowVO는 ItemVo보다 아래 있지만 업캐스팅해서 해당 ArrayList에 들어갈 수 있다.
			}
			close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return bowList;
		
	}
	
	//칼 정보를 전부 가져오는 메서드
	
	public ArrayList<itemVO> SwordcheckAll(){
		ArrayList<itemVO> SwordList = new ArrayList<>();
		getConn();
		try {
			String sql = "select * from sword";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				swordVO item = new swordVO(0,null,0);
				item.setItemNum(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setAttackPower(rs.getInt(3));
				SwordList.add(item);
			}
			close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return SwordList;
		
	}
	
	
}
