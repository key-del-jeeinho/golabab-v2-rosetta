package io.github.key_del_jeeinho.golabab_v2.rosetta.authorize.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;

/**
 * GET Method Request 를 통해 인증링크를 발급하고 가져올 때, Request Data를 담는 DTO 입니다.
 *
 * @author 지인호
 * @since 1.2.0
 *
 * @param callbackUrl 유저가 인증링크에 접속시, 유저 정보를 전달할 콜백 URL 입니다.
 * @param email 인증 받을 유저의 이메일 입니다.
 * @param discordId 인증 받을 유저의 디스코드 아이디 입니다.
 * @param limitMinute 인증링크의 만료시간을 분단위로 설정합니다.
 */
public record GetAuthorizeLinkRequest(
        @URL @JsonProperty("callbackUrl") String callbackUrl,
        @Email @JsonProperty("email") String email,
        @JsonProperty("discordId") long discordId,
        @JsonProperty("limitMinute") int limitMinute
) {}
