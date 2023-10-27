package com.supergt.racingdriver.cotroller;

import com.supergt.racingdriver.request.RacerCreateRequest;
import com.supergt.racingdriver.request.RacerUpdateRequest;
import com.supergt.racingdriver.response.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RacerController {

    // givenName・familyName・birthdayの内容を全てJSON形式で表示
    @GetMapping("/drivers")
    public List<RacerResponse> getDrivers() {
        return List.of(
                new RacerResponse("kamie", "kobayasi", LocalDate.of(1986, 9, 13)),
                new RacerResponse("ritomo", "miyata", LocalDate.of(1999, 8, 10)),
                new RacerResponse("zyuihi", "wakisaka", LocalDate.of(1972, 7, 29)));
    }

    // クエリパラメータを取得して、文字列と値を返す
    @GetMapping("/racers")
    public RacerQueryResponse queryResponse(@RequestParam(defaultValue = "name") String name) {
        Map<String, String> racerList = new HashMap<>();
        racerList.put("kamie", "kobayasi");
        racerList.put("ritomo", "miyate");
        racerList.put("zyuihi", "wakisaka");


        // racerListにある名前を指定した場合
        for (String key : racerList.keySet()) {
            if (key.equals(name)) {
                return new RacerQueryResponse("優勝者は" + name + "" + racerList.get(name) + "さん");
            }
        }
        //  racerListにない名前を指定したときは
        return new RacerQueryResponse("リタイヤ");
    }


    @PostMapping("/racers")
    public ResponseEntity<RacerCreateResponse> createRacer(@RequestBody @Validated RacerCreateRequest racerCreateRequest, UriComponentsBuilder uriComponentsBuilder) {
        URI uri = uriComponentsBuilder.path("/racers/{id}").buildAndExpand(1).toUri();
        return ResponseEntity.created(uri).body(new RacerCreateResponse("トップチェッカー"));
    }


    @PatchMapping("/racers/{id}")
    public RacerUpdateResponse updateracer(@PathVariable int id, @RequestBody @Validated RacerUpdateRequest racerUpdateRequest) {
        return new RacerUpdateResponse("コースレコード");
    }

    @DeleteMapping("/racers/{id}")
    public RacerDeleteResponse deleteracer(@PathVariable int id) {
        return new RacerDeleteResponse("エンジンブロー");
    }
}
