package com.supergt.racingdriver.request;

import java.time.LocalDate;

public class MessageRequest {
    private String givenName;

    private String familyName;

    private LocalDate birthday;

    public MessageRequest(String givenName, String familyName, LocalDate birthday) {
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
