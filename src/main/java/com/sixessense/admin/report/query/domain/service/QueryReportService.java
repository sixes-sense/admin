package com.sixessense.admin.report.query.domain.service;

import com.sixessense.admin.report.query.domain.aggregate.entity.QueryReport;

import java.util.List;

public interface QueryReportService {

    List<QueryReport> getAllReport();
}
