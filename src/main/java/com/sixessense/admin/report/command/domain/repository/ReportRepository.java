package com.sixessense.admin.report.command.domain.repository;

import com.sixessense.admin.report.command.domain.aggregate.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
