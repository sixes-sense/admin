package com.sixessense.admin.review.command.domain.service;

import com.sixessense.admin.review.command.application.dto.comment.request.CreateCommentRequest;
import com.sixessense.admin.review.command.application.dto.comment.response.CreateCommentResponse;
import com.sixessense.admin.review.command.application.dto.comment.response.UpdateCommentResponse;

public interface CommentService {
    CreateCommentResponse createComment(CreateCommentRequest createCommentRequest, Long reviewNo);
    UpdateCommentResponse updateComment(Long reviewNo, String content, Long memberNo);
    void deleteOneComment(Long reviewNo, Long memberNo);
}
