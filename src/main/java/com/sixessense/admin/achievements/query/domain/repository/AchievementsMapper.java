package com.sixessense.admin.achievements.query.domain.repository;

import com.sixessense.admin.achievements.query.domain.entity.Achievements;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AchievementsMapper {

    List<Achievements> getAchievements();

    void insertAchievements(Achievements achievements);
}
