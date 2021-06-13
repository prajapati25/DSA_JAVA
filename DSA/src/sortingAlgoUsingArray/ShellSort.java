package sortingAlgoUsingArray;

import java.util.Arrays;

public class ShellShort {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 23, 45, -45, 23, -106, 1 ,24,25,121,-34,23,64,785,34};

		int n = arr.length;
		for(int gap= n/2;gap>0;gap /= 2)
		{
			int temp ;
			for (int i= gap ; i<n; i++)
			{
				temp= arr[i];
				for(int j=i;j>=gap;j -= gap)
				{
					if(arr[j-gap]>temp)
					{
						arr[j]=arr[j-gap];
						arr[j-gap]=temp;
					}
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(arr));

		
	}

}
