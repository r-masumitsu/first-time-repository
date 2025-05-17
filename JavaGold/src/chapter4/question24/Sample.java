package chapter4.question24;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		Department tokyo = new Department("tokyo");
		Department osaka = new Department("osaka");
		List<Employee> list = List.of(
			new Employee("Johnny",tokyo),
			new Employee("Bond",osaka),
			new Employee("Mickey",tokyo),
			new Employee("Sara",osaka)
		);
		
		Map<Department, List<Employee>> result =
			list.stream().collect(
				Collectors.groupingBy(Employee::getDept)
			);
		
		//東京支店の従業員の名前を表示
		for(Employee employee : result.get(tokyo)) {
			System.out.print(employee.getName() + ":");
			System.out.println(employee.getDept().getName());
		}
		
		//大阪支店の従業員の名前を表示
		for(Employee employee : result.get(osaka)) {
			System.out.print(employee.getName() + ":");
			System.out.println(employee.getDept().getName());
		}
	}
	
	//追加
	private static class Employee{
		private String name;
		private Department department;
		public Employee(String name, Department department) {
			this.name = name;
			this.department = department;
		}
		public String getName() {
			return name;
		}
		public Department getDept() {
			return department;
		}
	}
}
