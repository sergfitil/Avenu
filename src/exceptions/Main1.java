package exceptions;

public class Main1 {
    public static void main(String[] args) {
        StringUtlsImpl utls = new StringUtlsImpl();
        utls.div("222","333");
        System.out.println(utls.div("222","33"));
    }
}
