package Assignment6;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class MedianOfIntegerStream {

     static Queue<Integer> minHeap, maxHeap;

    MedianOfIntegerStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public  void add1(int num) {
        if (!minHeap.isEmpty() && num < minHeap.peek()) {
            maxHeap.offer(num);
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            }
        } else {
            minHeap.offer(num);
            if (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.offer(minHeap.poll());
            }
        }
    }

    public  double getMedian() {
        double median;
        if (minHeap.size() < maxHeap.size()) {
            median = (double)maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {
            median = (double)minHeap.peek();
        } else {
            median = ((double)minHeap.peek() + (double)maxHeap.peek()) / 2;
        }
        return median;
    }

    public static void main(String[] args) {
        int arr[]={5,10,15};
        MedianOfIntegerStream obj = new MedianOfIntegerStream();
        for(int i =0; i< arr.length;i++)
        {
            obj.add1(arr[i]);
            System.out.print(obj.getMedian() + " ");
        }
    }
