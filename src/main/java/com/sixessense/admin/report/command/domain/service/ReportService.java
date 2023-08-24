package com.sixessense.admin.report.command.domain.service;

import com.sixessense.admin.report.command.application.dto.request.CreateReportRequest;
import com.sixessense.admin.report.command.application.dto.response.CreateReportResponse;

public interface ReportService {

    CreateReportResponse reportSave (CreateReportRequest reportRequest);


}
