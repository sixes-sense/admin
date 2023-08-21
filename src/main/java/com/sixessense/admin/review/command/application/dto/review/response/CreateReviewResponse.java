package com.sixessense.admin.review.command.application.dto.review.response;


import com.sixessense.admin.review.command.domain.aggregate.entity.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@Builder
public class CreateReviewResponse {
    private Long reviewNo;

    private String reviewTitle;

    private String reviewContent;

    private LocalDate reviewDate;

    private Long tagNo;

    private Long reviewWriter;

    public static CreateReviewResponse toCreateResponse(Review review) {
        return CreateReviewResponse.builder()
                .reviewTitle(review.getReviewTitle())
                .reviewContent(review.getReviewContent())
                .tagNo(review.getTagNo().getTagNo())
                .reviewWriter(review.getReviewWriter().getReviewWriterMemberNo())
                .build();
    }
}
