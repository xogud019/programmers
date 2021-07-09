package CodingTest.LeetCode.Design.Medium;

import java.util.Iterator;
/*
Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- it essentially peek() at the element that will be returned by the next call to next().

Example:

Assume that the iterator is initialized to the beginning of the list: [1,2,3].

Call next() gets you 1, the first element in the list.
Now you call peek() and it returns 2, the next element. Calling next() after that still return 2. 
You call next() the final time and it returns 3, the last element. 
Calling hasNext() after that should return false.
Follow up: How would you extend your design to be generic and work with all types, not just integer?
*/
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    boolean isHaveNext = false;
    Integer temp;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iter = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!isHaveNext){
            isHaveNext = true;
            temp = iter.next();
        }
        
        return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!isHaveNext) return iter.next();
        
        Integer res = temp;
        isHaveNext = false;
        temp = null;
        
        return res;
	}
	
	@Override
	public boolean hasNext() {
        return isHaveNext||iter.hasNext();
	}
}