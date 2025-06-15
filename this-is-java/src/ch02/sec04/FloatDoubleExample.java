package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 실수값 저장
        double var1 = 3.14;
        // float var2 = 3.14;  // 컴파일 에러(Type mismatch) - 실수 리터럴은 기본적으로 double이므로 f 또는 F를 붙여서 float 리터럴임을 명시해줘야 한다
        float var3 = 3.14f;

        // 정밀도 테스트
        // 표현 가능한 정확한 소수 자릿수 - float: 약 6~7자리 / double: 약 15~17자리
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

        // e 사용하기
        int var6 = 3000000;
        double var7 = 3e6;
        float var8 = 3e6F;
        double var9 = 2e-3;
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
        System.out.println("var9: " + var9);
    }
}
