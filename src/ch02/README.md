# CH02

## 기본형(primitive type)
* 논리형(boolean)
* 문자형(char)
* 정수형(byte, short, int, long)
* 실수형(float, double)

- 변수(variable) : 하나의 값을 저장하기 위한 공간
- 상수(constant) : 값을 한번만 저장할 수 있는 공간
- 리터럴(literal) : 그 자체로 값을 의미하는것

```java
int year = 2014; // year = 변수, 2014 = 리터럴
final int MAX_VALUE = 100; // MAX_VALUE = 상수, 100 = 리터럴
```
1byte = 8bit, 1word = 4byte

## 2의 보수 계산법
전부 반전 시킨 후 + 1 나오는 숫자에 - 붙이기

## 자동형변환
* boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
* 기본형과 참조형은 서로 형변환할 수 없다.
* 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.


