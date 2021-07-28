import java.util.*;

public class Converter {
    static Map<String, Integer> numsMap = new HashMap<>();

    static {
        numsMap.put("I", 1);
        numsMap.put("II", 2);
        numsMap.put("III", 3);
        numsMap.put("IV", 4);
        numsMap.put("V", 5);
        numsMap.put("VI", 6);
        numsMap.put("VII", 7);
        numsMap.put("VIII", 8);
        numsMap.put("IX", 9);
        numsMap.put("X", 10);
    }

    public boolean isRoman(String s) {
        return (numsMap.containsKey(s));
    }

    public boolean isArab(String s) {
        try {
            int i = Integer.parseInt(s);
            return (numsMap.containsValue(i));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Введено некорректное выражение");
        }
    }

    public int romanToArab(String s) {
        return numsMap.get(s);
    }

    public static String arabToRoman(int input) {
        if (input < 1)
            return "Число " + input + " невозможно перевести в римский формат";
        String s = "";
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }


}
