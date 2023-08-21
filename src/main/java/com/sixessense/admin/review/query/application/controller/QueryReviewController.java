package com.sixessense.admin.review.query.application.controller;


import com.sixessense.admin.review.query.application.dto.response.ReadReviewResponse;
import com.sixessense.admin.review.query.application.service.QueryReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/v1/reviews")
@RequiredArgsConstructor
public class QueryReviewController {

    private final QueryReviewServiceImpl queryReviewService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<Page<ReadReviewResponse>> reviewLists(@PageableDefault(sort = "review_no", direction = Sort.Direction.DESC) Pageable pageable){
        Page<ReadReviewResponse> readReviewResponses = queryReviewService.getReviews(pageable);

        return ResponseEntity.ok(readReviewResponses);
    }

    @GetMapping("/{reviewNo}")
    @ResponseBody
    public ResponseEntity<ReadReviewResponse> reviewDetail(@PathVariable Long reviewNo){
        ReadReviewResponse readReviewResponse = queryReviewService.getReviewDetail(reviewNo);

        return ResponseEntity.ok(readReviewResponse);
    }
}
