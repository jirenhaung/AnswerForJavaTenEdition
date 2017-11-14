package charpter7;
public class Exercise07_16 {
  public static void main(String[] args) {
    int[] list = new int[100000];
    for (int i = 0; i < list.length; i++) {
      list[i] = (int)(Math.random() * 1000000);
    }

    int key = (int)(Math.random() * 1000000);
    long startTime = System.currentTimeMillis();
    System.out.println(LinearSearch.linearSearch(list, key));
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Execution time for linear search is " +
                       executionTime);

    java.util.Arrays.sort(list);
    startTime = System.currentTimeMillis();
    System.out.println(BinarySearch.binarySearch(list, key));
    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Execution time for binary search is " +
                       executionTime);

  }

}
class LinearSearch{
	public static int linearSearch(int [] list,int key){
		for(int i=0;i<list.length;i++){
			if(key==list[i])
				return i;
		}
		return -1;
	}
}
class BinarySearch{
	public static int binarySearch(int []list,int key){
		int low=0;int high=list.length-1;
		while(high>=low){
			int mid=(high+low)/2;
			if((key<list[mid]))
				high=mid-1;
			else if(mid==list[mid])
				return mid;
			else
				low=mid+1;
		}
		return -low-1;
	}
}
