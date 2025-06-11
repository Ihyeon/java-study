package ch02.sec02;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';      // 문자 저장
        char c2 = 65;       // 유니코드 직접 저장 (10진수)
        char c3 = '\u0041'; // 유니코드 직접 저장 (16진수)

        char c4 = '가';     // 문자 저장
        char c5 = 44032;    // 유니코드 직접 저장 (10진수)
        char c6 = '\uac00'; // 유니코드 직접 저장 (16진수)

        int uniCode = c1;  // 유니코드 얻기 (자동 형변환)
//        char c = ''; // 컴파일 에러
        char c = ' '; // 공백 (유니코드 32)를 포함하여 초기화해야 함

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);
    }
}