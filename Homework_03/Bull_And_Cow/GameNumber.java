package Bull_And_Cow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameNumber extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> array = new ArrayList<>();
        System.out.println("Вы можете выбрать символы для игры.");
        System.out.println("1 - цифры");
        System.out.println("2 - русский алфавит");
        System.out.println("любое другое значение - английский алфавит");
        Scanner sc = new Scanner(System.in);
        int selectionSymbols = sc.nextInt();
        sc.close();
        switch (selectionSymbols) {
            case 1:
                array = new ArrayList<>(
                        Arrays.asList("а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о",
                                "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"));
            case 2:
                array = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "h", "g", "i", "j", "k", "l", "m",
                        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
            default:
                array = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        }
        return array;
    }
}