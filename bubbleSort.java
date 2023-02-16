public class bubbleSort {


    void bubleMe(int list[],int n)
    int j;
    boolean swapping;
    swapping = true;

    while(swapping){
        swapping = false;
        for(j=1;j<n;j++){
            if(list[j-1]>list[j]){
                exchange (j-1,j);
                swapping = true
            }

        }

    }
    
// }
// ventice - a node in a graph
// edge - a line that connects 2 ventices
//     undirected - bidirectional path 
//     directed - path in directionof arrow
//     It can have a "cost", "distance", associated with it
// path- a ventice, edge sequence from a source ventice to a destination ventice
// cycle- a pah whose source and destination ventives are the same
    
}
