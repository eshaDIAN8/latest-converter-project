package com.city.tempconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.city.tempconverter.model.Convert;

@Repository
public interface ConvertRepo extends JpaRepository<Convert, Integer>{

	
	//@Query(" select u FROM CONVERT WHERE  frmUnit=:fromUnit and toUnt=:toUnit")
	public double findFormulaByUnit(String fromUnit, String toUnit);

	

	

}
