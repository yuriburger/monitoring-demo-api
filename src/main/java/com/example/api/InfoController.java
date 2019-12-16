package com.example.api;

import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/info")
public class InfoController {
    @Autowired
    TelemetryClient telemetryClient;

    @GetMapping(path = "", produces = "application/json")
    public ResponseEntity<Object> getInfo() {
        telemetryClient.trackEvent("Info requested...");
        return new ResponseEntity<>("{\"version\": \"1.0\"}", HttpStatus.OK);
    }
}
