import java.util.Arrays;
public class merge {

	
	public static void mergesort(int arr[],int left,int right)
	{
		int mid;
		if(left<right)
		{
			mid = left+right/2;
			
			mergesort(arr,left,mid);
			mergesort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
			
			
		}
	}
	public static void merge(int arr[],int left,int mid,int right)
	{
		int fidx=left;
		int ridx=mid+1;
		int i;
		
		int sortArr[] = new int [right+1];
		int sidx = left;
		
		while(fidx<=mid&&mid<=ridx)
		{
			if(arr[fidx]<arr[ridx])
			{
				System.arraycopy(arr,fidx++,sortArr,sidx,1);
			}
			else
			{
				System.arraycopy(arr,ridx++,sortArr,sidx,1);  
			}
			
			sidx++;
		}
		
		if(fidx>mid)
		{
			System.arraycopy(arr,ridx++,sortArr,sidx++,1);
		}
		
		else
		{
			System.arraycopy(arr,fidx++,sortArr,sidx++,1);
		}
		
		int arr2[] = Arrays.copyOf(sortArr,sortArr.length);
		System.arraycopy(arr2,0,arr,0,arr2.length);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int arr[] = {31,29,8,6,9,8,4};
		
		mergesort(arr,0,arr.length-1);
		
		
	
}
}
