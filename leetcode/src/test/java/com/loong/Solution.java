package com.loong;

class Solution {
    public int reverse(int x) {
        try {
            if(x > 0){
                StringBuffer stringBuffer = new StringBuffer();
                return Integer.parseInt(stringBuffer.append(x).reverse().toString());
            }else {
                String xs = String.valueOf(x);
                String ee = xs.substring(0,1);
                String ss = xs.substring(1,xs.length());
                StringBuffer stringBuffer = new StringBuffer(ss);
                return Integer.parseInt(ee+stringBuffer.reverse().toString());
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
    }
}