package io.github.key_del_jeeinho.golabab_v2.rosetta.lunch;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * 일일 식단 메뉴 정보를 담고있는 DTO 입니다.
 * 급식 조회에 사용됩니다.
 *
 * @author 지인호
 * @since 1.0
 */

public record DayMenuDto (
        @JsonProperty("id") long id,
        @JsonProperty("menu") Map<MealType, List<String>> menu //하루동안 나올 식단 메뉴
    ) {}
