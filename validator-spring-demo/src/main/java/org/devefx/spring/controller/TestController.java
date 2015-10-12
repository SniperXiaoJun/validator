package org.devefx.spring.controller;

import org.devefx.spring.validator.SaveValidator;
import org.devefx.validator.annotation.RequstValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/doSave")
	@RequstValidator(SaveValidator.class)
	public void doSave() {
		System.out.println("��֤�ɹ�����������");
	}
}
