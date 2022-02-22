class Donamaria{
/*
entrada: int
saida: boolean
descricao: function that verifies if the first index in
the array is 0
*/
	public static boolean isFinal(int array[]){
		if(array[0]==0){
			return true;
		}else{
			return false;
		}
	}
/*
entrada:int
saida:doesn't have
descricao: method that take an integer from user
*/
	public static void pegarIdade(int num[]){
		for(int i=0;i<3;i++){
			num[i]=MyIO.readInt();
			if(num[0]==0){
				break;
			}
		}
	}
	public static void printaIdade(int num){
		MyIO.println(num);
	}
/*
entrada:int
saida:doesn't have
descricao: method that finds age of the third child 
*/
	public static void descobreIdade(int num[]){
		int mae=num[0];
		int f1=num[1];
		int f2=num[2];
		int f3=0;
		//caso  a idade dos filhos seja maior ou 
		//igual da mae esta errado
		if(mae<=f1||mae<=f2||((f1+f2)>=mae)){
			return;
		}else{
			f3=mae-(f1+f2);
			//se o filho 3 nao for o mais velho
			//esta errado
			if(f3<f1||f3<f2){
				return;
			}else{
				printaIdade(f3);
			}
		}
	}
	public static void main(String agrs[]){
		int[] array =new int[3];
		do{
			pegarIdade(array);
			descobreIdade(array);
		}while(isFinal(array)==false);
	}

}
