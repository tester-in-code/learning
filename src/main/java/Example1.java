public class Example1{

    // Zabawa ze string API
    public static void main(String []args)
    {
        String mielosc = "kocham Wunie";
        String enter = "\n";
        System.out.println("\n" + mielosc + " i ciusia");

        mielosc = mielosc + " i ciusia";
        mielosc = mielosc.toUpperCase();

        char literka = mielosc.charAt(2);
        System.out.println(literka);

    }
}
