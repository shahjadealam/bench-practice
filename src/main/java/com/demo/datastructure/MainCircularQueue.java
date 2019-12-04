package com.demo.datastructure;

public class MainCircularQueue {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.addElement("Shahjade");
		queue.addElement("Himanshu");
		queue.addElement("Nagpal");
		queue.addElement("Alam");

		queue.showElement();

		queue.addElement("Hcl");
		queue.addElement("Technologies");
		queue.showElement();
//		// queue.
	}
}

class Queue {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Queue other = (Queue) obj;
		if (head != other.head)
			return false;
		if (length != other.length)
			return false;
		if (tail != other.tail)
			return false;
		return true;
	}

	static String[] strArr = new String[5];
	int head = -1;
	int tail = -1;
	int length = strArr.length;

	public void addElement(String element) {

		if (head == -1 && tail == -1) {
			strArr[++tail] = element;
			head++;
			System.out.println(element + " : Added");
		} else if ((tail + 1) % length == head)
			System.out.println("Queue is Overflow");

		else {
			tail = (tail + 1) % length;
			strArr[tail] = element;
			System.out.println(element + " : Added");
		}
		System.out.println("Tail : " + tail);

	}

	public void removeElement() {

		if ((tail == head))
			System.out.println("Queue is Underflow");

		else {
			System.out.println(strArr[head++] + " : Removed");
		}
	}

	public void showElement() {
		System.out.println("===== Queue =========");
		int index = head;
		while (!(index == tail + 1)) {
			tail = tail % length;
			System.out.println(" -> " + strArr[index]);
			index = (index + 1) % length;

		}

	}
}
