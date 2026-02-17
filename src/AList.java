public class AList {


    int maxSize;
    int size;
    Song[] aList;

    // empty constructor
    public AList(){
        size = 0;
        maxSize = 5;
        this.aList = new Song[maxSize];
    }

    // adds a new node with given song (p) and resizes if needed
    public void addy(Song p){

        // resize if array is full
        if(maxSize == size){
            Song[] newAList = new Song[maxSize * 2]; // creating new array double the size of OG

            maxSize = maxSize * 2; // new maxSize

            for(int i = 0; i < maxSize; i++){ // copying elements over
                newAList[i] = aList[i];
            }

            aList = newAList;
        }

        // add
        aList[size] = p;
        size++;


    }

    // remove item at position (pos), reshuffles if needed, updates size
    public void removy(int pos){

        if(pos >= 0 && pos < size){
            for(int i = pos; i < size - 1; i++){
                aList[i] = aList[i + 1];
            }
        }
        aList[size - 1] = null;
        --size;
    }

    // return string containing all elements in AList
    public String toString(){
        String allElements = "";

        for(int i = 0; i < size; i++){
            String song = "Title: " + aList[i].getTitle() + ", Artist: " + aList[i].getArtist() + ", Length: " + aList[i].getLength();

            allElements = allElements + song + "\n";

        }
        return allElements;
    }

}
