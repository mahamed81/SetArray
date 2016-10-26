/**
 * 
 * @author hassan
 *
 */
public interface Set_Interface {
	/**
	 * Adds entries to the set
	 * @param object
	 * @return true if the entry was added to the set and false otherwise
	 */
	public boolean add(Object object);
	
	/**
	 * checkes if a particular object is in the set
	 * @param object
	 * @return true if the the set cotains the object and false if not
	 */
	public boolean contains(Object object);
/**
 * Gets the first entry in the set
 * @return the first entry in the set
 */
	public Object getFirst();
	/**
	 * removes an entry from the set
	 * @param object
	 * @return true if the entry what was removed and false if not
	 */
	boolean remove(Object object);

	/**
	 * counts the number of objects
	 * @return the number of objects
	 */
	public int count_of_objects();
	/**
	 * adds the elements of two sets 
	 * @param set2
	 * @return the elements of the two sets
	 */
	public SetBag union(SetBag set2);
	 /**
	  * adds the uncommon elements of a two sets
	  * @param set2
	  * @return the uncommon elements of the two sets
	  */
	public SetBag intersection(SetBag set2);
	/**
	 * the current elements 
	 * @return the current elements
	 */
	public Object toArray();

	
	
	
	  
	






}
