package com.my.hr.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.my.hr.domain.Laborer;
import com.my.hr.domain.NoneException;

public class LaborerDaoImpl implements LaborerDao {
	private List<Laborer> laborers;
	private int laborerIdSeq; // sequence
	
	public LaborerDaoImpl(List<Laborer> laborers) {
		this.laborers = laborers;
		this.laborerIdSeq = 1;
	}
	
	@Override
	public List<Laborer> selectLaborers() {
		return laborers;
	}
	// method가 data이다. 라는 문법을 나타내는 게 람다
	// 내부적으로 사용하는 메서드를 callback이라고 부른다. filter 내부에서 쓰는 람다식
	private Laborer selectLaborer(int laborerId) {
		List<Laborer> list = laborers.stream()
				// laborerId가 일치하는 laborer만을 스트림에 넣는다.
				.filter(laborer -> laborer.laborerId() == laborerId)
				.collect(Collectors.toList());
		
		Laborer laborer = null;
		if(list.size() != 0) laborer = list.get(0);
		
		return laborer; // laborerId가 일치하는 laborer를 못 찾았다면 null이 리턴된다.
	}
	
	@Override
	public void insertLaborer(String laborerName, LocalDate hireDate) {
		laborers.add(new Laborer(laborerIdSeq++, laborerName, hireDate));
	}
	
	@Override
	public void updateLaborer(Laborer laborer) {
		this.deleteLaborer(laborer.laborerId());
		laborers.add(laborer);
		// list는 key로 index를 쓰고 있다. 하지만 업무적으로는 laborerId가 키다.
		// 그러므로 sorting을 한다.
		// laborerId 메서드를 comparing 메서드의 파라미터로 넣어 준다.
		laborers.sort(Comparator.comparing(Laborer::laborerId));
	}
	
	@Override
	public void deleteLaborer(int laborerId) throws NoneException {
		Laborer laborer = selectLaborer(laborerId);
		if(laborer != null) laborers.remove(laborer);
		else throw new NoneException("해당 노동자가 없습니다.");
	}
}
