package com.sixessense.admin.report.command.application.dto.request;

import com.sixessense.admin.report.command.domain.aggregate.entity.enumtype.ReportType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CreateReportRequest {


    private Long reportNo;

    private ReportType reportType;

    private String reportContent;

    private Long reviewNo;

    public CreateReportRequest(Long reviewNo){
        this.reviewNo = reviewNo;
    }

}
