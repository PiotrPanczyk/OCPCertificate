package nestedClasses.examples;


public class Test {
	
	public static void main(String args[]) {
		DataStructure ds = new DataStructure();
		ds.printEven();
		
		DataStructure.DataStructureIterator iter = ds.new EvenIterator();
		ds.print(iter);
		
		ds.print(new DataStructure.DataStructureIterator() {
			int index = 0;
			public boolean hasNext() {
				return (index < ds.arrayOfInts.length); 
			}
			
			public Integer next() {
				int tmpIndex = index;
				index += 2;
				return ds.arrayOfInts[tmpIndex];
			}
		});
		
		ds.print(i -> i%2==0);
		ds.print(i -> i%2!=0);
	}

}
