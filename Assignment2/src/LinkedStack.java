/**
 * Linked list implementation of Stacks.
 * 
 * @author ITSC 2214
 *
 * @version 1.0
 */

public class LinkedStack<T> implements StackADT<T> {
	SinglyLinkedNode<T> top;
	int size;

	public LinkedStack() {
		// TODO Instantiate the linked list-based data collection
		top = null;
		size = 0;

	}

	@Override
	public boolean isEmpty() {
		// TODO Evaluate whether the stack is empty
		return size == 0;

	}

	@Override
	public T peek() throws EmptyCollectionException {
		// TODO Return the top item on this stack, but do not modify the stack.
		// Corresponding to return the element in the node referred by the reference top
		if (this.isEmpty()) {
			throw new EmptyCollectionException("Stack is empty");
		}

		return top.getElement();

	}

	@Override
	public T pop() throws EmptyCollectionException {
		// TODO Remove and return the top item on the stack
		// Corresponding to retrieve the top node and reset the top reference to the
		// reference of its next node

		if (this.isEmpty()) {
			throw new EmptyCollectionException("Stack is empty");
		}
		SinglyLinkedNode<T> temp = top;

		top = null;
		size--;
		return temp.getElement();

	}

	@Override
	public void push(T target) {
		// TODO Add targer to the top of the stack (represented by the top reference
		// node)
		SinglyLinkedNode<T> temp = new SinglyLinkedNode<T>(target);
		temp.setNext(top);
		top = temp;
		size++;

	}

	@Override
	public int size() {
		// TODO return the size of the stack
		return size;

	}

}
