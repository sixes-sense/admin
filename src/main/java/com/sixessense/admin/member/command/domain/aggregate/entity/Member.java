package com.sixessense.admin.member.command.domain.aggregate.entity;

import com.sixessense.admin.common.entity.BaseTimeEntity;
import com.sixessense.admin.member.command.domain.aggregate.entity.enumType.RoleEnum;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Member_TB")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_no")
    @Comment("회원번호")
    private Long id;

    @NotBlank
    @Comment("회원 이름")
    private String name;

    @Comment("회원 닉네임")
    private String nickName;

    @Comment("회원 주소")
    private String address;

    @NotBlank
    @Comment("회원 이메일")
    private String email;

    @Comment("회원 핸드폰번호")
    private String phoneNum;

    @Enumerated(EnumType.STRING)
    @Comment("회원 권한")
    private RoleEnum roleEnum;

    public Member(Long id, String name, String nickName, String address, String email, String phoneNum, RoleEnum roleEnum) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
        this.roleEnum = roleEnum;
    }
}

