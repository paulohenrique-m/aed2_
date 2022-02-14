public class Exe1 {
    public static boolean isnumber(String aux){
        for (int i = 0; i < aux.length(); i++) {
            if(aux.charAt(i) >= '0'&& aux.charAt(i) <= '9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = MyIO.readString();
        if(isnumber(str)){
            MyIO.println("composta por letras");
        }else{
            MyIO.println("composta por numeros");
        }
    }
}
