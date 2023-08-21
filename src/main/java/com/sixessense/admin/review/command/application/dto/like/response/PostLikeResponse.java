package com.sixessense.admin.review.command.application.dto.like.response;

import com.sixessense.admin.review.command.domain.aggregate.entity.ReviewLikes;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PostLikeResponse {
    private Long reviewNo;

    private Long memberNo;

    private Boolean isLiked;

    public static PostLikeResponse fromEntity(ReviewLikes reviewLikes) {
        return PostLikeResponse.builder()
                .reviewNo(reviewLikes.getReviewNo())
                .memberNo(reviewLikes.getMemberNo())
                .isLiked(reviewLikes.getIsLiked())
                .build();
    }
}
