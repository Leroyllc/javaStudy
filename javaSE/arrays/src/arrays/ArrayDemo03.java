package arrays;

/**
 * 多维数组
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //2*3的数组
        int[][] array = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = j;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        int[][] array2 = {{1,2,3},{4,5},{6}};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array2[i][j]+" ");
//            }
//            System.out.println();
//        }
        //这种方式下 并不能自动填充数组 而是形成了一个
        //[1,2,3]
        //[4,5]
        //[6]
        //的数组
        //可以用以下方式遍历
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
