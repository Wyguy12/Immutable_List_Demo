/* 


I certify, that this computer program submitted by me is all of my own work, Wyatt Fredrickson.

Wyatt Fredrickson

07-28-2024

CSC 422


Sources: 

https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html
https://docs.oracle.com/javase/8/docs/api/java/util/List.html
https://www.javatpoint.com/java-arraylist
https://www.javatpoint.com/immutable-list-in-java


*/ 


// import the necessary packages
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


/**
 * This class is an implementation of the Immutable_List interface. 
 * It is a wrapper class for an ArrayList of Integers.
 */
public class ImmutableList implements IImmutableList {
    // Declare the ArrayList
    private final List<Integer> list; // The list of integers


    /**
     * Constructor for initializing the ImmutableList object with an array of integers.
     * @param array The array of integers to be added to the ImmutableList object.
     */
    public ImmutableList(int[] array) {
        // Initialize the ArrayList
        List<Integer> tempList = new ArrayList<>();
        for (int i : array) { // For each element in the array
            tempList.add(i); // Add each element from the array to the ArrayList
        }
        this.list = Collections.unmodifiableList(tempList); // Make the ArrayList immutable
    }


    /**
     * Constructor for initializing the ImmutableList object with another ImmutableList object.
     * @param immutableList The ImmutableList object to be copied.
     */
    public ImmutableList(IImmutableList immutableList) {
        // Initialize the ArrayList
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < immutableList.size(); i++) { // For each element in the other list
            tempList.add(immutableList.get(i)); // Add each element from the other list to the ArrayList
        }
        this.list = Collections.unmodifiableList(tempList); // Make the ArrayList immutable
    }


    /**
     * Returns the element at position index
     * @param index the index position of the list
     * @return the value at index location
     */
    @Override
    public int get(int index) {
        return list.get(index); // Return the element at the specified index
    }

 
    /**
     * Method concatenates the current list with another list.
     * @param otherList The other list to be concatenated with this list.
     * @return a new ImmutableList object with the combined list.
     */
    @Override
    public IImmutableList concat(IImmutableList otherList) {
        List<Integer> tempList = new ArrayList<>(this.list); 
        for (int i = 0; i < otherList.size(); i++) {
            tempList.add(otherList.get(i)); 
        }
        return new ImmutableList(tempList.stream().mapToInt(i -> i).toArray()); // Return a new ImmutableList object with the combined list
    }


    /**
     * Returns the number of elements in the list.
     * @return number of elements in list.
     */
    @Override
    public int size() {
        return list.size();
    }


    /**
     * Return a string presentation of the list.
     * The content is enclosed in [ ], Each element is separated by a comma.
     * @return string representation of the list.
     */
    @Override
    public String toString() {
        return list.toString(); // Return the string representation of the ArrayList
   }
}