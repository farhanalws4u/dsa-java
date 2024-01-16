
public class HeapSort {

    public static void heapSort(int arr[],int n){
        buildHeap(arr,n);
        for(int i = n-1;i>=1;i--){
            swap(arr,0,i);
            maxHeapify(arr,i,0);
        }
    }

    static void buildHeap(int arr[],int n){
        for(int i= (n-2)/2;i>=0;i--){
            maxHeapify(arr, n, i);
        }
    }

    static void maxHeapify(int arr[],int n,int i){
        int largest = i, left = 2*i + 1, right = 2*i +2;
        if(left < n && arr[left] > arr[largest]) largest = left;
        if(right< n && arr[right] > arr[largest]) largest  = right;

        if( largest != i){
            swap(arr, i, largest);
            maxHeapify(arr,n,largest);
        }
    }

    static void swap(int arr[],int a, int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,9,1,0,22,15};
        System.out.prinln("Array before sorting");
        heapSort(arr,7);
    }
}