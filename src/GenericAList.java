public class GenericAList<T> {

    int maxSize;
    int size;
    Object[] aList;

    // empty constructor
    public GenericAList(){
        size = 0;
        maxSize = 5;
        this.aList = new Object[maxSize];
    }

    // adds a new node with given song (p) and resizes if needed
    public void addy(T object){

        // resize if array is full
        if(maxSize == size){
            Object[] newAList = new Song[maxSize * 2]; // creating new array double the size of OG

            maxSize = maxSize * 2; // new maxSize

            for(int i = 0; i < maxSize; i++){ // copying elements over
                newAList[i] = aList[i];
            }

            aList = newAList;
        }

        // add
        aList[size] = object;
        size++;

    }

    // remove item at position (pos), reshuffles if needed, updates size
    public void removy(int pos){

        if(size == 0 || pos < 0 || pos >= size){ // is pos is invalid or array is empty
            return;
        }

        for(int i = pos; i < size - 1; i++){ // start at pos (and go until elements after)
            aList[i] = aList[i + 1]; //replace pos and shift everything
        }

        aList[size - 1] = null; // new empty space
        --size;
    }

    // return string containing all elements in AList
    public String toString(){
        String allElements = "";

        for(int i = 0; i < size; i++){

            allElements = allElements + aList[i] + "\n";

        }
        return allElements;
    }



}
