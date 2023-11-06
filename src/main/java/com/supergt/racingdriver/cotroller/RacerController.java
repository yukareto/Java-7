package com.supergt.racingdriver.cotroller;

import com.supergt.racingdriver.response.RacerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class RacerController {

    // givenName・familyName・birthdayの内容を全てJSON形式で表示
    @GetMapping("/racers")
    public List<RacerResponse> getDrivers() {
        return List.of(
                new RacerResponse("kamie", "kobayasi", LocalDate.of(1986, 9, 13)),
                new RacerResponse("ritomo", "miyata", LocalDate.of(1999, 8, 10)),
                new RacerResponse("zyuihi", "wakisaka", LocalDate.of(1972, 7, 29)));
    }
}
