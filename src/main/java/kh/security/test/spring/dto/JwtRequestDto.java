package kh.security.test.spring.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
@Getter
@Setter
public class JwtRequestDto {

    private String email;
    private String password;

    @Override
    public String toString() {
        return "JwtRequestDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
