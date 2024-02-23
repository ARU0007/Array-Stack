package adt;

//Methos for Stack''''''''''''''''''''''''''''''''''''''''''''''''''

public interface Stack {
    void push(int data);
    int pop();
    int peek();
    int getsize();
    boolean isunderflow();
}
