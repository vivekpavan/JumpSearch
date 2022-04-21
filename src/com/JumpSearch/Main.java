package com.JumpSearch;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        var jumpsearch = new JumpSearch();
        var number = jumpsearch.JumpSearch(numbers, 5);
        System.out.println(number);
    }
}