public class Demo {
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
