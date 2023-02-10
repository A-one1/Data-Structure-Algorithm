public class heap {

    int buildHeap(int list[], int n) {
        int len = 1;
        int num;

        for (int j = 0; j < n; j++) {
            num = getNext(list);
            array[len] = num;
            heapify(1, len);
            len++;

        }
        return len;
    }

    void heapify(root, leaf){
            if(leaf>1)
            parent = int(leaf/2);
            if(array[parent]< array[leaf]){
                exchange(leaf,parent);
                heapify(root,parent);
            }
        }

    void heapSort(int list[], int n){
            int len , int last;
            int j;
            int len=buidHeap(list[],n);
            last = len - 1;
            for(j=1;j<len;j++){
                exchange(1,last);
                last = last - 1;
                reheapify(1,last);

            }

        }

    void reheapify(j,last)
        {
            leftChild = 2 *j;
            rightChild = (2*j)+1;
            if((leftChild<last) && (rightChild<=last)){
                if((array[j]<array[leftChild])|| array[j]<array(rightChild)){
                    k = leftChild;
                    if(array[rightChild]>array[leftChild]){
                        k = rightChild;
                    }
                    exchange(j,k);
                }
                reheapify(k,last);

            }
            else if (leftChild<=last){
                if(array[j]<=last){
                    if(array[j]<array[leftChild]){
                        exchange(j,leftChild);
                    }
                }
            }
        }

}
