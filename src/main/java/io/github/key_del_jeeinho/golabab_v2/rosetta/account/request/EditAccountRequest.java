package io.github.key_del_jeeinho.golabab_v2.rosetta.account.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.key_del_jeeinho.golabab_v2.rosetta.account.Role;

import javax.validation.constraints.Email;

/**
 * PATCH Method Request 를 통해 계정을 수정할 때, Response Data를 담는 DTO 입니다.
 *
 * @author 지인호
 * @since 1.1.0
 *
 * @param email 수정할 계정의 이메일 입니다.
 * @param role 수정할 계정의 직책입니다.
 * @param discordId 수정할 계정의 디스코드 아이디 입니다.
 */
public record EditAccountRequest(
        @Email @JsonProperty("email") String email,
        @JsonProperty("role") Role role,
        @JsonProperty("discordId") long discordId
) {}
