package nestedClasses.localAnanymus;

import java.util.Iterator;

public class DataStructure {
    private static final int SIZE = 10;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for(int i=0; i<SIZE;i++)
            arrayOfInts[i] = i;
    }

    public void printEven() {
        DataStructureIterator evenIterator = new DataStructureIterator(){
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < SIZE;
            }

            @Override
            public Integer next() {
                int i = index;
                index+=2;
                return arrayOfInts[i];
            }
        };

        while(evenIterator.hasNext())
            System.out.printf("%d, ", evenIterator.next());
    }

    interface DataStructureIterator extends Iterator<Integer> { }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
