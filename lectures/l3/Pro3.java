package org.example.lectures.l3;

/**
 * Массивы
 * как увеличеть размер массива?
 */
public class Pro3 {
    public static void main(String[] args) {
//        int[] a = new int[] {1, 9};
//        int[] b = new int[3];
//        System.arraycopy(a, 0, b, 0, a.length);// скопировать данные arraycopy(из массива a, начиная с 0 индекса, в массив b)
//        for (int i : a) {
//            System.out.printf("%d ", i);} //1 9
//        System.out.println();
//        for (int j : b){
//            System.out.printf("%d ", j);} // 1 9 0
        int[] a = new int[]{0, 9};
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        a = AddItem(a, 2); // 0 9
        System.out.println();
        a = AddItem(a, 3); // 0 9 2 3
        for (int j : a) {
            System.out.printf("%d ", j);
        }

    }

    static int[] AddItem(int[] array, int item) {
        int lenght = array.length;
        int[] tmp = new int[lenght + 1];
        System.arraycopy(array, 0, tmp, 0, lenght);
        tmp[lenght] = item;
        return tmp;
    }
}