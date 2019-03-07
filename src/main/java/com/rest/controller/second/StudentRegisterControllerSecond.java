package com.rest.controller.second;

/**

 * @author prate

 *

 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.model.StudentRegistration;
import com.model.StudentRegistrationReply;

@Controller

public class StudentRegisterControllerSecond {

	@RequestMapping(method = RequestMethod.POST, value="/register/student/test")

	@ResponseBody

	StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studentregd) {

		StudentRegistrationReply stdregreply = new StudentRegistrationReply();

		stdregreply.setName(studentregd.getName());

		stdregreply.setAge(studentregd.getAge());

		stdregreply.setRegistrationNumber("123456789");

		stdregreply.setRegistrationStatus("Successful");

		return stdregreply;

	}

}