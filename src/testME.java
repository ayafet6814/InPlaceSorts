public class testME
{
    public static void swap(int[] arr, int i, int j)
    {
        int num = arr[i];
        arr[i] = arr[j]; arr[j] = num;
    }

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
}
