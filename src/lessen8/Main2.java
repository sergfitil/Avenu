package lessen8;

public class Main2 {
    public static void main(String[] args) {


        System.out.println(TextUtils.deleteAllBreaks("I am , you are-"));
        System.out.println(TextUtils.deleteAllBreaks("I am ,. you are..."));
        System.out.println(TextUtils.reverseText("qwerty!!!"));
        System.out.println(TextUtils.summaGlasnih("уже прошла половина лета"));
        TextUtils.typeWordsSeparately("уже прошла половина лета");
        TextUtils.commonLetters("уже прошла половина лета","но остались самые теплые дни");
        System.out.println( TextUtils.wordСount("уже прошла половина лета"));
    }

}
