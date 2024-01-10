package ru.itmo.java.basics.p5;

public class Pr5_4 {
    public void enter() {
        String n =
                "А Танюша взяла книжку «Приключения Буратино», которую ей подарила тетя Катя, и начала читать.В моей комнате появился оранжевый, кожаный, пока еще туго открывающийся ранец с изображением Буратино.\n";
        String r = "Буратино";
        findSub(n, r);
    }

    public void findSub(String n, String r) {
        System.out.println(n);
        System.out.println(r);
        int u = 0;
        for (int i = 0;i < n.length();i++){
            if(n.contains(r)){
                u++;
                n = n.replaceFirst(r,"");

            }
        } System.out.println("Вхождений:"+u);

    }
}
