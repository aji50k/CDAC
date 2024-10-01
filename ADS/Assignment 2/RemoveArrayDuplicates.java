import java.util.Arrays;
class RemoveArrayDuplicates{
	public static void removeDuplicates(int[] a){
		if(a.length == 0){
			return 0;
		}
		
		Arrays.sort(a);
		int j=0;
		
		for(int i=1; i<=a.length; i++){
			if(a[i] != a[j]){
				j++;
				a[j] = a[i];
			}
		}
		return j+1;
	}
	public static void main(String args[]){
		int[] a =  {0, 0, 1, 1, 2, 2, 3, 3};
		int n = removeDuplicates(a);
		
		for(int i=0; i<n; i++){
			System.out.println(a[i]+" ");
		}
	}
}