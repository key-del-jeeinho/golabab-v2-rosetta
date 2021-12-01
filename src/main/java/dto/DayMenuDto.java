package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import enum_type.MealType;
import lombok.Builder;

import java.util.List;
import java.util.Map;

@Builder
public record DayMenuDto (
        @JsonProperty("id") long id,
        @JsonProperty("menu") Map<MealType, List<String>> menu //하루동안 나올 식단 메뉴
    ) {}
