package com.spring.daydiff.service;

import java.util.List;

import com.spring.daydiff.model.DateBean;

public interface DateService {

	List<DateBean> findAll();

	DateBean save(DateBean policy);

}
