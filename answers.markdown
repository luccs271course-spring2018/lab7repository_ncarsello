1-Why does LinkedStack not require an explicit constructor?<br>
Because it is already implemented with the linkedstack interface. All necessary methods run within the structure. 

2-What is the time and (extra) space complexity of each of the LinkedStack methods?<br>
push(x), isEmpty, peek, pop all operate in O(1) complexity. Reverse lines operates in O(n), so does aslist(while loop) <br>


3-How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?<br>
we can implement the LinkedStack as an LinkedList. Using removefirst, getfirst, addfirst, for islist, we could make it n array. <br>


4-Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.<br>
It would be much more efficient to use the push and pop methods. This gives us the exact items which were added and removed and operates in o(1) complexity <br>
Returning an entire stack may be acceptable for smaller sizes(comp sci class), but in industry, where they woudl be much-much larger  it would be extremley 
ineffiecient. 

