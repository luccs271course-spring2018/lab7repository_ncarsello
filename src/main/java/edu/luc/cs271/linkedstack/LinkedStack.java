package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
  theData.add(obj);
  return obj;
}

  @Override
  public E peek() {
   if (isEmpty()) throw new EmptyStackException();
        return first.item;
  }
  
  @Override
  public E pop() {
    if (isEmpty()) throw new NoSuchElementException("Stack underflow");
    return theData[topOfStack--];
    return null;
  }

  @Override
  public boolean isEmpty() {
   return first == null;
    return false;
  }


  @Override
  public class ArrayStack<E> implements IStack<E> {
  public Array<E> asList() {
  int topOfStack = -1;
  final int INITIAL_CAPACITY = 10;
  theData = (E[])new Object[INITIAL_CAPACITY];

    // TODO add any instance variable(s) required to support this
    return null;
  
   }
  }
}

