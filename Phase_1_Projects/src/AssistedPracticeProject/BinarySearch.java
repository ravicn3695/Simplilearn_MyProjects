package assistedPracticeProject;

public class BinarySearch {

		public static  void main(String[] args){


	        int[] arr = {1,2,3,4,5};
	        int key = 5;
	        int arrlength = arr.length;
	        main(arr,0,key,arrlength);
	    }

	public static void main(int[] arr, int start, int key, int length)
	{

	        int midValue = (start+length)/2;
	        while(start<=length){//O(log n)

	            if(arr[midValue]<key){

	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }

	}

	}
