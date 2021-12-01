package io.github.key_del_jeeinho.golabab_v2.rosetta.lunch;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;
import java.util.Map;

@Builder
public record DayMenuDto (
        @JsonProperty("id") long id,
        @JsonProperty("menu") Map<MealType, List<String>> menu //하루동안 나올 식단 메뉴
    ) {}
