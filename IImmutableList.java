public interface IImmutableList {
    /**
    * Returns the element at position index
    * @param index the index position of the list
    * @return the value at index location
    */
    public int get(int index);
    /**
    * Returns the concatenation of the current list and other list.
    * @param list The other list
    * @return An immutable list containing elements from both list.
    */
    public IImmutableList concat(IImmutableList list);
    /**
    * Returns the number of elements in the list.
    * @return number of elements in list.
    */
    public int size();
    /**
    * Return a string presentation of the list.
    * The content is enclosed in [ ], Each element is separated by a comma.
    * @return string representation of the list.
    */
    @Override
    public String toString();
   }
   