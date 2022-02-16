//crie um metodo iterativo recebe uma string e retorna SIM OU NAO /n
//pode contar numeros ou letras 1221 palindromo!!

public class Palindromo_java{
	/*
	entrada:String
	saida:boolean
	metodo para receber uma string e retornar uma resposta em boolean caso receba a palavra FIM	
	*/
	public static boolean isFinal(String str){
		return(str.length() == 3 && str.charAt(0) == 'F'  && str.charAt(1) == 'I' && str.charAt(2) =='M'); 
	}
	/*
	entrada:String
	saida:boolean
	metodo para receber uma string e retornar uma resposta em boolean caso seja ou nao
        um palindromo	
	*/
	public static boolean palindromoJava(String[] str){
		//for(int i=0;i<str.length();i++){
			MyIO.println(str);
		//}
	
	}
	
	
	
	
	
	
	
	//main
	public static void main(String[] args){
		int num = 0;
		String[] str = new String[2000];




		//leitura de dados ate a palavra FIM
		do{
			str[num]= MyIO.readline();
		}while(isFinal(str[num++])==false);
		num--;
		//for(int i = 0; i<num;i++){
		//	MyIO.println(palindromoJava(str[i]);
		//}
	
	}

}
