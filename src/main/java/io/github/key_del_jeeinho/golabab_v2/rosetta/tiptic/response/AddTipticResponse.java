package io.github.key_del_jeeinho.golabab_v2.rosetta.tiptic.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * POST Method Request 를 통해 팁틱 메세지를 추가할 때, Response Data를 담는 DTO 입니다.
 * 
 * @author 지인호
 * @since 1.3.0
 * 
 * @param id 추가한 팁틱 메세지의 id입니다.
 * @param message 추가한 팁틱 메세지 본문입니다.
 * @param createdAt 팁틱을 추가한 날짜입니다.
 */
public record AddTipticResponse (
        @JsonProperty("id") long id,
        @JsonProperty("message") String message,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        @JsonProperty("createdAt") Date createdAt
) {}
