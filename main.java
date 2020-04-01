package com.company;

public class Main {

    public static void main(String[] args) {
	    Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.getSize());
        System.out.println(st.empty());
        for (int i = 0; i < 5; i++) {
            st.push(Integer.valueOf(i));
        }
        System.out.println(st.getSize());
        System.out.println(st.empty());
        for (int i = 0; i < 5; i++) {
            System.out.println(st.up());
            st.pop();
        }
    }
}
