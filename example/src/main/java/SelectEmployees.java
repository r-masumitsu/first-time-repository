import java.util.List;

import dao.EmployeesDAO;
import model.Employee;

public class SelectEmployees{
	public static void main(String[] args) {
		//EMPLOTEESテーブルの全レコードを取得
		EmployeesDAO employeesDAO = new EmployeesDAO();
		List<Employee> empList = employeesDAO.findAll();
		
		//取得したレコードの内容を出力
		for(Employee emp : empList) {
			System.out.println("ID：" + emp.getId());
			System.out.println("名前：" + emp.getName());
			System.out.println("年齢：" + emp.getAge());
		}
	}
}