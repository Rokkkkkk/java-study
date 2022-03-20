package ch02;

import java.security.spec.RSAOtherPrimeInfo;

public class VarEx1 {
    public static void main(String[] args) {
        int year = 3;
        int age = 15;

        System.out.println(year);
        System.out.println(age);
        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
