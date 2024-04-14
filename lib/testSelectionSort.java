import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

public class testSelectionSort {
    SelectionSort sorter = new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
        int[] arr1 = new int[5];
        arr1[0] = 8;
        arr1[1] = 9;
        arr1[2] = 7;
        arr1[3] = 10;
        arr1[4] = 2;

        int[] Sortedarr1 = new int[5];
        Sortedarr1[0] = 2;
        Sortedarr1[1] = 7;
        Sortedarr1[2] = 8;
        Sortedarr1[3] = 9;
        Sortedarr1[4] = 10;

        assertArrayEquals(Sortedarr1, sorter.basicSelectionSort(arr1));
    }

    public void testNegative() {
        int[] arr2 = new int[5];
        arr2[0] = -10;
        arr2[1] = -20;
        arr2[2] = -30;
        arr2[3] = -40;
        arr2[4] = -50;

        int[] Sortedarr2 = new int[5];
        Sortedarr2[0] = -50;
        Sortedarr2[1] = -40;
        Sortedarr2[2] = -30;
        Sortedarr2[3] = -20;
        Sortedarr2[4] = -10;

        assertArrayEquals(Sortedarr2, sorter.basicSelectionSort(arr2));
    }

    public void testMixed() {
        int[] arr3 = new int[5];
        arr3[0] = 5;
        arr3[1] = -10;
        arr3[2] = 0;
        arr3[3] = 20;
        arr3[4] = -5;

        int[] Sortedarr3 = new int[5];
        Sortedarr3[0] = -10;
        Sortedarr3[1] = -5;
        Sortedarr3[2] = 0;
        Sortedarr3[3] = 5;
        Sortedarr3[4] = 20;

        assertArrayEquals(Sortedarr3, sorter.basicSelectionSort(arr3));
    }

    public void testDuplicates() {
        int[] arr4 = new int[5];
        arr4[0] = 10;
        arr4[1] = 10;
        arr4[2] = -20;
        arr4[3] = 30;
        arr4[4] = -30;

        int[] Sortedarr4 = new int[5];
        Sortedarr4[0] = -30;
        Sortedarr4[1] = -20;
        Sortedarr4[2] = 10;
        Sortedarr4[3] = 10;
        Sortedarr4[4] = 30;

        assertArrayEquals(Sortedarr4, sorter.basicSelectionSort(arr4));
    }
}
