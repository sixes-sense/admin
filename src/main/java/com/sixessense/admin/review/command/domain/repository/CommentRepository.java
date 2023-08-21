package com.sixessense.admin.review.command.domain.repository;

import com.sixessense.admin.review.command.domain.aggregate.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Comment findByReviewReviewNoAndMemberNo(Long reviewNo, Long memberNo);
}
