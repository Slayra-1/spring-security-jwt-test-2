package kh.security.test.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
@Getter
@AllArgsConstructor
public class JwtResponseDto {
    private String accessToken;
}
