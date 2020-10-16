import java.util.Map;
import java.util.TreeMap;

public class RomanNumber {
    private static TreeMap<Integer, String> associativeMap = new TreeMap<>();

    static {
        associativeMap.put(0, "Undefined value in Roman numerals!");
        associativeMap.put(1, "I");
        associativeMap.put(2, "II");
        associativeMap.put(3, "III");
        associativeMap.put(4, "IV");
        associativeMap.put(5, "V");
        associativeMap.put(6, "VI");
        associativeMap.put(7, "VII");
        associativeMap.put(8, "VIII");
        associativeMap.put(9, "IX");
        associativeMap.put(10, "X");
        associativeMap.put(11, "XI");
        associativeMap.put(12, "XII");
        associativeMap.put(13, "XIII");
        associativeMap.put(14, "XIV");
        associativeMap.put(15, "XV");
        associativeMap.put(16, "XVI");
        associativeMap.put(17, "XVII");
        associativeMap.put(18, "XVIII");
        associativeMap.put(19, "XIX");
        associativeMap.put(20, "XX");
        associativeMap.put(21, "XXI");
        associativeMap.put(22, "XXII");
        associativeMap.put(23, "XXIII");
        associativeMap.put(24, "XXIV");
        associativeMap.put(25, "XXV");
        associativeMap.put(26, "XXVI");
        associativeMap.put(27, "XXVII");
        associativeMap.put(28, "XXVIII");
        associativeMap.put(29, "XXIV");
        associativeMap.put(30, "XXX");
        associativeMap.put(31, "XXXI");
        associativeMap.put(32, "XXXII");
        associativeMap.put(33, "XXXIII");
        associativeMap.put(34, "XXXIV");
        associativeMap.put(35, "XXXV");
        associativeMap.put(36, "XXXVI");
        associativeMap.put(37, "XXXVII");
        associativeMap.put(38, "XXXVIII");
        associativeMap.put(39, "XXXIX");
        associativeMap.put(40, "XL");
        associativeMap.put(41, "XLI");
        associativeMap.put(42, "XLII");
        associativeMap.put(43, "XLIII");
        associativeMap.put(44, "XLIV");
        associativeMap.put(45, "XLV");
        associativeMap.put(46, "XLVI");
        associativeMap.put(47, "XLVII");
        associativeMap.put(48, "XLVIII");
        associativeMap.put(49, "XLIX");
        associativeMap.put(50, "L");
        associativeMap.put(51, "LI");
        associativeMap.put(52, "LII");
        associativeMap.put(53, "LIII");
        associativeMap.put(54, "LIV");
        associativeMap.put(55, "LV");
        associativeMap.put(56, "LVI");
        associativeMap.put(57, "LVII");
        associativeMap.put(58, "LVIII");
        associativeMap.put(59, "LIX");
        associativeMap.put(60, "LX");
        associativeMap.put(61, "LXI");
        associativeMap.put(62, "LXII");
        associativeMap.put(63, "LXIII");
        associativeMap.put(64, "LXIV");
        associativeMap.put(65, "LXV");
        associativeMap.put(66, "LXVI");
        associativeMap.put(67, "LXVII");
        associativeMap.put(68, "LXVIII");
        associativeMap.put(69, "LXIX");
        associativeMap.put(70, "LXX");
        associativeMap.put(71, "LXXI");
        associativeMap.put(72, "LXXII");
        associativeMap.put(73, "LXXIII");
        associativeMap.put(74, "LXXIV");
        associativeMap.put(75, "LXXV");
        associativeMap.put(76, "LXXVI");
        associativeMap.put(77, "LXXVII");
        associativeMap.put(78, "LXXVIII");
        associativeMap.put(79, "LXXIX");
        associativeMap.put(80, "LXXX");
        associativeMap.put(81, "LXXXI");
        associativeMap.put(82, "LXXXII");
        associativeMap.put(83, "LXXXIII");
        associativeMap.put(84, "LXXXIV");
        associativeMap.put(85, "LXXXV");
        associativeMap.put(86, "LXXXVI");
        associativeMap.put(87, "LXXXII");
        associativeMap.put(88, "LXXXVIII");
        associativeMap.put(89, "LXXXIX");
        associativeMap.put(90, "XC");
        associativeMap.put(91, "XCI");
        associativeMap.put(92, "XCII");
        associativeMap.put(93, "XCIII");
        associativeMap.put(94, "XCIV");
        associativeMap.put(95, "XCV");
        associativeMap.put(96, "XCVI");
        associativeMap.put(97, "XCVII");
        associativeMap.put(98, "XCVIII");
        associativeMap.put(99, "XCIX");
        associativeMap.put(100, "C");
    }

    public static String toRoman(Integer number) {
        return associativeMap.get(number);
    }

    public static String toArab(String number) {
        int result = -1;

        for (Map.Entry<Integer, String> item : associativeMap.entrySet()) {
            if (item.getValue().equals(number)) {
                result = item.getKey();
            }
        }

        return Integer.toString(result);
    }
}

