package neos.com.parenthesisnormalizer;

import java.util.ArrayList;

public class ParenthesisNormalizer {
    public String normalizer(String input) throws Exception {
        if (input == null || input.isEmpty()) {
            throw new Exception("Chuỗi đầu vào không hợp lệ");
        }

        ArrayList<String> openMark = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
        }

        return input;
    }
}