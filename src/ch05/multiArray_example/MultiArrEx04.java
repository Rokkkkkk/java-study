package ch05.multiArray_example; //단어 맞추기

import java.util.*;

public class MultiArrEx04 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"},
                {"computer","컴퓨터"},
                {"BABO","김가윤"}
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
            }
        }
    }
}
