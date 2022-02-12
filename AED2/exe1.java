
public class exe1 {
    /*
    entrada: string
    saida: boolean
    func: func para verificar se a palavra FIM foi escrita
    */    
    public static boolean Final(String aux){
        if(aux.length()==3 && aux.charAt(0) == 'F' && aux.charAt(1)=='I' && aux.charAt(2)=='m'){
            return true;
        }
        return false;
    }
    /*
    entrada: string
    saida: int
    func: func para contar o numero de letras 
    maiusculas recebidas por frase
    */
    static int contaMaiuscula(String frase){
        int num = 0 ;
        //utilizar charAt em um for para pegar cada letra
        while(Final(frase)==false){
            for (int i=0 ; i < frase.length(); i++) {
                if(frase.charAt(i)>='A'&&frase.charAt(i)<='Z'){
                    num++;
                }
            }
            return num;
        }
        return num;
    }
    

    public static void main(String[] args){
        int num = 0;
        String[] str = new String[2000];
        //recebe a frase/palavra enquanto nao for FIM   
        while(Final(str[num])==false){
            str[num]= MyIO.readLine();
            num++;
        }
        //retirar o FIM do print
        num--;
        for (int i = 0; i < num; i++) {
            MyIO.println(contaMaiuscula(str[i]));
        }
    }
}
