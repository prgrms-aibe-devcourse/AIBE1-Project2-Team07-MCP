package org.lucky0111.pettalkmcpserver.domain.entity.review;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lucky0111.pettalkmcpserver.domain.common.BaseTimeEntity;
import org.lucky0111.pettalkmcpserver.domain.entity.match.UserApply;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Setter
@Getter
@Entity
@Table(name = "reviews", indexes = {
        @Index(name = "idx_review_apply", columnList = "apply_id"),
        @Index(name = "idx_review_rating", columnList = "rating")
})
@NoArgsConstructor
public class Review extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apply_id")
    private UserApply userApply;

    @Column(nullable = false)
    @Min(1)
    @Max(5)
    private Integer rating;

    private String reviewImageUrl;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String comment;
}
