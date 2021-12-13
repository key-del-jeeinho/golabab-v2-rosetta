package io.github.key_del_jeeinho.golabab_v2.rosetta.tiptic.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POST Method Request 를 통해 팁틱 메세지를 추가할 때, Request Data를 담는 DTO 입니다.
 *
 * @author 지인호
 * @since 1.3.0
 *
 * @param message 추가할 팁틱 메세지 본문입니다.
 */
public record AddTipticRequest(
        @JsonProperty("message") String message
) {}
