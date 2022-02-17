public class PalindromoJava {
    public static boolean isFinal(String str){
		return(str.length() == 3 && str.charAt(0) == 'F'  && str.charAt(1) == 'I' && str.charAt(2) =='M'); 
	}
    //public static boolean isEqual(String str,String rev){
    //    String aux= str;
    //    int contador=0;
    //    if (str==aux) {
    //        contador++;
    //    }
    //    for (int i = str.length() - 1; i >= 0; i--) {
    //        aux+= rev.charAt(i);
    //    }
    //    if (rev==aux) {
    //        contador++;
    //    }
    //    if(contador==2){
    //        return true;
    //    }else{
    //        return false;
    //    }
    //}
    public static boolean isPalindromo(String str){
        String reversed= "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed+= str.charAt(i);
        }
        MyIO.println(reversed);
        if (reversed.equals(str)) {
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
        for (int i = 0; i < num; i++){
            MyIO.println(isPalindromo(str[i]));
        }
    }
}
