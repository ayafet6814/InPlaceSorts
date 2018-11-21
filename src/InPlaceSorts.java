public class InPlaceSorts
{
    public static void swap(int[] arr, int i, int j)
    {
        int num = arr[i];
        arr[i] = arr[j]; arr[j] = num;
    }
    public static void insert(int[] arr, int i, int j)
    {}

    public static void bubbleSort(int[] list1)
    {
        for (int g = 0; g < list1.length; g++)
        {
            for (int h = 0; h < list1.length; h++)
            {
                for (int k = h + 1; k < list1.length+1; k++)
                {
                    if (list1[h] < list1[k])
                    {
                        swap(list1, h, k);
                    }
                }
            }
        }
    }

    public static void insertionSort(int[] list2)
    {
        for (int i = 0; i < list2.length; i++)
        {
            for (int j = i; j < list2.length; j--)
            {
                if (list2[j-1] > list2[j])
                {
                    swap(list2, list2[j-1], list2[j]);
                }
                else
                {
                    j = 0;
                }
            }
        }
    }

    public static void selectionSort(int[] list3)
    {
        int i = 0; int min = 0;
        for (int h = 0; h < list3.length; h++)
        {
            i = h; min = list3[h];
            for (int j = h+1; j <list3.length; j++)
            {
                if (list3[j] < min)
                {
                    min = list3[h];
                }
                swap(list3, min, i);
            }
        }
    }
}