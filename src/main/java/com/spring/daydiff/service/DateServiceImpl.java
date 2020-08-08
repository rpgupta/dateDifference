package com.spring.daydiff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.daydiff.model.DateBean;
import com.spring.daydiff.repository.DateRepository;

@Service
public class DateServiceImpl implements DateService {

	@Autowired
	DateRepository dateRepository;

	@Override
	public List<DateBean> findAll() {
		// TODO Auto-generated method stub
		return dateRepository.findAll();
	}

	@Override
	public DateBean save(DateBean dateBean) {
		// TODO Auto-generated method stub
		return dateRepository.save(dateBean);
	}

}
