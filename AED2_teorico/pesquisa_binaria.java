/*
 * BINARY SEARCH
this method is used for searching in large arrays due
to its functionality that divide in half those elements
it only work if the data in arrayu is in an order such as
ascending or descending.
worst case: f(n)= lg(n)
best case: f(n)=1
avarege case: f(n)= lg(n)
*/
public class pesquisa_binaria{
    public static void main(String[] args) {
        boolean resp = false;
	int dir =n-1, esq =0,meio;
	while(esq<=dir){
		meio=(esq+dir)/2;
		if(x == array[meio]){
			resp==true;
			esq = n;
		}else if(x> array[meio]){
			esq=meio+1;
		}else{
			dir=meio-1;
		}
	
	}
     }
}
