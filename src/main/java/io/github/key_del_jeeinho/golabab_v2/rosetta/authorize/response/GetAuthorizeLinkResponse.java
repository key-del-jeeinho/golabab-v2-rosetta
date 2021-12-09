package io.github.key_del_jeeinho.golabab_v2.rosetta.authorize.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GET Method Request 를 통해 인증링크를 발급하고 가져올 때, Response Data를 담는 DTO 입니다.
 *
 * @author 지인호
 * @since 1.2.1
 *
 * @param link 발급한 인증 링크 입니다.
 */
public record GetAuthorizeLinkResponse(
    @JsonProperty("link") String link
) {}
