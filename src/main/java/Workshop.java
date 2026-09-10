import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }



    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        //return a+b;
	return a+b;
    }



    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
      if (a>= b && a >=c) return a;
    if (b>=c) return b;  
      return c;
    }

 

   // Método que retorna la tabla de multiplicar de un número
public int[] tablaMultiplicar(int numero, int limite) {
    // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
    // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
    int[] resultado = new int[limite];

    for (int i = 0; i < limite; i++) {
        resultado[i] = numero * (i + 1);
    }

    return resultado;
}

 

   // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0) {
    throw new IllegalArgumentException("El número no puede ser negativo");
}

int resultado = 1;

for (int i = 1; i <= n; i++) {
    resultado *= i;
}

return resultado;

    }

  

  // Método que verifica si un número es primo
public boolean esPrimo(int numero) {
    // TODO: Implementar el método para verificar si un número es primo.
    // Ejemplo: Si numero = 7, el resultado debería ser true.

    if (numero < 2) {
        return false;
    }

    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;
}
    



    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
    // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
    // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
    // Lanzar IllegalArgumentException si n es negativo.

    if (n < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
    }

    int[] resultado = new int[n];

    if (n > 0) {
        resultado[0] = 0;
    }

    if (n > 1) {
        resultado[1] = 1;
    }

    for (int i = 2; i < n; i++) {
        resultado[i] = resultado[i - 1] + resultado[i - 2];
    }

    return resultado;
}
    

    

    // Método que suma todos los elementos de un arreglo
public int sumaElementos(int[] arreglo) {
    int suma = 0;

    for (int numero : arreglo) {
        suma += numero;
    }

    return suma;
}




    // Método que calcula el promedio de los elementos de un arreglo
public double promedioElementos(int[] arreglo) {
    // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
    // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.

    int suma = 0;

    for (int numero : arreglo) {
        suma += numero;
    }

    return (double) suma / arreglo.length;
}
  


      // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.

        int mayor = arreglo[0];

        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

 


       // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.

        int menor = arreglo[0];

        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

  


      // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.

        for (int numero : arreglo) {
            if (numero == elemento) {
                return true;
            }
        }

        return false;
    }


                // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].

        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[arreglo.length - 1 - i];
        }

        return resultado;
    }



   

         // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].

        int[] resultado = arreglo.clone();

        for (int i = 0; i < resultado.length - 1; i++) {
            for (int j = 0; j < resultado.length - 1 - i; j++) {
                if (resultado[j] > resultado[j + 1]) {
                    int temporal = resultado[j];
                    resultado[j] = resultado[j + 1];
                    resultado[j + 1] = temporal;
                }
            }
        }

        return resultado;
    }

  


      // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].

        int[] temporal = new int[arreglo.length];
        int cantidad = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < cantidad; j++) {
                if (arreglo[i] == temporal[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                temporal[cantidad] = arreglo[i];
                cantidad++;
            }
        }

        int[] resultado = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

   

             // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].

        int[] resultado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            resultado[arreglo1.length + i] = arreglo2[i];
        }

        return resultado;
    }

   


          // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].

        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            resultado[i] = arreglo[(i + posiciones) % arreglo.length];
        }

        return resultado;
    }

   

           // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.

        return cadena.length();
    }


    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".

        String resultado = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado += cadena.charAt(i);
        }

        return resultado;
    }
 

    


       // Método que verifica si una cadena es un palíndromo
public boolean esPalindromo(String cadena) {
    String limpia = cadena.replaceAll("\\s+", "").toLowerCase();
    String invertida = invertirCadena(limpia);
    return limpia.equals(invertida);
}







// Método que cuenta el número de palabras de una cadena
public int contarPalabras(String cadena) {
    if (cadena == null || cadena.trim().isEmpty()) {
        return 0;
    }

    return cadena.trim().split("\\s+").length;
}
 




        // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hola mundo", el resultado debería ser "HOLA MUNDO".

        return cadena.toUpperCase();
    }

   



        // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HOLA MUNDO", el resultado debería ser "hola mundo".

        return cadena.toLowerCase();
    }

  



        // Método que reemplaza una subcadena por otra
    public String reemplazarSubcadena(String cadena, String objetivo, String reemplazo) {
        // TODO: Implementar el método para reemplazar una subcadena por otra.
        // Ejemplo: Si cadena = "Hola mundo", objetivo = "mundo" y reemplazo = "a todos",
        // el resultado debería ser "Hola a todos".

        return cadena.replace(objetivo, reemplazo);
    }

  



       

        // Método que busca una subcadena dentro de una cadena
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena dentro de una cadena.
        // Ejemplo: Si cadena = "Hola mundo" y subcadena = "mundo",
        // el resultado debería ser 5.

        return cadena.indexOf(subcadena);
    }

    



        
        // Método que valida si una cadena es un correo electrónico válido
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: "ejemplo@correo.com" debería retornar true.

        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

      



        // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.

        if (lista.isEmpty()) {
            return 0.0;
        }

        int suma = 0;

        for (int numero : lista) {
            suma += numero;
        }

        return (double) suma / lista.size();
    }

   



        // Método que convierte un número entero a su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número entero a binario.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".

        if (numero < 0) {
            return "-" + Integer.toBinaryString(-numero);
        }

        return Integer.toBinaryString(numero);
    }

     



        // Método que convierte un número entero a su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número entero a hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".

        if (numero < 0) {
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }

        return Integer.toHexString(numero).toUpperCase();
    }

      





   // Método para el juego de piedra, papel, tijera, lagarto, Spock
public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
    // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
    // Las reglas del juego son:
    // - Piedra vence a Tijera y Lagarto
    // - Papel vence a Piedra y Spock
    // - Tijera vence a Papel y Lagarto
    // - Lagarto vence a Spock y Papel
    // - Spock vence a Tijera y Piedra

    String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    int numeroAleatorio = (int) (Math.random() * 5);
    String eleccionComputadora = opciones[numeroAleatorio];

    if (eleccionUsuario.equals(eleccionComputadora)) {
        return "Empate";
    }

    if (eleccionUsuario.equals("Piedra")) {
        if (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto")) {
            return "Ganaste";
        }
        return "Perdiste";
    }

    if (eleccionUsuario.equals("Papel")) {
        if (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock")) {
            return "Ganaste";
        }
        return "Perdiste";
    }

    if (eleccionUsuario.equals("Tijera")) {
        if (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto")) {
            return "Ganaste";
        }
        return "Perdiste";
    }

    if (eleccionUsuario.equals("Lagarto")) {
        if (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel")) {
            return "Ganaste";
        }
        return "Perdiste";
    }

    if (eleccionUsuario.equals("Spock")) {
        if (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra")) {
            return "Ganaste";
        }
        return "Perdiste";
    }

    return "Perdiste";
}


      


     
    public String pptls2(String game[]) {
    
    // Retornar player ganador o empate
    /*
    Rock = R
    Paper = P
    Scissors = S
    Lizard = L
    Spock = V
    */

    String jugador1 = game[0];
    String jugador2 = game[1];

    if (jugador1.equals(jugador2)) {
        return "Empate";
    }

    if (jugador1.equals("S") &&
            (jugador2.equals("P") || jugador2.equals("L"))) {
        return "Player 1";
    }

    if (jugador1.equals("P") &&
            (jugador2.equals("R") || jugador2.equals("V"))) {
        return "Player 1";
    }

    if (jugador1.equals("R") &&
            (jugador2.equals("L") || jugador2.equals("S"))) {
        return "Player 1";
    }

    if (jugador1.equals("L") &&
            (jugador2.equals("V") || jugador2.equals("P"))) {
        return "Player 1";
    }

    if (jugador1.equals("V") &&
            (jugador2.equals("S") || jugador2.equals("R"))) {
        return "Player 1";
    }

    return "Player 2";
}
 


  public double areaCirculo(double radio) {
    double area = Math.PI * radio;

    return area;
}

 


  public String zoodiac(int day, int month) {

    if (month < 1 || month > 12 || day < 1 || day > 31) {
        return "Invalid Date";
    }

    if (month == 2 && day > 28) {
        return "Invalid Date";
    }

    if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
        return "Invalid Date";
    }

    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        return "Aries";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
        return "Taurus";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
        return "Gemini";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
        return "Cancer";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
        return "Leo";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
        return "Virgo";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
        return "Libra";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
        return "Scorpio";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
        return "Sagittarius";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
        return "Capricorn";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
        return "Aquarius";
    } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
        return "Pisces";
    }

    return "Invalid Date";
}
}

