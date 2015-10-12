package org.devefx.spring.validator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.devefx.validator.core.Validator;

public class SaveValidator extends Validator {

	@Override
	protected void validate(HttpServletRequest request, HttpServletResponse response) {
		validateRequiredString("nickname", "nickname", "�ǳƲ���Ϊ��");
		validateRequiredString("password", "password", "���벻��Ϊ��");
		validateString("password", 6, 20, "password", "���볤����6-20λ");
		validateEqualField("password", "pass_again", "pass_again", "�������벻һ��");
		validateRequiredString("email", "email", "���䲻��Ϊ��");
		validateEmail("email", "email", "�����ʽ����");
		validateRequiredString("mobile", "mobile", "�ֻ��Ų���Ϊ��");
		validateMobile("mobile", "mobile", "�ֻ���ʽ����");
	}

	@Override
	protected void handleError(HttpServletRequest request, HttpServletResponse response) {
		renderJSONError();
	}

}
