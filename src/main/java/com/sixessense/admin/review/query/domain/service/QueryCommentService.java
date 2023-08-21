package com.sixessense.admin.review.query.domain.service;

import com.sixessense.admin.review.query.application.dto.response.ReadCommentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QueryCommentService {
    Page<ReadCommentResponse> commentLists(Long reviewNo, Pageable pageable);
}
