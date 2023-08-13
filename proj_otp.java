package mymodules.codes;
import java.util.Random;
public class proj_otp {
    public static String generator(){
        int num= (int) (Math.random()*9999)+1000;  // 9999 is maximum range and 1000 is the lowest range for the generator to generate the otp
        String otp= String.valueOf(num);
        return otp;
    }
    public static void main(String[] args) {
        String value=generator();
        System.out.println("your otp is "+value);
    }

}
