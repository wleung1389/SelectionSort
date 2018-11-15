public class Runner {
    public static void main(String[] args)
    {
        int[] arr = getRndIntArr(1,100,10);
        printArr(arr);
        selectionSort(arr);
        printArr(arr);
    }
    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int b = i;
            for(int a = i; a < arr.length; a++)
            {
                if(arr[b] > arr[a])
                {
                    b = a;
                }
            }
            for(int c = b; c > i; c--) {
                int temp = arr[c];
                arr[c] = arr[c - 1];
                arr[c - 1] = temp;
            }
        }
    }
    public static int[] getRndIntArr(int min, int max, int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | " + arr[i] + " | ");
        }
        System.out.println();
    }
}
