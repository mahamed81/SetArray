import java.util.Arrays;

/**
 *  A class of sets whose entries are stored in a fixed-size array.
 * @author hassan
 */
public class SetBag<T>{

	public Object[] set;
	private int size=4;
	private int count;
	
	/** Creates an empty set having a given capacity.
	    @param maxObject, the max object that can be stored. */
	public SetBag(int maxObject){

		if(maxObject>0){

			//int  size= maxObject;
			set = new Object[maxObject];
		}
		else 
			set=new Object[size];
	}
	/** Creates an empty bag whose initial capacity is 100. */
	public SetBag(){

		set=new Object[size];

		//set = new Object[0];
	}
	/**
	 * counts the number of objects
	 * @return the number of objects
	 */
	public int count_of_objects() {

		return count;


	}
	/**
	 * Gets the first entry in the set
	 * @return the first entry in the set
	 */
	public Object getFirst() {
		return set[0];

	}
	/**
	 * Adds entries to the set
	 * @param object
	 * @return true if the entry was added to the set and false otherwise
	 */

	public boolean add(Object object) {

		if(contains(object)==false){

			set[count]=object;

			count++;
		}
		return false;

	}

	/**
	 * checkes if a particular object is in the set
	 * @param object
	 * @return true if the the set cotains the object and false if not
	 */
	public boolean contains(Object object) {

		for(int index=0; index<set.length; index++){

			if(set[index]==object){
				return true;
			}
			//	else if(set[index].equals(object)){
		}
		return false;
	}
	/**
	 * adds the elements of two sets 
	 * @param set2
	 * @return the elements of the two sets
	 */
	public SetBag union(SetBag set2) {

		int set3size =  this.count_of_objects() + set2.count_of_objects();

		SetBag set3 = new SetBag(set3size);

		for(int i=0; i<count; i++) {

			set3.add(set[i]);
		}

		for(int i=0; i<count_of_objects(); i++) {
			set3.add(set2.set[i]);
		}	
		return set3;
	}
	/**
	 * adds the uncommon elements of a two sets
	 * @param set2
	 * @return the uncommon elements of the two sets
	 */
	public SetBag intersection(SetBag set2) {

		//int set3size =  this.count_of_objects() + set2.count_of_objects();

		SetBag set3 = new SetBag(set2.count_of_objects() + this.count_of_objects());

		for(int i=0; i<this.count_of_objects(); i++)

			if(set2.contains(set[i])){
				set3.add(set[i]);
			}

		return set3;
	}

	public boolean remove(Object object) {

		for(int index=0; index<set.length; index++){

			if(set[index]==null){

				return false;
			}
			if(set[index].equals(object)){

				set[index]= null;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Set [set=" + Arrays.toString(set) + ", size=" + size + ", count=" + count + "]";
	}


}


