public class binarysearch {
    int search(int [] a,int key)
    {
        int low=0,high = a.length-1;
        int mid =  (low + high)/2;
        while(low<=high)
        {
            if(a[mid] == key)
                return mid;
            else if (a[mid]<key)
                low = mid+1;
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}

class test {
    public static void main(String[] args) {
        int[] a = {-4, -1, 3, 7, 10, 11};
        binarysearch obj = new binarysearch();
        System.out.println(obj.search(a, 7));

    }
}

