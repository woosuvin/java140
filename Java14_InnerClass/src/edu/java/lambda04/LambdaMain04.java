package edu.java.lambda04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaMain04 {

	public static void main(String[] args) {
		LambdaMain04 app = new LambdaMain04();
		
		List<Object> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Object> odds = app.filter(list, new MyFilter() { // 클래스 만드는 곳에서 바로 생성(익명 클래스).
			
			@Override
			public boolean check(Object x) {
				return ((Integer) x) % 2 == 1;
			}
		});
		System.out.println(odds);
		
		List<Object> evens = app.filter(list, x -> ((Integer) x) % 2 == 0); // 익명 클래스를 간단히 쓰는 방법이 람다표현식. (check의 argument) -> (check의 리턴값)
		System.out.println(evens);
		
		List<Object> squares = app.mapper(list, new MyMapper() {
			
			@Override
			public Object transform(Object x) {
				return ((Integer) x) * ((Integer) x);
			}
		});
		System.out.println(squares);
		
		List<Object> adds = app.mapper(list, x -> ((Integer) x) + 10);
		System.out.println(adds);
	}
	
	public List<Object> filter(List<Object> list, MyFilter func) {
		List<Object> result = new ArrayList<>();
		
		for (Object x : list) {
			if (func.check(x)) {
				result.add(x);
			}
		}
		return result;
	}
	
	public List<Object> mapper(List<Object> list, MyMapper func) {
		List<Object> result = new ArrayList<>();
		
		for (Object x : list) { 
			result.add(func.transform(x)); // x를 다른값으로 바꿔서 리스트에 저장하겠다.
		}
		
		return result;
	}

}
