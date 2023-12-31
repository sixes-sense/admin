package com.sixessense.admin.review.command.application.dto.review.request;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CreateReviewRequest {
    private String reviewTitle;

    private String reviewContent;

    private Long tagNo;

    private Long reviewWriter;
}
