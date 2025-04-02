public void main() {
    println( "Willkommen zu Hangman!" );

    /* optional als Liste möglicher Wörter
    String[] words = { "inxmail", "java", "hangman", "programmieren", "computer", "keyboard" };
    Random random = new Random();
    String word = words[random.nextInt( words.length )]; // Zufällig ein Wort auswählen*/

    String word = "inxmail"; // Wort, das erraten werden soll

    // Erstelle ein char-Array mit Unterstrichen, das den aktuellen Stand darstellt
    char[] guessedWord = new char[word.length()];
    for( int i = 0; i < word.length(); i++ ) {
        guessedWord[i] = '_';
    }

    int wrongGuesses = 0;
    final int maxWrong = 6; // Maximale Anzahl falscher Versuche
    Scanner scanner = new Scanner( System.in );

    // Spielschleife: Solange falsche Versuche < maxWrong und noch Buchstaben fehlen
    while( wrongGuesses < maxWrong && new String( guessedWord ).contains( "_" ) ) {
        println( "Wort: " + new String( guessedWord ) );
        println( "Falsche Versuche: " + wrongGuesses + " von " + maxWrong );
        print( "Rate einen Buchstaben: " );

        String input = scanner.nextLine().toLowerCase(); //optional: Eingabe in Kleinbuchstaben umwandeln

        if( input.length() != 1 ) { //optional: abfangen falls mehr als ein Buchstabe eingegeben wurde
            println( "Bitte gib genau einen Buchstaben ein." );
            continue;
        }

        char guess = input.charAt( 0 );
        boolean found = false;

        // Überprüfe, ob der Buchstabe im Wort enthalten ist
        for( int i = 0; i < word.length(); i++ ) {
            if( word.charAt( i ) == guess && guessedWord[i] == '_' ) {
                guessedWord[i] = guess;
                found = true;
            }
        }
        if( !found ) {
            println( "Falsch!" );
            wrongGuesses++;
        }
        println();
    }

    // Ergebnis anzeigen
    if( !new String( guessedWord ).contains( "_" ) ) {
        println( "Glückwunsch, du hast das Wort erraten: " + word );
    }
    else {
        println( "Schade, du hast verloren. Das Wort war: " + word );
    }
    scanner.close();
}