package arrayaandstrings;


public class A {

	static int top;
	static int [] array ;
	
	static void superStack(String[] operations) {
		array = new int[operations.length];
		top =-1;
		for (String operation : operations) {
			String [] oper = operation.split("\\s+");
			if (oper[0].equalsIgnoreCase("push")) {
				push(Integer.parseInt(oper[1]));
			}
			else if (oper[0].equalsIgnoreCase("pop")){
                pop();
            }else if(oper[0].equalsIgnoreCase("inc")){
            	inc(Integer.parseInt(oper[1]),Integer.parseInt(oper[2]));
            }
			if(top==-1){
                System.out.println("EMPTY");
            }else{
                System.out.println(array[top]);
            }
		}}
		
	static void push(int a) {
		top++;
		array[top] = a;
	}
	
	static int pop() {
	int temp =  array[top];
	array[top] = 0;
	top--;
	return temp;
	}
	

static void inc(int a, int b) {
	for (int i=a-1;i>=0;i--) {
		array[i] = array[i]+b;
	}
	
}

	
	
	public static void main(String[] args ) {
		String [] operations= {"push 4", "pop","push 3","push 5", "push 2","inc 3 1","pop","push 1","inc 2 2","push 4","pop","pop"};
		superStack(operations);

	}
}

