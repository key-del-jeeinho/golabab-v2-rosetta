package io.github.key_del_jeeinho.golabab_v2.rosetta.vote;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.Map;

/**
 * 급식 메뉴들의 투표 수에 따른 랭킹 정보를 담고있는 DTO 입니다.
 * 주로 웹 클라이언트를 통한 랭킹뷰어 기능을 위해 사용됩니다.
 *
 * @author 지인호
 * @since 1.0
 */

public record RankingDto (
        @JsonProperty("id") long id,
        @JsonProperty("ranking") Map<String, Integer> ranking // key: meal name, value: num of vote
) {}
