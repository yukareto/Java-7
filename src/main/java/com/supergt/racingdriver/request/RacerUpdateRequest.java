package com.supergt.racingdriver.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class RacerUpdateRequest {
    public String givenName;

    public String familyName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public RacerUpdateRequest(String givenName, String familyName, LocalDate birthday) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.birthday = birthday;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}

