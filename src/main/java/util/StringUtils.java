package util;

public class StringUtils {

    public static String multiply(String delimiter, int count) {
        return new String(new char[count]).replace("\0", delimiter);
    }
}
