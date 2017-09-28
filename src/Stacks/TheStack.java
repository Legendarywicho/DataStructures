package Stacks;

import java.util.Arrays;

/**
 * Created by Luis Santiago on 9/27/17.
 */
public class TheStack {
    // POP, PUSH, PEEK
    private String [] array;
    private int top = 0;
    private int size;

    public TheStack(int size){
        this.size = size;
        array = new String[size];
    }

    public Boolean isEmpty(){
        return top == 0;
    }


    public void push(String element){
        if(top<size){
            // Add a new element
            array[top] = element;
            top++;
        }else{
            System.out.println("Stack overflow!");
        }
    }

    public String pop(){
        String temp = array[top-1];
        if(!isEmpty()){
            array[top-1] = null;
            top--;
        }
        return temp;
    }

    public String peek(){
        // We return de last element in the stack;
        if(top>0){
            // Return the last element
            return array[top-1];
        }else{
            System.out.println("Stack is already filled up!");
            return null;
        }
    }
}
