package com.sixessense.admin.report.command.domain.aggregate.entity;

import com.sixessense.admin.report.command.application.dto.request.CreateReportRequest;
import com.sixessense.admin.report.command.domain.aggregate.entity.enumtype.ReportType;
import com.sixessense.admin.report.command.domain.aggregate.vo.ReporterVO;
import com.sixessense.admin.report.command.domain.aggregate.vo.ReviewInfoVO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Report_TB")
public class Report {

    @Id
    @Column(name = "report_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportNo;

    @Column(name = "report_date")
    private LocalDate reportDate;

    @Column(name = "report_content")
    private String reportContent;

    @Enumerated(EnumType.STRING)
    @Column(name = "report_type")
    private ReportType reportType;

    @Column(name = "blind_status")
    private Boolean blindStatus;

    @Embedded
    private ReviewInfoVO reviewInfoVO;

    @Embedded
    private ReporterVO reporterVo;


    public static Report toEntity(CreateReportRequest createReportRequest) {
        return Report.builder()
                .reportType(createReportRequest.getReportType())
                .reportContent(createReportRequest.getReportContent())
                .reviewInfoVO(new ReviewInfoVO(createReportRequest.getReviewNo()))
                .build();
    }



}
