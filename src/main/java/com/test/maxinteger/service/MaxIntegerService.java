package com.test.maxinteger.service;


import org.springframework.stereotype.Component;

import com.test.maxinteger.dto.ResponseInteger;
import com.test.maxinteger.exception.MaxIntegerException;

@Component
public class MaxIntegerService {

    public ResponseInteger getMaxInteger(Integer xInteger, Integer yInteger, Integer nInteger){
       try {
         ResponseInteger response = new ResponseInteger();

        int maxKInteger = Integer.MIN_VALUE;
        for (int k = 0; k <= nInteger; k++) {
            if ((k % xInteger) == yInteger) {
                maxKInteger = Math.max(maxKInteger, k);
            }
        }
        maxKInteger = ((maxKInteger >= 0 && maxKInteger <= nInteger) ? maxKInteger : -1);
        response.setMaximumInteger(maxKInteger);
        return response;
       } catch (Exception e) {
        throw new MaxIntegerException("Maximum integer not found");
       }
    }
    
}
