package ru.itmo.java.basics.p5;

public class Pr5_4 {
    public void enter() {
        String string1 =
                "А Танюша взяла книжку «Приключения Буратино», которую ей подарила тетя Катя, и начала читать.В моей комнате появился оранжевый, кожаный, пока еще туго открывающийся ранец с изображением Буратино.0";
        String string2 = "Буратино";
        Integer countIncluding = compareStrings(string1, string2);
        System.out.println(countIncluding);}


        private static int compareStrings (String string1, String string2){
            int cnt = 0;
            String[] words = string1.split(" ");
            for (String word : words) {
                if (word.toLowerCase().contains(string2.toLowerCase())) {
                    cnt++;
                }
            }
            return cnt;
        }

    }

