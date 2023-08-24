package com.sixessense.admin.report.query.application.service;

import com.sixessense.admin.report.query.domain.aggregate.entity.QueryReport;
import com.sixessense.admin.report.query.domain.repository.QueryReportRepository;
import com.sixessense.admin.report.query.domain.service.QueryReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryReportServiceImp implements QueryReportService {

    private final QueryReportRepository reportRepository;

    public QueryReportServiceImp(QueryReportRepository queryReportRepository) {
        this.reportRepository = queryReportRepository;
    }

    @Override
    public List<QueryReport> getAllReport() {
        return reportRepository.findAll();
    }
}
