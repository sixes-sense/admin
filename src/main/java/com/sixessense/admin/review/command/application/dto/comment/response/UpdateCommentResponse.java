package com.sixessense.admin.review.command.application.dto.comment.response;

import com.sixessense.admin.review.command.domain.aggregate.entity.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdateCommentResponse {
    private Long memberNo;
    private String commentContent;

    public static UpdateCommentResponse fromEntity(Comment comment) {
        return UpdateCommentResponse.builder()
                .memberNo(comment.getMemberNo())
                .commentContent(comment.getCommentContent())
                .build();
    }
}
