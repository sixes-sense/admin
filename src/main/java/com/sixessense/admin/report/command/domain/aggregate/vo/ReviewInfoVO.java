package com.sixessense.admin.report.command.domain.aggregate.vo;

import com.sixessense.admin.review.command.domain.aggregate.vo.ReviewWriterVO;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Getter
@NoArgsConstructor
public class ReviewInfoVO {

    @Column(name = "review_title")
    private String reviewTitle;

    @Embedded
    @Column(name = "review_writer")
    private ReviewWriterVO reviewWriter;
}
