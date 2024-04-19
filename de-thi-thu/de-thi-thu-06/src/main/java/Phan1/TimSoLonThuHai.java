package Phan1;

public class TimSoLonThuHai {
    public int findMaxTwo(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Mang rong");
        }
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[array.length - 1]) {
                return array[i];
            }
        }
        return 0;
    }
}
