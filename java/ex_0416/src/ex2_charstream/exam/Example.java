package ex2_charstream.exam;

import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        int upper = 0; 
        int lower = 0;
        
        
        try (FileReader fr = new FileReader("test.txt")) {
            int code;
            
            while ((code = fr.read()) != -1) {
                // 1. 대문자인지 확인 (A~Z)
                if (code >= 'A' && code <= 'Z') {
                    upper++;
                } 
                // 2. 소문자인지 확인 (a~z)
                else if (code >= 'a' && code <= 'z') {
                    lower++;
                }
            }
            
            System.out.println("대문자 : " + upper);
            System.out.println("소문자 : " + lower);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}