package practice6;

public class decode {
    public static void main(String[] args) {
        Integer intValue1 = Integer.decode("12");        // десятичное
        Integer intValue2 = Integer.decode("0x12");      // шестнадцатеричное
        Integer intValue3 = Integer.decode("012");       // восьмеричное

        System.out.println("intValue1: " + intValue1);    
        System.out.println("intValue2: " + intValue2);    
        System.out.println("intValue3: " + intValue3);    
    }
}