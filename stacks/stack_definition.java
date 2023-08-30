package stacks;

public class stack_definition {
    private static int top = -1;
    private final static int MAXSIZE=10;//max size of the array
    private static int[] stack = new int[MAXSIZE];

    public static void push(int item){
        if(top == stack.length){
            return;
        }
        else{
            top+=1;
            stack[top] = item;
        }
    }

    public static boolean isEmpty(){
        if(top < 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void topele(){
        System.out.println("Top element is "+stack[top]);
    }

    public static void display(){
        for (int i : stack) {
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        stacks.stack_definition s = new stacks.stack_definition();
        for(int i=0;i<10;i++){
            s.push(i);
        }
        System.out.println("Stack is empty or not : "+s.isEmpty());

    }
}
