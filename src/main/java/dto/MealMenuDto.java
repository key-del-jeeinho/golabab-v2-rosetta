package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import enum_type.MealType;
import lombok.Builder;

import java.util.List;

@Builder
public record MealMenuDto (
        @JsonProperty("id") long id,
        @JsonProperty("meal") MealType mealType, //해당 식단이 조식인지, 중식인지, 석식인지를 명시한다
        @JsonProperty("menu") List<String> menu //식단 메뉴
) {}
