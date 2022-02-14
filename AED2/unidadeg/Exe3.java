/*
faça um programa pra ler uma string e mostrar
a primeira ocorrencia da letra A
*/

public class Exe3 {
    public static void lerString(String array) {
        int aux = 0;
        for (int i = 0; i < array.length(); i++) {
            if(array.charAt(i) == 'a'|| array.charAt(i)== 'A'){
                aux = i;
                break;
            }
        }
        MyIO.println("ocorrencia na posicao["+(aux+1)+"]");
    }
    public static void main(String[] args) {
        String str = MyIO.readLine();
        lerString(str);    
    }
}
