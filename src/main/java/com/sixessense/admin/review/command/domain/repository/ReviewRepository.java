package com.sixessense.admin.review.command.domain.repository;

import com.sixessense.admin.review.command.domain.aggregate.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Review findByReviewNo(Long reviewNo);
}