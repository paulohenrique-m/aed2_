public class PalindromoJava {
    /* 
    entrada:String
    saida:Boolean
    descricao:func para verificar se a palavra FIM foi digitada
    */
    public static boolean isFinal(String str){
		return(str.length() == 3 && str.charAt(0) == 'F'  && str.charAt(1) == 'I' && str.charAt(2) =='M'); 
	}
    /* 
    entrada:String
    saida:Boolean
    descricao:func para verificar se as duas STRINGS sao iguais, uma delas sendo o inverso da outra
    */
    public static boolean isEquals(String str,String reversed){
        int contador=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=reversed.charAt(i)){
                contador++;
            }
        }
        if(contador == 0){
            return true;
        }else{
            return false;
        }
        
    
    }
    /* 
    entrada:String
    saida:Boolean
    descricao:func para comparar duas STRINGS sendo uma delas a inversa da outra
    e verificar se e um palindromo
    */
    public static boolean isPalindromo(String str){
        String reversed= "";
        for (int i = str.length() - 1; i >= 0; i--){
            reversed+= str.charAt(i);
        }
        //NAO PODE USAR EQUALS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if (isEquals(str,reversed)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String[] str = new String[2000];
        int num = 0;
        do {
            isPalindromo(str[num]= MyIO.readLine());
        } while (isFinal(str[num++])==false);//
        num--;
        //for para nao pegar a palavra FIM no final do readline
        for (int i = 0; i < num; i++){
            if(isPalindromo(str[i])==false){
                MyIO.println("NAO");
            }else{
                MyIO.println("SIM");
            }
        }
    }
}
