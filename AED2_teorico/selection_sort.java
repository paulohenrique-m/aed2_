/*
 *SELECTION SORT 
this algorithm sort an array doing repeatedly search for the minimum index
an putting in the front all the way through the last position.
it can be in ascending or descending way.
selection sort compares all values, try to find the lower element. In this case
its possible to understand that this way off sort will have aways the same complexity
f(n)= n^2
worst case: f(n)= n^2
best case:  f(n)= n^2
avarege case:  f(n)= n^2
*/
public class Selection_sort{

	 
  public static void selection_sort{
	for(int=0 ; array.length-1 ; i++){
		int index = i;
		for(int j=(i+1) ; j<array.length ; j++){
			if(array[j] < array[index]){
				index = j//looking for lowest index
			}
		}    
	 /*
	 swap consistis in taking an temporary cache
	 and making the data on both position switch
	 without lose any data on the process
	 */ 
	swap(index,i);
	}
}
}

