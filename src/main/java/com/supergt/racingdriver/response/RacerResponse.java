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

    public class Response {
        private String message;

        public Response(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public class RacerCreateResponse extends Response {
        public RacerCreateResponse(String message) {
            super(message);
        }
    }

    public class RacerUpdateResponse extends Response {
        public RacerUpdateResponse(String message) {
            super(message);
        }
    }

    public class RacerDeleteResponse extends Response {
        public RacerDeleteResponse(String message) {
            super(message);
        }
    }
}
