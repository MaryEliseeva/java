package practice32;

public class practice2 {
        // String -> StringBuilder / StringBuffer
        String str = "Text";
        StringBuilder sbFromStr = new StringBuilder(str);
        StringBuffer sbfFromStr = new StringBuffer(str);

        // StringBuilder -> String
        String s1 = sbFromStr.toString();

        // StringBuffer -> String
        String s2 = sbfFromStr.toString();

        // StringBuilder -> StringBuffer и наоборот
        StringBuffer sbfFromBuilder = new StringBuffer(sbFromStr.toString());
        StringBuilder sbFromBuffer = new StringBuilder(sbfFromStr.toString());

}
