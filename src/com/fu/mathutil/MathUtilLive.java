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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(6);
        System.out.println("expected 5! = 120; actual: " + result);
        //đây là kĩ thuật kiểm thử 
        //ta phải đoán được kết quả ước lượng là bnhieu
        //acutal la thực tế hàm chạy được
    }
    
}
