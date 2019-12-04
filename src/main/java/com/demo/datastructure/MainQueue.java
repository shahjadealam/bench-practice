package com.demo.datastructure;

class MyQueue {

	static String[] strArr = new String[10];
	int head = -1;
	int tail = -1;
	int length = strArr.length;

	public void addElement(String element) {

		if (tail == length - 1)
			System.out.println("Queue is Overflow");

		else if (tail == -1 && head == -1) {
			strArr[++tail] = element;
			head = 0;
			System.out.println("Elemememt : " + element + " Added");

		} else {

			strArr[++tail] = element;
			System.out.println("Elemememt : " + element + " Added");
		}
	}

	public void removeElement() {

		if ((tail == -1 && head == -1) || (head > tail))
			System.out.println("Queue is Underflow");

		else // if(head<=tail)
		{
			System.out.println(strArr[head] + " : Removed");
			head++;
		}
		// else
		// System.out.println("Queue is Underflow");
	}

	public void showElement() {
		System.out.println("===== Queue =========");
		int index = head;
		while (index <= tail) {

			System.out.println(" -> " + strArr[index++]);
		}

	}
}

public class MainQueue {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();

		queue.addElement("Shahjade");
		queue.addElement("Alam");
		queue.addElement("Nagpal");
		queue.addElement("Himanshu");

		queue.showElement();
		System.out.println("-----------------------------");

		queue.removeElement();
		queue.removeElement();
		queue.removeElement();

		queue.showElement();
		System.out.println("-----------------------------");

		queue.removeElement();
		queue.removeElement();
	}

}
