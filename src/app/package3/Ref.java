package app.package3;

import java.io.InputStream;
import java.net.URL;

public class Ref {

    public void findReferenceVariable() {
        int firstInt = getNextInt();
        Integer secondInt = getNextInt();
        String text = "";
        InputStream file = Ref.class.getResourceAsStream("application.yml");
    }

    public static void getURL() {
        try {
            URL url = new URL("https://www.google.com");
            validateURL(url);
            System.out.println(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void validateURL(URL content) throws Exception {
        content = new URL("https://www.yahoo.com");
        if(!content.getProtocol().equals("https"))
            throw new IllegalAccessException("Protocol not supported");
    }

    @SuppressWarnings("all")
    private int getNextInt() {
        return new Integer(10);
    }
}
