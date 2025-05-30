package org.lucky0111.pettalkmcpserver.domain.dto.error;

import lombok.Builder;

@Builder
public record ErrorResponseDTO (
        int status,
        String error,
        String message,
        String path
){

}
//// 빌더 패턴 사용 (Lombok이 생성)
//ErrorResponseDTO errorResponse = ErrorResponseDTO.builder()
//        .status(401)
//        .error("Unauthorized")
//        .message("인증 정보 누락 또는 유효하지 않음")
//        .path("/api/v1/...")
//        .build();