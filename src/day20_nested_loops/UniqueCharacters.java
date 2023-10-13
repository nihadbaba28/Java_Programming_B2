package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AABXXDEEF";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char eachOuterLetter = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(eachOuterLetter == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                unique += eachOuterLetter;
            }
        }
        System.out.println(unique);
    }
}
