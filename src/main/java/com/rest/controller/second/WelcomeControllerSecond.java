package com.rest.controller.second;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Welcome;

@Controller

public class WelcomeControllerSecond {

private static final String welcomemsg = "Welcome Mr. %s!";

    @GetMapping("/welcome/user/test")

    @ResponseBody

    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {

        return new Welcome(String.format(welcomemsg, name));

    }

}