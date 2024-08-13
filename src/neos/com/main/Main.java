package neos.com.main;

import neos.com.parenthesisnormalizer.ParenthesisNormalizer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParenthesisNormalizer normalizer = new ParenthesisNormalizer();

        System.out.print("Nhập vào một chuỗi dấu ngoặc: ");
        String input =  scanner.nextLine();

        try {
            String result = normalizer.normalizer(input);
            System.out.println("Chuỗi đã chuẩn hóa: " + result);
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}