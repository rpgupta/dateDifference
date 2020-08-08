package com.spring.daydiff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.daydiff.model.DateBean;
import com.spring.daydiff.service.DateService;
import com.spring.daydiff.util.DateDiffUtil;

@RequestMapping("/solution")
@Controller
public class DateController {

	@Autowired
	DateService dateService;

	@RequestMapping("/showDateForm")
	public String showDateForm(Model model) {

		DateBean dateValues = new DateBean();
		model.addAttribute("dateValues", dateValues);
		return "dateForm";
	}

	@RequestMapping("/submitDateForm")
	public String submitForm(Model model, @ModelAttribute DateBean dateValues) {

		String toDate = dateValues.getToDate();
		String fromDate = dateValues.getFromDate();
		String dateDiff = DateDiffUtil.evaluate(toDate, fromDate);
		dateValues.setDaysDiff(dateDiff);
		dateService.save(dateValues);
		model.addAttribute("dateValues", dateValues);
		return "dateForm";
	}

	@RequestMapping("/showDataForm")
	public String showDataForm(Model model) {

		List<DateBean> list = dateService.findAll();
		model.addAttribute("list", list);
		return "dataForm";
	}

}
