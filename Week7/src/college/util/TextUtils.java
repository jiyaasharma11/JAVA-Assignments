package college.util;

public class TextUtils {
    private static int count = 0;

    private TextUtils() {}

    public static String normalizeName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is required");
        }

        String[] words = name.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1));
            result.append(" ");
        }

        count++;
        return result.toString().trim();
    }

    public static int getCount() {
        return count;
    }
}