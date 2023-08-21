package com.sixessense.admin.review.command.domain.service;


import com.sixessense.admin.review.command.application.dto.like.request.PostLikeRequest;
import com.sixessense.admin.review.command.application.dto.like.response.PostLikeResponse;
import com.sixessense.admin.review.command.application.dto.review.request.CreateReviewRequest;
import com.sixessense.admin.review.command.application.dto.review.request.UpdateReviewRequest;
import com.sixessense.admin.review.command.application.dto.review.response.CreateReviewResponse;
import com.sixessense.admin.review.command.application.dto.review.response.UpdateReviewResponse;

public interface ReviewService {

    CreateReviewResponse reviewSave(CreateReviewRequest reviewDTO);

    UpdateReviewResponse reviewUpdate(UpdateReviewRequest updateReviewRequest, Long reviewNo);

    void reviewDelete(Long reviewNo);

    PostLikeResponse countLike(Long reviewNo, PostLikeRequest clickLikesDTO);
}
