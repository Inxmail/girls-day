public void main() {
    // A6 char-Array und .length
    // Frage nach einer Größe für dein char-Array und fülle es Zeile für Zeile mit '_' bis es voll ist.
    println( "Wie groß soll das Array sein?" );
    int size = Integer.parseInt( new Scanner( System.in ).nextLine() );
    char[] textArray = new char[size];
    int i = 0;

    while( textArray[textArray.length - 1] != '_' ) {
        textArray[i] = '_';
        println( new String(textArray) );
        i++;
    }


    // A7 char-Array to String und contains
    // Du hast ein char-Array mit Buchstaben und sollst überprüfen ob ein bestimmter Buchstabe enthalten ist
    char[] charArray = { 'B', 'u', 'c', 'h', 's', 't', 'a', 'b', 'e', 'n' };
    String eingabeWort = new String( charArray );
    println( "Welchen Buchstaben möchtest du überprüfen? " );
    String buchstabe = new Scanner( System.in ).nextLine();
    if( eingabeWort.contains( buchstabe ) ) {
        println( buchstabe + " ist enthalten!" );
    }
    else {
        println( buchstabe + " ist nicht enthalten!" );
    }
}
