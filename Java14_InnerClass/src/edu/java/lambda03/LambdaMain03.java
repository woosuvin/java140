package edu.java.lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class LambdaMain03 {

	public static void main(String[] args) {
		// Employee를 원소로 갖는 list 선언, 초기화
		
		
		List<Employee> employees = Arrays.asList(
				new Employee(100, "이찬희", "개발1팀", "대리", 400.0),
				new Employee(101, "지대한", "개발2팀", "사원", 350.0),
				new Employee(102, "김다훈", "개발2팀", "과장", 380.0),
				new Employee(103, "유다한", "개발1팀", "부장", 500.0),
				new Employee(104, "강효남", "인사팀", "사원", 300.0),
				new Employee(105, "위태욱", "인사팀", "과장", 1000.0)
		);
		
		// 1. 모든 직원들의 정보를 한 줄에 한 명씩 출력.
//		for (Employee x : employees) {
//			System.out.println(x);
//		}
		employees.forEach(System.out::println);
		employees.forEach(x -> System.out.println(x));
		
		// 2. 개발1, 2팀에서 일하는 직원들의 급여의 합계를 출력.
		double sum = 0;
		for (Employee x : employees) {
			if (x.getDept().contains("개발")) {
				sum += x.getSalary();
			}
		}
		System.out.println("문제 2번: " + sum);
		
		double result2 = employees.stream().filter(x -> x.getDept().contains("개발")).mapToDouble(x -> x.getSalary()).sum(); // mapToDouble(더블로 mapping 하겠다)
		System.out.println("문제 2번: " + result2);
		
		// 3. 개발 1, 2팀에서 일하는 직원들의 급여의 평균을 출력.
		double avg = 0;
		for (Employee x: employees) {
			if (x.getDept().contains("개발")) {
				avg = sum / x.getDept().length();
			}
		}
		System.out.println("문제 3번: " + avg);
		
		Double result3 = employees.stream().filter(x -> x.getDept().contains("개발")).mapToDouble(x -> x.getSalary()).average().orElseThrow(); // orElseThrow(더블을 계산할 수 없으면 exception)
		System.out.println("문제 3번: " + result3);
		
		// 4. 직급이 사원인 직원들의 급여의 합계를 출력.
		double sum2 = 0;
		for (Employee x : employees) {
			if (x.getEmpTitle().equals("사원")) {
				sum2 += x.getSalary();
			}
		}
		System.out.println("문제 4번: " + sum2);
		
		double result4 = employees.stream().filter(x -> x.getEmpTitle().equals("사원")).mapToDouble(x -> x.getSalary()).sum();
		System.out.println("문제 4번: " + result4);
		
		// 5. 직급이 사원인 직원들의 급여의 평균을 출력.
		double avg2 = 0;
		for (Employee x : employees) {
			if(x.getEmpTitle().equals("사원")) {
				avg2 = sum2 / x.getEmpTitle().length();
			}
		}
		System.out.println("문제 5번: " + avg2);
		
		double result5 = employees.stream().filter(x -> x.getEmpTitle().equals("사원")).mapToDouble(x -> x.getSalary()).average().orElseThrow();
		System.out.println("문제 5번: " + result5);
		
		// 6. 급여가 400 이상인 직원들의 정보를 한 줄에 한 명씩 출력.
		System.out.println("문제 6번:");
		employees.stream().filter(x -> x.getSalary() >= 400.0).forEach(x -> System.out.println(x));
		
		// 7. 개발1팀 직원들의 급여를 10% 인상하고, 그 직원들의 급여 평균을 계산하고 출력.
//		List<Employee> dept1 = new ArrayList<>();
//		for (Employee x : employees) {
//			if(x.getDept().equals("개발1팀")) {
//				x.setSalary(x.getSalary()*1.1);
//				dept1.add(x);
//			}
//		}
//		double sum3 = 0;
//		double avg3 = 0;
//		for (Employee x : dept1) {
//			sum3 += x.getSalary();
//		}
//		avg3 = sum3 / dept1.size();
//		System.out.println("문제 7번: " + avg3);
		
		double result7 = employees.stream().filter(x -> x.getDept().equals("개발1팀")).mapToDouble(x -> x.getSalary() * 1.1).average().orElseThrow();
		System.out.println("문제 7번: " + result7);
		
		// 8. 직원 리스트에서 "사원"은 몇 명?
		long result8 = employees.stream().filter(x -> x.getEmpTitle().equals("사원")).count();
		System.out.println("문제 8번: " + result8);
		
		
	}

}
