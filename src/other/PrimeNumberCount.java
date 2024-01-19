package other;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCount {
    // 1, 3, 5, 7, 9
    static List<String> targetList = new ArrayList<>();
    static List<String> target1List = new ArrayList<>();
    static List<String> target3List = new ArrayList<>();
    static List<String> target5List = new ArrayList<>();
    static List<String> target7List = new ArrayList<>();
    static List<String> target9List = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 2; i <= 12345; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if (i % j == 0 && i == j) {
                    if (i < 10) {
                        String iStr = "0" + i;
                        targetList.add(iStr);
                    } else {
                        targetList.add(String.valueOf(i));
                    }
                }
            }
        }

        for (String str : targetList) {
            String[] split = str.split("");
            switch (split[split.length - 1]) {
                case "1" -> target1List.add(str);
                case "3" -> target3List.add(str);
                case "5" -> target5List.add(str);
                case "7" -> target7List.add(str);
                case "9" -> target9List.add(str);
            }
        }
        System.out.println("1: " + target1List.size());
//        System.out.println("1" + target1List);
        System.out.println("3: " + target3List.size());
//        System.out.println("3" + target3List);
        System.out.println("5: " + target5List.size());
//        System.out.println("5" + target5List);
        System.out.println("7: " + target7List.size());
//        System.out.println("7" + target7List);
        System.out.println("9: " + target9List.size());
//        System.out.println("9" + target9List);
    }
}