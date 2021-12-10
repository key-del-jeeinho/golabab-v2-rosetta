package io.github.key_del_jeeinho.golabab_v2.rosetta.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;

/**
 * 해당서비스를 이용하기위해 인증과정에 있는 계정의 정보를 담고있는 DTO 입니다.
 * 인증 및 가입로직을 수행하기위해 사용됩니다.
 *
 * @author 지인호
 * @since 1.0.0
 * @see AccountDto
 */
public record UnauthorizedAccountDto(
        @JsonProperty("id") long id,
        @Email @JsonProperty("expectedEmail") String expectedEmail, //사용자가 회원가입 및 인증 절차에서 입력한 이메일 입니다.
        @JsonProperty("discordId") long discordId //사용자의 디스코드 아이디 입니다.
) {}
