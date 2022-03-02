public class Ciframento {
    public static boolean isFinal(String str) {
        return (str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M');
    }

    public static void printaString(String str) {
        MyIO.println(str);
    }

    public static void ciframento(String str) {
        String resp = "";
        for (int i = 0; i < str.length(); i++) {
            resp = resp + (char) (str.charAt(i) + 3);
        }
        printaString(resp);
    }

    public static void main(String[] args) {
        String str;
        do {
            str = MyIO.readLine();
            if (isFinal(str) == false) {
                ciframento(str);
            }
        } while (isFinal(str) == false);
    }
}
