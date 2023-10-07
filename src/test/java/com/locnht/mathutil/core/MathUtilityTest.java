
package com.locnht.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MathUtilityTest {
    
    //Cấu trúc Test Case: ID | Description | Steps/Procedures | Expected Result | Status
    //Test Case #1 - Verify getFactorial(with n = 0)
    //Steps:
    //      1. Given n = 0
    //      2. Call/invoke getFactorial(n = 0)
    //Expected Result:
    //      the method must return 1 as the result of 0!
    //Status: PASSED | FAILED đoán xem, chờ code xong, chạy mới biết được
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
       
    }
    
    //Test case #2 - Verify getFactorial(with n = 1)
    //Steps:
    //      1. Given n =1
    //      2. Call/invoke getFactorial(n = 1)
    //Expected Result:
    //      the method must return 1 as the result of 1!
    //Status: 
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
       
    }
    
    //Test case #3: ...
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals(120, MathUtility.getFactorial(5));
       
    }
    
    
}
