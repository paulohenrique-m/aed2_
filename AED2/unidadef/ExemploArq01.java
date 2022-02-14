package unidadef;
import java.io.*;
class ExemploArq01 {
    public static void main(String[] args){
        Arq.openWrite("exemplo.txt");
        Arq.print("1");
        Arq.print("5.3");
        Arq.print("x");
        Arq.print(true);
        Arq.print("aed");
        Arq.close();
    }
}
