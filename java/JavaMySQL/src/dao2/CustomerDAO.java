package dao2;

import java.sql.Connection;

import common.DBUtil;
import dto2.CustomerDTO;

public class CustomerDAO {
	//고객 추가 메서드 
	//insertCustomer(CustomerDTO dto)
	public void inserCustomer(CustomerDTO dto) {
		String sql = "INSERT INTO customer(name, phone) values(?,?)";
		try (
			Connection conn = DBUtil.get){
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
