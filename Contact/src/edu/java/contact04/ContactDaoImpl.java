package edu.java.contact04;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

// MVC(Model - View - Controller) 아키텍쳐에서 Controller를 구현하는 글래스.
// singleton 디자인 패턴을 적용.

public class ContactDaoImpl implements ContactDao {
	// (singleton step 1) singleton 
	private static ContactDaoImpl instance = null;
	
	// (singleton step 2) constructor
	private ContactDaoImpl() {};
	
	// (singleton step 3) method
	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		return instance;
	}
	
	// fields
	private List<Contact> contacts = new ArrayList<>();
	
	//methods
	
	/**
	 * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인지를 리턴.
	 * @param index 유효한 인덱스인지 검사할 인덱스.
	 * @return 사용 가능한 인덱스는 true, 그렇지 않으면 false.
	 */
	public boolean isValidIndex(int index) {
		return (index >= 0) && (index < contacts.size());
	}
	
	// CRUD(Create, Read, Update, Delete) 기능 메서드들:
	@Override
	public void create(Contact contact) {
		contacts.add(contact);
		return;
	}

	@Override
	public List<Contact> read() { 
		// -> contacts 배열에 저장된 원소 개수의 크기를 갖는 새로운 배열을 생성.
		return contacts;
	}

	@Override
	public Contact read(int index) {
		if (isValidIndex(index)) {
			return contacts.get(index);
		} else {
			return null;
		}
	}

	@Override
	public int update(int index, Contact contact) {
		if (!isValidIndex(index)) { // 유효한 인덱스이면
		    return 0;
		} 
		contacts.set(index, contact);
		return 1;
	}

	@Override
	public int delete(int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
		contacts.remove(index);
		return 1;
	}

}
