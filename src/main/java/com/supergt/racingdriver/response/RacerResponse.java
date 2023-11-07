package com.supergt.racingdriver.response;

import java.time.LocalDate;

public class RacerResponse {
    private String givenName;
    public String familyName;
    public LocalDate birthday;

    public RacerResponse(String givenName, String familyName, LocalDate birthday) {
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
