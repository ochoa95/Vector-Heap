/**
 * 
 * </pre>
 * @version 
 * @author Delbert Custodio, 14246
 * @author Jose Angel Ochoa, 14
 * 
 * Clase obtenida del libro de texto, Capitulo 13. Implementa la interface 
 * PriorityQueue
 * 
 * 
 */

import java.util.*;
import java.util.PriorityQueue;

public class VectorHeap < E extends Comparable<E>> extends PriorityQueue<E>
{
	
	protected Vector<E> data; // the data, kept in heap order
	
	/**
	 * Instantiates a new vector heap.
	 */
	public VectorHeap()
	// post: constructs a new priority queue
	{
	data = new Vector<E>();
	}
	
	/**
	 * Instantiates a new vector heap.
	 *
	 * @param v the v
	 */
	public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
	int i;
	data = new Vector<E>(v.size()); // we know ultimate size
	for (i = 0; i < v.size(); i++)
	{ // add elements to heap
	add(v.get(i));
	}
	}
	
	/**
	 * Parent.
	 *
	 * @param i the i
	 * @return the int
	 */
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
	return (i-1)/2;
	}
	
	/**
	 * Left.
	 *
	 * @param i the i
	 * @return the int
	 */
	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
	return 2*i+1;
	}
	
	/**
	 * Right.
	 *
	 * @param i the i
	 * @return the int
	 */
	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
	return 2*(i+1);
	}
}
