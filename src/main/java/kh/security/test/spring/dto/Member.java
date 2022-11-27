package kh.security.test.spring.dto;

import kh.security.test.spring.model.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
@Getter
@Entity
@NoArgsConstructor
public class Member {

    @Id
    private String email;
    private String password;
    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Member(MemberSignupRequestDto request) {
        this.email = request.getEmail();
        this.password = request.getPassword();
        this.name = request.getName();
        this.role = Role.USER;
    }

    public void encryptPassword(PasswordEncoder passwordEncoder) {
        password = passwordEncoder.encode(password);
    }
}
