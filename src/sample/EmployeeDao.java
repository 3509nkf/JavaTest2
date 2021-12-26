package sample;

import java.sql.PreparedStatement;

public class EmployeeDao {
	
	public void update(Employee employee) {
		String sql = "UPDATE employees SET name=? WHERE id=?";
	    //ステートメントオブジェクトを生成
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, employee.getName());
		stmt.setInt(2, employee.getId());
		
		//ステートメントの実行
		int num = stmt.execute();
		
		//データべースから切断
		stmt.close();
		
		return num;
	}

}
