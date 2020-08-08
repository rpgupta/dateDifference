package com.spring.daydiff.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.daydiff.model.DateBean;

public interface DateRepository extends JpaRepository<DateBean, Integer> {

	List<DateBean> findAll();

	DateBean save(DateBean policy);

}
