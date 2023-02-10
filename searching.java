public class searching {
    //unsorted O(n)
    //sorted O(log n)

    public static void main(String[] args) {

    }

    public void findItBinary(int array[], int n, int it) {
        boolean searching = true;
        int lo, hi, mid;

        lo = 0;
        hi = n -1 ;
        mid=(lo+hi)/2;
        while(searching){
            if(array[mid]==it){
                searching = false;

            }else if(it<array[mid]){
                hi = mid;
            }
            else if (it>array[mid]){
                lo = mid;
            }
            mid = (lo+hi)/2;
        }

    }
}