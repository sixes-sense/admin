package com.sixessense.admin.review.query.domain.service;

import com.sixessense.admin.review.query.application.dto.response.ReadReviewResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QueryReviewService {
    Page<ReadReviewResponse> getReviews(Pageable pageable);
    ReadReviewResponse getReviewDetail(Long reviewNo);

}
