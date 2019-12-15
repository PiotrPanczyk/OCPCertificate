package nestedClasses.examples;


class DataStructure {
    
    // Create an array
    private static final int SIZE = 15;
    int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void print(DataStructureIterator iterator) {
    	while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void print(java.util.function.Function<Integer, Boolean> iterator) {
    	for(int element : arrayOfInts)
    		if (iterator.apply(element))
    			System.out.print(element + " ");
    	System.out.println();
    }
    
    public static Boolean isEvenIndex(int index) {
    	return index%2 == 0;
    }
    
    public static Boolean isOddIndex(int index) {
    	return index%2 != 0;
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
        
        //EX 2a - Instantiate inner class outside of enclosing class using objRef.new
        System.out.println("Exercise: 2a");
        DataStructure.EvenIterator ei = ds.new EvenIterator();
        ds.print(ei);
        
        //EX 2b - Implelemnt interface using anonymus class
        System.out.println("Exercise: 2b");
        ds.print(new DataStructureIterator() {
        	private int nextIndex = 1;
        	public boolean hasNext() {
        		return (nextIndex < SIZE);
        	}
        	
        	public Integer next() {
        		Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);
        		nextIndex += 2;
        		return retValue;
        	}
        });
        
        //EX 2c - pass implementation of required functional interface (implements one method) in form of lambda expression
        //used in overloaded print: public void print(java.util.function.Function<Integer, Boolean> iterator)
        System.out.println("Exercise: 2c");
        ds.print(i -> i%2 == 0);
        ds.print(i -> i%2 != 0);
        
        //EX 2d - pass method reference which implements functional interface
        //used in overloaded print: public void print(java.util.function.Function<Integer, Boolean> iterator)
        System.out.println("Exercise: 2d");
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
    }
}
