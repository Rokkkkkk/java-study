package ch04.for_example;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i  2*i  2*i-1  i*i  11-i  i%3  i/3");
        System.out.println("----------------------------------------------");

        for(int i=1;i<=10;i++)
            System.out.printf("%d  %d  %d  %d  %d  %d  %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
    }
}
