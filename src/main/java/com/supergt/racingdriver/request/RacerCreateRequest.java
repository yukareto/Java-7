package com.supergt.racingdriver.request;


import java.time.LocalDate;

public class RacerCreateRequest {


    private String givenName;

    private String familyName;
    
    private LocalDate birthday;

    public RacerCreateRequest(String givenName, String familyName, LocalDate birthday) {
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
