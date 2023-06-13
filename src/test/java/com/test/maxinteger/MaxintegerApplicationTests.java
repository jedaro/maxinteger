package com.test.maxinteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.maxinteger.exception.MaxIntegerException;
import com.test.maxinteger.service.MaxIntegerService;

@SpringBootTest
class MaxintegerApplicationTests {
	private Integer xInteger;
	private Integer yInteger;
	private Integer nInteger;

	@InjectMocks
	MaxIntegerService maxIntegerService;

	@Test
	public void getMaxInteger() {
	   // test 
      assertEquals(maxIntegerService.getMaxInteger(7, 5, 12345).getMaximumInteger(), 12339);
      assertEquals(maxIntegerService.getMaxInteger(5, 0, 4).getMaximumInteger(), 0);
	  assertEquals(maxIntegerService.getMaxInteger(10, 5, 15).getMaximumInteger(), 15);
	  assertEquals(maxIntegerService.getMaxInteger(17, 8, 54321).getMaximumInteger(), 54306);
	  assertEquals(maxIntegerService.getMaxInteger(499999993, 9, 1000000000).getMaximumInteger(), 999999995);
	  assertEquals(maxIntegerService.getMaxInteger(10, 5, 187).getMaximumInteger(), 185);
	  assertEquals(maxIntegerService.getMaxInteger(2, 0, 999999999).getMaximumInteger(), 999999998);

	}

}
