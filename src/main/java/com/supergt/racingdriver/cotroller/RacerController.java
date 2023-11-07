package com.supergt.racingdriver.cotroller;

import com.supergt.racingdriver.request.MessageRequest;
import com.supergt.racingdriver.response.MessageResponse;
import com.supergt.racingdriver.response.RacerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
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


    @PostMapping("/racers")
    public ResponseEntity<MessageResponse> createracer(@RequestBody @Validated MessageRequest messageRequest, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/racers/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body(new MessageResponse("トップチェッカー"));
    }

    @PatchMapping("/racers/{id}")
    public MessageResponse updateracer(@PathVariable int id, @RequestBody @Validated MessageRequest messageRequest) {
        return new MessageResponse("コースレコード");
    }

    @DeleteMapping("/racers/{id}")
    public MessageResponse deleteracer(@PathVariable int id) {
        return new MessageResponse("エンジンブロー");
    }
}
