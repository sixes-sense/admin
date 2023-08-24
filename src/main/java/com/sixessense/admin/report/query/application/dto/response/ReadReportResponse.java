package com.sixessense.admin.report.query.application.dto.response;

import com.sixessense.admin.report.command.domain.aggregate.entity.Report;
import com.sixessense.admin.report.command.domain.aggregate.entity.enumtype.ReportType;
import com.sixessense.admin.review.command.domain.aggregate.vo.ReviewWriterVO;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

@Getter
@Builder
public class ReadReportResponse {

    private Long reportNo;

    private LocalDate reportDate;

    private String reportContent;

    private ReportType reportType;

    private Boolean blindStatus;

    private Long reviewNo;

    private String reviewTitle;

    private ReviewWriterVO reviewWriter;

    private Long reporter;

    public static ReadReportResponse of(Report report) {
        return ReadReportResponse.builder()
                .reportNo(report.getReportNo())
                .reportDate(report.getReportDate())
                .reportContent(report.getReportContent())
                .reportType(report.getReportType())
                .blindStatus(report.getBlindStatus())
                .reviewNo(report.getReviewInfoVO().getReviewNo())
                .reviewTitle(report.getReviewInfoVO().getReviewTitle())
                .reviewWriter(report.getReviewInfoVO().getReviewWriter())
                .reporter(report.getReporterVo().getReporter())
                .build();
    }

    public static Page<ReadReportResponse> toDtoList(Page<Report> reports) {
        return reports.map(ReadReportResponse::of);
    }

}
