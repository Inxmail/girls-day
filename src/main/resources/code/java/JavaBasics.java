void main() {
    // A1 Hallo World!
    // Gebe dein erstes `Hello World!` in der Konsole aus
    println( "Hello World" );


    // A2 Scanner einbinden und Texte verbinden "+"
    // Frage nach dem Namen und begrüße ihn/sie
    print( "Wie heißt du? " );
    String name = new Scanner( System.in ).nextLine();
    println( "Hallo " + name );


    // A3.1 If/Else-Abfrage und parseInt
    // Frage nach dem Alter und gebe eine Rückmeldung ob an dem Schnuppertag teilgenommen werden darf
    print( "Wie alt bist du? " );
    int alter = Integer.parseInt( new Scanner( System.in ).nextLine() );
    if( alter >= 13 ) {
        println( "Du darfst am Schnuppertag bei Inxmail teilnehmen!" );
    }
    else {
        println( "Du darfst leider noch nicht am Schnuppertag bei Inxmail teilnehmen :c" );
    }

    // A3.2 If/Else-Abfrage und equals
    // Frage ob schonmal programmiert wurde
    print( "Hast du schonmal Programmiert? (Ja/Nein)" );
    String antwort = new Scanner( System.in ).nextLine();
    if( antwort.equals( "Ja" ) ) {
        println( "Cool! Dann hast du ja schon Erfahrung!" );
    } else if( antwort.equals( "Nein" ) ) {
        println( "Dann wird es Zeit!" );
    }
    else {
        println( "Tut mir Leid, das hab ich nicht verstanden." );
    }

    // A4 for-Schleife - String
    // Gib alle Buchstaben des Namens in einer eigenen Zeile aus
    for( int i = 0; i < name.length(); i++ ) {
        println( name.charAt( i ) );
    }

    // A5 while-Schleife - Zahl
    // Gib alle Zahlen bis zum Alter aus
    int i = 1;
    while( i <= alter ) {
        println( i );
        i = i + 1;
    }
}