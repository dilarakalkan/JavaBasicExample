package org.example.algorithms;

public class Recursive {
    public static int recursive(int n){
        // Eğer n 0'a eşitse, 1 döndürülür çünkü 0! (sıfırın faktöriyel) 1'dir.
        if(n==0) return 1;
        return n * recursive(n- 1);
    }
    public static void main(String[]args){
        System.out.println(recursive(5));
    }
}
