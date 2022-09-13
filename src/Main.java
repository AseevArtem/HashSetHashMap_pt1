import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String field = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Map<Character, Integer> map = new HashMap<>();
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;


        for (int i = 0; i < field.length(); i++) {
            char symbol = field.charAt(i);
            if (Character.isLetter(symbol)) {
                if (map.containsKey(symbol)) {
                    int value = map.get(symbol);
                    value += 1;
                    map.put(symbol, value);
                } else
                    map.put(symbol, 1);
            }
        }
        System.out.println(map);

        for (int max : map.values()) {
            if (maxValue < max) {
                maxValue = max;
            }
        }
        System.out.println("Максимальное количество одинаковых символов (пробелы не учитываются) - " + maxValue);

        for (int min : map.values()) {
            if (minValue > min) {
                minValue = min;
            }
        }
        System.out.println("Минимальное количество одинаковых символов (пробелы не учитываются) - " + minValue);
    }
}

