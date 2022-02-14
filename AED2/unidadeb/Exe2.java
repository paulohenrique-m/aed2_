/*
faça um metodo que receba um array de inteiros
e mostre o maior e o menor
variaveis maximas 0 a 2000 para proteção do programa
eu acredito que o exercicio em si ja faz a menor
quantidade de comparações visto que faz tudo dentro
do metodo
*/

class Exe2{
    //func para preencher o array com 10 numeros
    public static void preencheArray(int array[]){   
        int maior = 0;
        int menor =2000;
        for (int i = 0; i <= (array.length-1); i++) {
            array[i] = MyIO.readInt();
            if(array[i]>maior){
                maior = array[i];
            }
            if(array[i]<menor){
                menor = array[i];
            }
        }
        MyIO.println("maior= " + maior);
        MyIO.println("menor= " + menor);
    }
    
    /*
    metodo para mostrar o maior e o menor elemento
    do vetor
    */
    public static void main(String[] args){
        int[] array = new int[10];
        preencheArray(array);
    }
 }