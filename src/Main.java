import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean arr[] = {true, false, true, true, false};
        int hashCode = Arrays.hashCode(arr);
        System.out.println("Hash Code Of Array arr2 is: " + hashCode+"\n");


        byte arr2[] = {7, 5, 12, 20, 30};
        int hashCode2=Arrays.hashCode(arr2);
        System.out.println("HashCode for byte array: "+hashCode2+"\n");


        char arr3[] = {'A', 'B', 'C', 'D', 'E'};
        int hashCode3=Arrays.hashCode(arr3);
        System.out.println("HashCode for char array: "+hashCode3+"\n");


        double arr4[] = {3.2, 5.2, 11.3, 56.21};
        int hashCode4=Arrays.hashCode(arr4);
        System.out.println("HashCode for double array: "+hashCode4+"\n");


        float arr5[] = {3.2f, 5.2f, 11.3f, 56.21f};
        int hashCode5=Arrays.hashCode(arr5);
        System.out.println("HashCode for float array: "+ hashCode5+"\n");


        int arr6[] = {3, 2, 4, 5, 7};
        int hashCode6=Arrays.hashCode(arr6);
        System.out.println("HashCode for int array: "+hashCode6+"\n");


        long arr7[] = {39846, 28784, 45464, 12315, 7418527};
        int hashCode7=Arrays.hashCode(arr7);
        System.out.println("HashCode for long array: "+hashCode7+"\n");


        short arr8[] = {5, 5, 1, 4, 6};
        int hashCode8=Arrays.hashCode(arr8);
        System.out.println("HashCode for short array: "+hashCode8+"\n");


        Object arr9[] = {5, 5, 1, 4, 6};
        int hashCode9=Arrays.hashCode(arr9);
        System.out.println("HashCode for Object array: "+hashCode9);
    }
}