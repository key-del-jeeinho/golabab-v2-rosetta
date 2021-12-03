package io.github.key_del_jeeinho.golabab_v2.rosetta.lunch;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 조/중/석식 식단 메뉴 정보를 담고있는 DTO 입니다.
 * 급식 조회에 사용됩니다.
 *
 * @author 지인호
 * @since 1.0.0
 */

public record MealMenuDto (
        @JsonProperty("id") long id,
        @JsonProperty("meal") MealType mealType, //해당 식단이 조식인지, 중식인지, 석식인지를 명시한다
        @JsonProperty("menu") List<String> menu //식단 메뉴
) {}
