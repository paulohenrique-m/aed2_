/*
faça um metodo que receba um array de inteiros e um numero inteiro x
e retorne um valor boolean informando se o elemento x esta contido 
*/
class Exe1{
    //func para preencher o array com 10 numeros
    /*public static void preencheArray(int array[]){   
        for (int i = 0; i < 10; i++) {
            array[i] = MyIO.readInt();
        }
    }
    */
    //func para veriricar se o valor digitado esta contido no array
    public static boolean verificaArray(int array[],int aux) {
        for (int i = 0; i <= array.length; i++) {
            if(aux==i){
                return true; 
            }
        }
        return false;
    }
    public static void main(String[] args){
        //int[] array = new int[10];
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int aux=0;
        //preencheArray(array);
        //MyIO.println("array preenchido");
        aux = MyIO.readInt();
        if (verificaArray(array,aux)){
            MyIO.println("TRUE");
        }else{
            MyIO.println("FALSE");
        }
        
    }
 }
