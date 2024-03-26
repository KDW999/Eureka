package com.ssafy.card.Auth.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayTokenResponse {
    private int cardId;
    private String cardIdentifier;
    private String grantType;
    private String accessToken;
    private String refreshToken;
}
