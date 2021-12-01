package io.github.key_del_jeeinho.golabab_v2.rosetta.account;

/**
 * 특정 유저의 권한을 나타내는 열거형 클래스 입니다.
 * <ol>
 * <li>DEVELOPER : 골라밥 개발자</li>
 * <li>ADMIN : 학생회장</li>
 * <li>OPERATOR : 학생회</li>
 * <li>USER : 학생</li>
 * </ol>
 *
 * @author 지인호
 * @since 1.0
 * @see AccountDto
 */
public enum Role {
    DEVELOPER, ADMIN, OPERATOR, USER
}
