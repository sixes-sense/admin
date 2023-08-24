package com.sixessense.admin.report.query.domain.repository;

import com.sixessense.admin.report.query.domain.aggregate.entity.QueryReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryReportRepository extends JpaRepository<QueryReport, Long> {
}
