package com.example.hyupup_tool.entity.dto.user;


import lombok.NonNull;

public record LoginRequest(
        @NonNull
        String email,
        @NonNull
        String pw

) {
}
