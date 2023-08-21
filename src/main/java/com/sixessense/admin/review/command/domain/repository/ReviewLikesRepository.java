package com.sixessense.admin.review.command.domain.repository;

import com.sixessense.admin.review.command.domain.aggregate.entity.ReviewLikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewLikesRepository extends JpaRepository<ReviewLikes, Integer> {
    void deleteByReviewNoAndMemberNo(Long reviewNo, Long memberNo);

    ReviewLikes findByReviewNoAndMemberNo(Long reviewNo, Long memberNo);
}
