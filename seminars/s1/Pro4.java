package org.example.seminars.s1;

public class Pro4 {
    public static void main(String[] args) {// семитричный ли массив
        System.out.println(isArraySymmetrical(new int[] {3, 4, 5, 5, 7, 8, 8}));
    }
    public static boolean isArraySymmetrical(int []arr){

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]){
                return false;
               }
            }
        return true;
    }
}
