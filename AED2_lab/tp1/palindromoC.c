#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>

bool isFinal(char str[]){
	return(strlen(str) == 3 && str[0] == 'F'  && str[1] == 'I' && str[2] =='M'); 
}
bool isPalindromo(){
    return true;
}
int main(){
    char str[2000], normal[2000], invertido[2000], c;
    int i,tam=0;//Tamanho = numero de letras na frase

   
    while(isFinal(str)==false){
        gets(str);
        //scanf("%[^\n]s", str);
        if(isFinal(str)==false){
            printf("%s\n",str);
        }
    }


    return 0;
}
