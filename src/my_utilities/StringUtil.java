package my_utilities;

public class StringUtil {
    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if ( word.charAt(i) == letter) {
                count++;
            }

        }

        return count;
    }
    public static String fixFormat (String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public static String reverse (String word){
        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);
        }
        return  reversed;

    }


}
