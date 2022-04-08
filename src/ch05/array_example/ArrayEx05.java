package ch05.array_example; //총합과 평균

public class ArrayEx05 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for(int i=0; i< score.length; i++) {
            sum += score[i];    //반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
        }
        average = sum / (float)score.length;

        System.out.println("총점 : " +sum);
        System.out.println("평균 : " +average);
    }
}
