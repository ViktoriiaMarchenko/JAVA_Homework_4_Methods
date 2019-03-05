package Domashnie;

public class Zadacha_2 {
    public static void main(String[] args) {
        noRepete();
    }

    static void noRepete (){

        String test = "aavv";
        Character last = null;
        String result = "";
        for (
                Character c : test.toCharArray()) {
            if (c.equals(last)) {
                continue;
            }
            result = result.concat(c.toString());
            last = c;
        }
        System.out.println(result);
    }
    }

