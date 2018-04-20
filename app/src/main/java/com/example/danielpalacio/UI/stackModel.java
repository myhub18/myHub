package com.example.danielpalacio.UI;

import java.util.Stack;

public class stackModel {
    private Stack<Profile> myStack;
    public stackModel(){
        myStack = new Stack<Profile>();
    }

    public void addProfile(Profile p){
        myStack.push(p);
    }
    public Profile getTop(){
        return myStack.peek();
    }
    public Profile getTopAndRemove(){
        return myStack.pop();
    }
    
}
