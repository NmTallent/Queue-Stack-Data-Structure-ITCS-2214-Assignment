/**
 * Linked list implementation of Queues.
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

public class LinkedQueue<T> implements QueueADT<T> {
	SinglyLinkedNode<T> head;
	SinglyLinkedNode<T> rear;
	int size;

	public LinkedQueue() {
		// TODO Instantiate the linked list-based data collection

		head = rear = null;
		size = 0;

	}

	@Override
	public void enqueue(T target) {
		/**
		 * TODO if queue is full, expand capacity the array-based data collection, for
		 * example, doubling its size and copying the original data items into the new
		 * expanded array. Then insert a new data item with reference to the input
		 * target into the queue Do not forget to change the size
		 **/

		SinglyLinkedNode<T> node = new SinglyLinkedNode<T>(target);

		if (size == 0) {
			head = node;
			rear = node;

		}

		rear.setNext(node);
		rear = node;
		size++;

	}

	@Override
	public boolean isEmpty() {
		// TODO Evaluate whether the queue is empty
		return size == 0;

	}

	@Override
	public T dequeue() throws EmptyCollectionException {
		/**
		 * TODO if queue is empty, throw an exception. Then remove the data item from
		 * the queue Do not forget to change the size
		 **/
		if (size == 0) {
			throw new EmptyCollectionException("Queue is empty");
		}

		SinglyLinkedNode<T> temp = head;

		head = head.getNext();
		size--;

		if (size == 0)
			rear = null;

		return temp.getElement();

	}

	@Override
	public T first() throws EmptyCollectionException {
		/** TODO return element in the frontmost position of the array **/
		if (size == 0)
			throw new EmptyCollectionException("Queue is empty");

		return head.getElement();

	}

	@Override
	public int size() {
		// TODO return the size of the Queue
		return size;

	}
}
