public class sum {
    //to find sum of all the elements of array
    public int find_sum(int arr[])
    {
        int total = 0;
        for(int i=0;i<arr.length;i++)
        {
            total = total + arr[i];
        }
        return total;
    }
}
