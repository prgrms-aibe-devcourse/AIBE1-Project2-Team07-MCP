package org.lucky0111.pettalkmcpserver.domain.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TokenType {
    ACCESS("accessToken"),
    REFRESH("refreshToken");
    private final String name;
}
