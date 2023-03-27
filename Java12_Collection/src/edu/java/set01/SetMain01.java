package edu.java.set01;

import java.util.TreeSet;

/*
 * Collection<E>
 * |__ List<E>
 *     |__ ArrayList<E>, LinkedList<E>, ...
 *     
 * Collection<E>
 * |__ Set<E>
 *     |__ HashSet<E>, TreeSet<E>, ...
 * 
 * Set의 특징:
 * 1. 중복된 값을 저장하지 않음. (예) {1, 2} = {1, 2, 1, 2}
 * 2. 저장하는 순서가 중요하지 않음 (인덱스가 없음). (예) {1, 2} = {2, 1}
 * 
 * HashSet: Hash 알고리즘(검색을 빠르게 할 수 있는 알고리즘)을 사용한 Set.
 * TreeSet: Tree 알고리즘(정렬을 빠르게 할 수 있는 알고리즘)을 사용한 Set.
 */

public class SetMain01 {

	public static void main(String[] args) {
		// String을 원소로 갖는 TreeSet 변수 선언, 객체 생성.
		TreeSet<String> set = new TreeSet<>();
		
		System.out.println("set size: " + set.size());
		System.out.println(set);
		
		set.add("a");
		
		
		
	}

}
