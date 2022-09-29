public class hm1 {
    public static void main(String[] args) {

        // 1. Разложить число 200345 на разряды в десятичной системе

        // 200345 = 2*10^5 + 0*1^4 + 0*10^3 + 3*10^2 + 4*10^1 + 5*10^0
        // 2*100000 + 3*100 + 4*10 * 5*1

        //2.Перевести 637 из десятичной в шестнадцатиричную и обратно.
       int test = 637;
        System.out.println(Integer.toHexString(test));

        int test1 = 0x27D;
        System.out.println(Integer.toString(test1));


        //3. Перевести 637 из десятичной в двоичную

        // 6*2^2+ 3*2^1 + 7*2^0

        int test2 = 637;
       System.out.println(Integer.toBinaryString(test2));
        // result = 1001111101


        // 4. 11100111 перевести в десятичную
         int test3 = 0b11100111;
        double result = 1*Math.pow(2,7) + 1*Math.pow(2,6) + 1*Math.pow(2,5) + 0*Math.pow(2,4) + 0*Math.pow(2,3) + 1*Math.pow(2,2) + 1*Math.pow(2,1) + 1*Math.pow(2,0);
        System.out.println((int)result);
        //result = 231.0

        // 5. Перевести 637 из десятичной в троичную

        //System.out.println(637 / 3);
        //System.out.println(637 % 3); // 1

        //System.out.println();

        //System.out.println(212 / 3); // 70
        //System.out.println(212 % 3); // 2

        //System.out.println();

        //System.out.println(70 / 3); // 23
        //System.out.println(70 % 3); //1

        //System.out.println();

        //System.out.println(23 / 3); // 7
        //System.out.println(23 % 3); // 2

        //System.out.println();

        //System.out.println( 7 / 3); // 2
        //System.out.println(7 % 3);// 1

        //System.out.println();
        //System.out.println(2 / 3); // 0
        //System.out.println(2 % 3); // 2

        //result (212121);
    }
}
