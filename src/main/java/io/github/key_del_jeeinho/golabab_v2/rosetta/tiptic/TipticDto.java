package io.github.key_del_jeeinho.golabab_v2.rosetta.tiptic;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

/**
 * 팁틱에 대한 정보를 담고있는 DTO 입니다.
 * 팁틱 알림 표시 및 팁틱 추가 등에 사용됩니다.
 *
 * @author 지인호
 * @since 1.0.0
 */
public record TipticDto (
        @JsonProperty("id") long id,
        @JsonProperty("message") String message, //팁틱 알림으로 표시할 메세지 입니다.
        @JsonProperty("createdAt") LocalDate createdAt //팁틱 알림 표시 알고리즘을 위해 팁틱 생성일을 저장합니다.
){}
