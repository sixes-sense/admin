package com.sixessense.admin.report.command.domain.aggregate.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
public class ReporterVO {

    @Column(name = "report_member_no")
    // 신고자
    private Long reporter;

}