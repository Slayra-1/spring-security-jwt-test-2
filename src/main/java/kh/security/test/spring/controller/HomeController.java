package kh.security.test.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
@RestController
public class HomeController {

    @GetMapping("dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("admin")
    public String admin() {
        return "admin";
    }

}
