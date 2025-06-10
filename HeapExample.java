package jyothi;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PriorityQueue<Integer>  minHeap = new PriorityQueue<>();
			minHeap.add(60);
			minHeap.add(40);
			minHeap.add(20);
			minHeap.add(0);
			minHeap.add(5);
			minHeap.add(30);
			System.out.println("Min Heap Output");
			while(!minHeap.isEmpty()) {
				System.out.println(minHeap.poll());
			}
			PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
			maxHeap.add(60);
			maxHeap.add(40);
			maxHeap.add(20);
			maxHeap.add(0);
			maxHeap.add(5);
			maxHeap.add(30);
			System.out.println("Max Heap Output");
			while(!minHeap.isEmpty()) {
				System.out.println(minHeap.poll());
			}
			
			}
}


