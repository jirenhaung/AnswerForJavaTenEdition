package charpter10;
public class Exercise10_05 {
  public static void main(String[] args) {
    StackOfIntegers stack = new StackOfIntegers(2);
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");

    // Convert string to int
    int number = input.nextInt();

    System.out.println("The factors for " + number + " is");

    // Find and store all the smallest factors of the integer
    int factor = 2;
    while (factor <= number) {
      if (number % factor == 0) {
        number = number / factor;
        stack.push(factor);
      }
      else {
        factor++;
      }
    }

    // Display factors
    while (!stack.empty()) {
      System.out.print(stack.pop() + " ");
    }
  }
}
class StackOfIntegers{
	private int [] elements;
	private int size;
	public static final int DEFUALT_CAPACITY=16;
	public StackOfIntegers(){
		this(DEFUALT_CAPACITY);
	}
	public StackOfIntegers(int capacity){
		elements=new int[capacity];
	}
	public void push(int value){
		if(size>=elements.length){
			int[] temp=new int [elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements=temp;
		}
		elements[size++]=value;
	}
	public int pop(){
		return elements[--size];
	}
	public int peek(){
		return elements[size-1];
	}
	public boolean empty(){
		return size==0;
	}
	public int getSize(){
		return size;
	}
}