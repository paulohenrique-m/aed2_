/*
programa para ler string e mostrar quantos caracters
e quantas maiusculas
*/

public class Exe2 {
    //func para contar letras e maiusculas
    public static int contaLetras(String str){
        int numMaiusculas = 0;
        int numLetras = 0;
        for (int i = 0; i < str.length(); i++) {
            numLetras++;
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                numMaiusculas++;
            }
        }
        MyIO.println("maiusculas = " + numMaiusculas);
        return numLetras;
    }
    public static void main(String[] args) {
        String str = new String();
        str = MyIO.readLine();
        MyIO.println("numeros de letras = " +contaLetras(str));
    }
}
