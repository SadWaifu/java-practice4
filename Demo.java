public class Demo {
    // Спасибо Klitos Kyriacou из тырнета за этот метод. Сам бы никогда не додумался)
    public static long getReverse(int arg_num){
        long tmpRev = 0;

        while (arg_num != 0) {
            tmpRev *= 10;
            tmpRev += (arg_num % 10);
            arg_num /= 10;
        }

        return tmpRev;
    }

    public static int[] fillArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 99);
        }
        return array;
    }

    public static int getMax(int[] array) {
        int tmpNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (tmpNum < array[i]) {
                tmpNum = array[i];
            }
        }
        return tmpNum;
    }

    public static int getMin(int[] array) {
        int tmpNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (tmpNum > array[i]) {
                tmpNum = array[i];
            }
        }
        return tmpNum;
    }

    public static int getMiddle(int[] array) {
        return (getMin(array) + getMax(array)) / 2;
    }

    public static void main(String[] args) {
        Cycles objArrayNum = new Cycles();
        int[] array = new int [100];
        objArrayNum.fillArr(array);

        System.out.println("Max num = " + objArrayNum.getMax(array));
        System.out.println("Min num = " + objArrayNum.getMin(array));
        System.out.println("Middle num = " + objArrayNum.getMiddle(array));
        System.out.println("Reverse num = " + objArrayNum.getReverse(123456));
    }
}
