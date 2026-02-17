public class Testing {

    static Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
    static Song song2 = new Song("CASANOVE POSSE", "ALI", 4.00);
    static Song song3 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
    static int pos = 1;
    public static void testingNotGeneric(){
        System.out.println("===============TESTING NOT GENERIC (Songs)===============");

        AList songsAList = new AList();
        SLList songsSLList = new SLList();
        DLList songsDLList = new DLList();

        songsAList.addy(song1);
        songsAList.addy(song2);
        songsAList.addy(song3);
        songsAList.addy(song1);

        songsSLList.addy(song1);
        songsSLList.addy(song2);
        songsSLList.addy(song3);
        songsSLList.addy(song1);

        songsDLList.addy(song1);
        songsDLList.addy(song2);
        songsDLList.addy(song3);
        songsDLList.addy(song1);

        System.out.println("ARRAY BASED LIST");
        System.out.println(songsAList.toString());
        System.out.println("SINGLY LINKED LIST");
        System.out.println(songsSLList.toString());
        System.out.println("DOUBLY LINKED LIST");
        System.out.println(songsDLList.toString());

        songsAList.removy(pos);
        songsSLList.removy(pos);
        songsDLList.removy(pos);
        System.out.println("~~~~~~~~AFTER REMOVAL OF POSITION " + pos + "~~~~~~~~");
        System.out.println("ARRAY BASED LIST");
        System.out.println(songsAList.toString());
        System.out.println("SINGLY LINKED LIST");
        System.out.println(songsSLList.toString());
        System.out.println("DOUBLY LINKED LIST");
        System.out.println(songsDLList.toString());

    }

    public static void testingGenerics(){
        System.out.println("===============TESTING OUT GENERICS (SONGS, INTEGERS, STRINGS===============");
        System.out.println();
        System.out.println("--------SONGS--------");
        //SONG
        GenericAList<Song> genSongsAList = new GenericAList<>();
        GenericSLList<Song> genSongsSLList = new GenericSLList<>();
        GenericDLList<Song> genSongDLList = new GenericDLList<>();

        genSongsAList.addy(song1);
        genSongsAList.addy(song2);
        genSongsAList.addy(song3);
        genSongsAList.addy(song1);

        genSongsSLList.addy(song1);
        genSongsSLList.addy(song2);
        genSongsSLList.addy(song3);
        genSongsSLList.addy(song1);

        genSongDLList.addy(song1);
        genSongDLList.addy(song2);
        genSongDLList.addy(song3);
        genSongDLList.addy(song1);

        System.out.println("ARRAY BASED LIST (Song)");
        System.out.println(genSongsAList.toString());
        System.out.println("SINGLY LINKED LIST (Song)");
        System.out.println(genSongsSLList.toString());
        System.out.println("DOUBLY LINKED LIST (Song)");
        System.out.println(genSongDLList.toString());


        genSongsAList.removy(pos);
        genSongsSLList.removy(pos);
        genSongDLList.removy(pos);

        System.out.println("~~~~~~~~AFTER REMOVAL OF POSITION " + pos + "~~~~~~~~");

        System.out.println("ARRAY BASED LIST (Song)");
        System.out.println(genSongsAList.toString());
        System.out.println("SINGLY LINKED LIST (Song)");
        System.out.println(genSongsSLList.toString());
        System.out.println("DOUBLY LINKED LIST (Song)");
        System.out.println(genSongDLList.toString());

        System.out.println();
        System.out.println("--------INTEGERS--------");
        //INTEGER
        GenericAList<Integer> genIntAList = new GenericAList<>();
        GenericSLList<Integer> genIntSLList = new GenericSLList<>();
        GenericDLList<Integer> genIntDLList = new GenericDLList<>();

        for (int i = 0; i < 4; i++) {
            genIntAList.addy(i);
            genIntSLList.addy(i);
            genIntDLList.addy(i);
        }

        System.out.println("ARRAY BASED LIST (Integer)");
        System.out.println(genIntAList.toString());
        System.out.println("SINGLY LINKED LIST (Integer)");
        System.out.println(genIntSLList.toString());
        System.out.println("DOUBLY LINKED LIST (Integer)");
        System.out.println(genIntDLList.toString());


        genIntAList.removy(pos);
        genIntSLList.removy(pos);
        genIntDLList.removy(pos);

        System.out.println("~~~~~~~~AFTER REMOVAL OF POSITION " + pos + "~~~~~~~~");

        System.out.println("ARRAY BASED LIST (Integer)");
        System.out.println(genIntAList.toString());
        System.out.println("SINGLY LINKED LIST (Integer)");
        System.out.println(genIntSLList.toString());
        System.out.println("DOUBLY LINKED LIST (Integer)");
        System.out.println(genIntDLList.toString());

        System.out.println();
        System.out.println("--------STRINGS--------");
        //String
        GenericAList<String> genStrAList = new GenericAList<>();
        GenericSLList<String> genStrSLList = new GenericSLList<>();
        GenericDLList<String> genStrDLList = new GenericDLList<>();

        genStrAList.addy("Hello");
        genStrAList.addy("World");
        genStrAList.addy("Good");
        genStrAList.addy("Bye");

        genStrSLList.addy("Hello");
        genStrSLList.addy("World");
        genStrSLList.addy("Good");
        genStrSLList.addy("Bye");

        genStrDLList.addy("Hello");
        genStrDLList.addy("World");
        genStrDLList.addy("Good");
        genStrDLList.addy("Bye");


        System.out.println("ARRAY BASED LIST (String)");
        System.out.println(genStrAList.toString());
        System.out.println("SINGLY LINKED LIST (String)");
        System.out.println(genStrSLList.toString());
        System.out.println("DOUBLY LINKED LIST (String)");
        System.out.println(genStrDLList.toString());

        genStrAList.removy(pos);
        genStrSLList.removy(pos);
        genStrDLList.removy(pos);

        System.out.println("~~~~~~~~AFTER REMOVAL OF POSITION " + pos + "~~~~~~~~");
        System.out.println("ARRAY BASED LIST (String)");
        System.out.println(genStrAList.toString());
        System.out.println("SINGLY LINKED LIST (String)");
        System.out.println(genStrSLList.toString());
        System.out.println("DOUBLY LINKED LIST (String)");
        System.out.println(genStrDLList.toString());





    }


    public static void  main(String args[]){
        testingNotGeneric();
        testingGenerics();
    }



}
