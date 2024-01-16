package ru.itmo.java.basics.p5;

import java.util.Locale;

public class Pr5_3 {
    public void enter() {
        String text =
                "Слово бяка является русским ругательством, которое широко используется в разговорной речи. Однако, у этого слова также есть несколько других значений, которые важно учитывать при использовании его в разных контекстах." +
                        "Можно наизусть заучить, что в одном случае у человека повышается адреналин в крови, а в другом происходит спазм кишечника или ещё какая-нибудь бяка.Это означает, что эта бяка очень переменчива как во внешности, так и в характере.";
        String textCensoredWord = text;
        System.out.println(replaceSubstring(textCensoredWord, "БЯКА", "[вырезано цензурой]"));


    }public static String replaceSubstring(String text, String oldWord, String newWord) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            if (temp.toLowerCase().equals(oldWord.toLowerCase())) {
                words[i] = newWord;
            }
        }
        String newText = "";
        for (String word : words) {
            newText += word + " ";
        }
        return newText;
    }
}
