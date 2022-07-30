package test;

import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid("{}[]"));
    System.out.println(isValid("{[}]"));
    System.out.println(isValid("[{}]"));
  }

  public static boolean isValid(String sequence) {
    char[] charArray = sequence.toCharArray();

    Stack<Character> charStack = new Stack<>();


    for (Character character : charArray) {
      if (character == '{' || character == '[' || character == '(') {
        charStack.push(character);
      } else if (character == ']') {
        if (charStack.isEmpty() || charStack.peek() != '[') {
          return false;
        }
        charStack.pop();
      } else if (character == ')') {
        if (charStack.isEmpty() || charStack.peek() != '(') {
          return false;
        }
        charStack.pop();
      } else if (character == '}') {
        if (charStack.isEmpty() || charStack.peek() != '{') {
          return false;
        }
        charStack.pop();
      }
    }
    return charStack.isEmpty();
  }




}
