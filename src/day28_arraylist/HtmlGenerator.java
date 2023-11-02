package day28_arraylist;

public class HtmlGenerator {
    /*
    input: div^3
    output: <div></div><div></div><div></div>
     */
    public static void main(String[] args) {
        System.out.println(htmlGenerator("div^3"));
    }

    public static String htmlGenerator(String str){
        String[] parts = str.split("\\^");
        int num = Integer.parseInt(parts[1]);
        String result = "";
        for (int i = 0; i < num; i++) {
            result += "<" + parts[0] + "></" +parts[0] + ">";
        }
        return result;
    }
}
