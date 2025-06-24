
/** TODO
    Задание 1
    Напишите программу, которая при запуске выводит ваше имя и фамилию на латинице.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(translate("Михаил Нефедов"));
    }

    public static String translate(String str)
    {
        return  str
        .replace(" ", " ")
        .replace("а", "a")
        .replace("б", "b")
        .replace("в", "v")
        .replace("г", "g")
        .replace("д", "d")
        .replace("е", "e")
        .replace("ё", "e")
        .replace("ж", "zh")
        .replace("з", "z")
        .replace("и", "i")
        .replace("й", "y")
        .replace("к", "k")
        .replace("л", "l")
        .replace("м", "m")
        .replace("н", "n")
        .replace("о", "o")
        .replace("п", "p")
        .replace("р", "r")
        .replace("с", "s")
        .replace("т", "t")
        .replace("у", "u")
        .replace("ф", "f")
        .replace("х", "h")
        .replace("ц", "ts")
        .replace("ч", "ch")
        .replace("ш", "sh")
        .replace("щ", "sch")
        .replace("ъ", "")
        .replace("ы", "i")
        .replace("ь", "")
        .replace("э", "e")
        .replace("ю", "ju")
        .replace("я", "ja")
        .replace("А", "A")
        .replace("Б", "B")
        .replace("В", "V")
        .replace("Г", "G")
        .replace("Д", "D")
        .replace("Е", "E")
        .replace("Ё", "E")
        .replace("Ж", "Zh")
        .replace("З", "Z")
        .replace("И", "I")
        .replace("Й", "Y")
        .replace("К", "K")
        .replace("Л", "L")
        .replace("М", "M")
        .replace("Н", "N")
        .replace("О", "O")
        .replace("П", "P")
        .replace("Р", "R")
        .replace("С", "S")
        .replace("Т", "T")
        .replace("У", "U")
        .replace("Ф", "F")
        .replace("Х", "H")
        .replace("Ц", "Ts")
        .replace("Ч", "Ch")
        .replace("Ш", "Sh")
        .replace("Щ", "Sch")
        .replace("Ъ", "")
        .replace("Ы", "I")
        .replace("Ь", "")
        .replace("Э", "E")
        .replace("Ю", "Ju")
        .replace("Я", "Ja");
    }
}