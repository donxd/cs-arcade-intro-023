int avoidObstacles(int[] inputArray) {

    boolean numerosbrincados = false;
    organizaNumeros( inputArray );
    int distanciaBrinco = 0;

    while ( !numerosbrincados ){
        distanciaBrinco++;
        numerosbrincados = distanciaValida( distanciaBrinco, inputArray );
    }

    return distanciaBrinco;
}

void organizaNumeros ( int [] numeros ){
    Arrays.sort( numeros );
}

boolean distanciaValida ( int distanciaBrinco, int [] numeros ){
    int cantidadNumerosBrincados = 0;

    for ( int numero : numeros ){
        if ( numero % distanciaBrinco != 0 ) cantidadNumerosBrincados++;
    }

    return cantidadNumerosBrincados == numeros.length;
}