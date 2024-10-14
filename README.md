Project Overview
This project implements an Immutable List of integers using Java. 
The list cannot be modified after creation, ensuring immutability. 
The program supports basic list operations such as concatenation and retrieving elements by index, and is designed to demonstrate the functionality of immutable data structures.

Components:
1. ImmutableList Class
This class is an implementation of the IImmutableList interface and wraps an immutable list of integers.
Key methods:
get(int index): Returns the integer at the specified index.
concat(IImmutableList otherList): Concatenates the current list with another immutable list and returns a new ImmutableList object.
size(): Returns the size (number of elements) of the list.
toString(): Returns a string representation of the list, with elements enclosed in square brackets and separated by commas.

2. IImmutableList Interface
The interface defines the contract for the ImmutableList class, ensuring the following key functionalities:
get(int index): Retrieves the value at a specified index.
concat(IImmutableList list): Concatenates two lists.
size(): Returns the number of elements in the list.
toString(): Provides a string representation of the list.

3. Main Class
The Main class is responsible for demonstrating the functionality of the immutable list by creating, concatenating, and printing lists.
Example of operations:
Creating lists with integer arrays.
Concatenating two or more immutable lists.
Printing the contents of the lists.