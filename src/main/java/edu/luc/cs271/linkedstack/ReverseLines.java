package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {
	private String buildReverse(){
    StringBuilder result = new StringBuilder();
    while(!charStack.empty()) {
    result.append(charStack.pop());
 }
    return result.toString();
		}
	}
