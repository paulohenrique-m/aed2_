/*
ler uma ppalabra e mostrar numero de :
caracteres, letras, nao letras, vogais e consoantes 
*/
public class Exe4 {
    public static void lerCaracteres(String array){
        int numCaracteres = 0;
        int numLetras = 0;
        int numSimbolos = 0;
        int numVogais=0;
        int numConsoantes = 0;
        for (int i = 0; i < array.length(); i++) {
            if(array.charAt(i)>='a' && array.charAt(i)<='z'||array.charAt(i)>='A' && array.charAt(i)<='Z'){
                numCaracteres++;
                numLetras++;
            }else{
                numCaracteres++;
                numSimbolos++;
            }
            if(array.charAt(i) == 'a' || array.charAt(i) == 'e' || array.charAt(i) == 'i' || array.charAt(i) == 'o' || array.charAt(i) == 'u'||array.charAt(i) == 'A' || array.charAt(i) == 'E' || array.charAt(i) == 'I' || array.charAt(i) == 'O' || array.charAt(i) == 'U'){
                numVogais++;
            }else{
                numConsoantes++;
            }
        }
        MyIO.println("caracteres-"+numCaracteres);
        MyIO.println("letras-"+numLetras);
        MyIO.println("simbolos-"+numSimbolos);
        MyIO.println("vogais-"+numVogais);
        MyIO.println("consoantes-"+(numConsoantes-numSimbolos));
    }







    public static void main(String[] args) {
        String array = MyIO.readLine(); 
        lerCaracteres(array);
    }
}
