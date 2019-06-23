package Generics;

public class Test {


    public static void main(String[] args) {
        String[] masyvas = {"A", "B", "C"};
        int [] masyvas1;

        TestGenerics.printArray(masyvas);
        TestGenerics.printArray(new String [] {"A", "B", "C"});
        TestGenerics.printArray(new Integer[]{1,2,3});

    }
}
