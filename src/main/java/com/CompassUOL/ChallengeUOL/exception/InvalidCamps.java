package com.CompassUOL.ChallengeUOL.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvalidCamps {
    private String camp;
    private String error;
}