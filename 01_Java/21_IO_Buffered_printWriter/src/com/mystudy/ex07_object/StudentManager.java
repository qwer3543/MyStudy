package com.mystudy.ex07_object;

import java.util.ArrayList;
import java.util.List;

//학생 데이터 관리(CRUD)
public class StudentManager {
	private List<StudentVO> list;
	
	public StudentManager() {
		list = new ArrayList<StudentVO>();
	}
	
	public List<StudentVO> getList() {
		return list;
	}
	public void setList(List<StudentVO> list) {
		this.list = list;
	}

	//학생정보 CRUD --------------------------
	//학생 입력(C) : 리턴값 - 입력된 학생수
	public int insertData(StudentVO vo) {
		list.add(vo);
		return 0;
	}
	
	//학생 조회(R) : id로 조회
	public StudentVO selectData(StudentVO vo) {
		
		return null;
	}
	
	//학생 수정(U) : 리턴값 수정된 학생수
	public int updateData(StudentVO vo) {
		
		return 0;
	}
	
	//학생 삭제(D) : 리턴값 - 삭제된 학생수
	public int deleteData(StudentVO vo) {
		
		return 0;
	}
	
	//-----------------------------
	public StudentVO selectData(String id) {
		
		return null;
	}
	
	public List<StudentVO> selectDataName(String name) {
		
		return null;
	}
	
	// id로 찾아서 삭제
	public int deleteData(String id) {
		
		return 0;
	}
	
	// name 찾아서 삭제
	public int deleteDataName(String name) {
		
		return 0;
	}
	
}











