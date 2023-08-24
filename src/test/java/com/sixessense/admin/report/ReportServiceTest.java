package com.sixessense.admin.report;

import com.sixessense.admin.report.command.domain.aggregate.entity.enumtype.ReportType;
import com.sixessense.admin.report.query.application.service.QueryReportServiceImp;
import com.sixessense.admin.report.query.domain.aggregate.entity.QueryReport;
import com.sixessense.admin.report.query.domain.repository.QueryReportRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class ReportServiceTest {

    @Autowired
    private QueryReportServiceImp queryReportServiceImp;

    @Autowired
    private QueryReportRepository reportRepository;

    private static QueryReport report1, report2;

    @BeforeEach
    void setUp() {
        report1 = QueryReport.builder().reportNo(1L).reportType(ReportType.FALSE_CONTENT).reportContent("").build();
        report2 = QueryReport.builder().reportNo(2L).reportType(ReportType.OTHER).reportContent("테스트 신고 내용").build();

        reportRepository.saveAll(List.of(report1, report2));

    }

    @Test
    @DisplayName("관리자 신고 목록 조회")
    void CheckAdminReportList() {

        List<QueryReport> reports = queryReportServiceImp.getAllReport();

        assertEquals(2, reports.size());

        assertEquals(report1.getReportType(), reports.get(0).getReportType());
        assertEquals(report2.getReportType(), reports.get(1).getReportType());
    }
}


