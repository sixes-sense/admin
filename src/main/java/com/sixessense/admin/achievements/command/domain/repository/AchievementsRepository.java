package com.sixessense.admin.achievements.command.domain.repository;

import com.sixessense.admin.achievements.command.domain.aggregate.entity.Achievements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementsRepository extends JpaRepository<Achievements, Long> {
}
