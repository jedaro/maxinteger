package com.test.maxinteger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.test.maxinteger.dto.ResponseInteger;
import com.test.maxinteger.exception.MaxIntegerException;
import com.test.maxinteger.service.MaxIntegerService;

@RestController
@RequestMapping("/")
public class MaxIntegerController {

    @Autowired
    MaxIntegerService maxIntegerService;

    @GetMapping("/")
    public String info() {

        return "Api test inclusioncloud";
    }

    @GetMapping("/max-integer")
    public ResponseEntity<ResponseInteger> getMaxInteger(
            @RequestParam(value = "xInteger", required = true) Integer xInteger,
            @RequestParam(value = "yInteger", required = true) Integer yInteger,
            @RequestParam(value = "nInteger", required = true) Integer nInteger) {

        try {

            return new ResponseEntity<ResponseInteger>(maxIntegerService.getMaxInteger(xInteger, yInteger, nInteger),
                    HttpStatus.OK);

        } catch (MaxIntegerException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Maximum integer not found");
        }
    }

}