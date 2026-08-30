public class StringFundamentals {

    static boolean hasText(String value) {
        return value != null && !value.isBlank();
    }

    static String normalizeCourseCode(String code) {
        if (code == null) {
            return null;
        }

        return code.trim().toUpperCase();
    }

    static int countOccurrences(String text, char target) {
        if (text == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
