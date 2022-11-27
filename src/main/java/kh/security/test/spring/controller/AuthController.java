package kh.security.test.spring.controller;

import kh.security.test.spring.dto.JwtRequestDto;
import kh.security.test.spring.dto.JwtResponseDto;
import kh.security.test.spring.dto.MemberSignupRequestDto;
import kh.security.test.spring.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "login", produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody JwtRequestDto request) {
        try {
            JwtResponseDto login = authService.login(request);

            return login.getAccessToken();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @PostMapping(value = "signup", produces = MediaType.APPLICATION_JSON_VALUE)
    public String signup(@RequestBody MemberSignupRequestDto request) {
        return authService.signup(request);
    }
}
