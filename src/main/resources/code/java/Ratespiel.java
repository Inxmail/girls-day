void main() {
    println( "> Hallo! Lass uns ein Ratespiel spielen." );
    println( "> Ich habe mir eine Nummer ausgedacht und du musst sie erraten. Los geht's!" );

    boolean erraten = false;

    Random randomGenerator = new Random();
    int zufallsNummer = randomGenerator.nextInt( 0, 100 );

    while( !erraten ) {
        print( "Dein Tipp: " );
        int gerateneZahle = Integer.parseInt( new Scanner( System.in ).nextLine() );

        if( gerateneZahle == zufallsNummer ) {
            println( "> Du hast gewonnen!" );
            erraten = true;
        }
        else if( gerateneZahle < zufallsNummer ) {
            println( "> Größer" );
        }
        else {
            println( "> Kleiner" );
        }
    }
}