/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author acer
 */
public class MathUtil {
    //n! = 1.2.3.4.5....n 
    //0! = 1! = 1
    //ko tính được giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 số 0
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid input");
            //gặp lệnh này hàm dừng liền không cần return
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
