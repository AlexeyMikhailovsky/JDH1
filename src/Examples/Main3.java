package Examples;


public class Main3 {
    public static void main(String[] args) {
        String[] names = new String[]{"b", "f", "g", "ff"};
        System.out.println(join("; ", names));
    }

    public static String join(String delimiter, String[] strings) {
        String s = "";

        for (int i = 0; i < strings.length; i++) {
            if ((i + 1) < strings.length) {
                s += strings[i] + delimiter;
            } else {
                s += strings[i];
            }
        }
        return s;
    }

}
