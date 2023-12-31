package com.sixessense.admin.report.command.application.dto.response;

import com.sixessense.admin.report.command.domain.aggregate.entity.Report;
import com.sixessense.admin.report.command.domain.aggregate.entity.enumtype.ReportType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class CreateReportResponse {

    private Long reportNo;

    private String reportTypeLabel; // 선택한 enum 보여주기 용도

    private String reportContent;

    private LocalDate reportDate;

    private Long reviewNo;

    public static CreateReportResponse fromReport(Report report) {
        ReportType reportType = report.getReportType();

        return CreateReportResponse.builder()
                .reportNo(report.getReportNo())
                .reportTypeLabel(reportType.getKoreanLabel()) // 한국어 레이블 사용
                .reportContent(report.getReportContent())
                .reportDate(report.getReportDate())
                .reviewNo(report.getReviewInfoVO().getReviewNo())
                .build();
    }
}
