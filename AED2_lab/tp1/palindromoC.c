#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>

/* 
entrada:String
saida:Boolean
descricao:func para verificar se a palavra FIM foi digitada
*/
bool isFinal(char str[]){
	return(strlen(str) == 3 && str[0] == 'F'  && str[1] == 'I' && str[2] =='M'); 
}
/* 
entrada:String
saida:Boolean
descricao:func para verificar se a string e um palindromo
*/
bool isPalindromo(char str[]){
  int i,contador=0;
  int tam = strlen(str);
  tam--;
  i=0;
  while(tam>=i){
    if(str[i]!=str[tam]){
      contador++;
    }
    i++;
    tam--;
  }
	if(contador==0){
    printf("SIM\n");
		return true;
	}else{
    printf("NAO\n");
		return false;	
	}
	
}
int main(){
    char str[2000];
    do{
        scanf("%s", str);
        if(isFinal(str)==false){
	        isPalindromo(str);
        }else{
          break;
        }
    }
    while(isFinal(str)==false);
    return 0;
}
