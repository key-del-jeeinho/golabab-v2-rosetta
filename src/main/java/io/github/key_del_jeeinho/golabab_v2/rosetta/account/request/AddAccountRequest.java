package io.github.key_del_jeeinho.golabab_v2.rosetta.account.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.key_del_jeeinho.golabab_v2.rosetta.account.Role;

/**
 * POST Method Request 를 통해 계정을 추가할 때, Request Body 의 Data 를 담는 DTO 입니다.
 *
 * @author 지인호
 * @since 1.1.0
 *
 * @param email 추가할 게정의 이메일 입니다.
 * @param role 추가할 계정의 직책입니다.
 * @param discordId 추가할 계정의 디스코드 아이디 입니다.
 */
public record AddAccountRequest (
        @JsonProperty("email") String email,
        @JsonProperty("role") Role role,
        @JsonProperty("discordId") long discordId
){}
