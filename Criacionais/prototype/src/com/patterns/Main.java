package com.patterns;

class Main {

    public static void main(String[] args) {

        var original = new People();
        original.name = "John";
        original.old = 30;

        var clone = (People) original.clone();

        System.out.println("People name: "+ original.name);
        System.out.println("People old: "+ original.old);
        System.out.println();
        System.out.println("Clone name: "+ clone.name);
        System.out.println("Clone old: "+ clone.old);

    }
}
