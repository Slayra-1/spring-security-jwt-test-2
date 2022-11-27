package kh.security.test.spring.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
@Getter
@Setter
public class MemberSignupRequestDto {

    private String email;
    private String password;
    private String name;

    @Override
    public String toString() {
        return "MemberSignupRequestDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
