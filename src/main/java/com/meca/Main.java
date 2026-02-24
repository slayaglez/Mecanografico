package com.meca;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Devuelve una cadena aleatoria de entre 100
     * 
     * @return la cadena
     */
    public static String randomSentence(int dificulty) {

        int random = new Random().nextInt(29);

        String[] easySentences = {
                "El éxito es saber aprender.", // 27
                "La vida es un gran regalo.", // 26
                "Cree en ti y todo llegará.", // 27
                "Hoy es un día para ganar.", // 25
                "Sigue siempre tu instinto.", // 26
                "El sol brilla para todos.", // 25
                "Aprender es crecer mucho.", // 26
                "La paz comienza con uno.", // 25
                "Sueña en grande cada día.", // 25
                "Tu esfuerzo dará frutos.", // 25
                "Cada momento es único ya.", // 26
                "La mente no tiene límites.", // 26
                "Mira siempre hacia delante.", // 27
                "Vive con mucha intensidad.", // 26
                "Sé la mejor versión de ti.", // 26
                "El camino es la meta hoy.", // 25
                "Todo fluye con paciencia.", // 26
                "Sonreír es gratis siempre.", // 26
                "Busca la magia del ahora.", // 25
                "El saber no ocupa lugar.", // 24
                "Crea tu propia realidad.", // 25
                "La calma es una virtud.", // 24
                "Viajar es vivir dos veces.", // 26
                "Haz que hoy valga la pena.", // 26
                "Tu tiempo es muy valioso.", // 25
                "Nunca dejes de intentar.", // 25
                "La música cura el alma.", // 24
                "Sé luz en la oscuridad.", // 24
                "El amor lo puede todo ya.", // 25
                "Persiste hasta lograrlo." // 24
        };
        String[] midSentences = {
                "La constancia es la llave del éxito real.", // 40
                "El sol siempre sale tras la tormenta hoy.", // 40
                "Nunca dejes de buscar tu mejor versión.", // 39
                "La vida pasa mientras estás muy alegre.", // 39
                "Tu actitud define el éxito de tu camino.", // 40
                "Cada día es una oportunidad de oro hoy.", // 39
                "El conocimiento es el gran poder de hoy.", // 40
                "Sigue tus sueños con toda tu gran alma.", // 39
                "El tiempo es el regalo más valioso hoy.", // 39
                "La paciencia es amarga pero muy dulce.", // 38
                "Busca siempre el lado positivo de todo.", // 39
                "El camino al éxito no es fácil de andar.", // 39
                "Vive cada momento cual si fuera único.", // 38
                "La perseverancia vence cualquier desafío.", // 40
                "Cree en ti mismo y serás imparable hoy.", // 39
                "Tu esfuerzo siempre tendrá recompensa.", // 38
                "El secreto de avanzar es comenzar ahora.", // 39
                "Aprender algo nuevo es crecer cada día.", // 39
                "La felicidad se encuentra en lo sencillo.", // 40
                "No cuentes días, haz que ellos cuenten.", // 39
                "Siembra hoy para cosechar un gran futuro.", // 40
                "La mente es un jardín que hay que cuidar.", // 40
                "Cada paso cuenta en este largo recorrido.", // 40
                "La valentía es la fuerza del valiente.", // 38
                "Descubre la magia que hay en tu interior.", // 40
                "El destino se crea con cada decisión.", // 37
                "Brilla con luz propia en este gran mundo.", // 40
                "La creatividad no tiene límites reales.", // 38
                "Haz de tu vida una aventura excepcional.", // 40
                "Confía en el proceso de la vida siempre." // 39
        };
        String[] hardSentences = {
                "El éxito no es el final, el fracaso no es fatal.", // 49
                "La disciplina es el puente entre metas y logros.", // 49
                "Aprender a dudar es aprender a pensar bien hoy.", // 48
                "No dejes que el ruido ajeno apague tu voz real.", // 48
                "La inteligencia es la capacidad de adaptarse ya.", // 49
                "Cualquier momento es perfecto para empezar algo.", // 49
                "El único modo de hacer un gran trabajo es amar.", // 48
                "La mayor victoria es la que se gana sobre uno.", // 48
                "No busques errores, busca siempre un remedio ya.", // 49
                "El pensamiento positivo es una forma de vivir.", // 48
                "Tu imaginación es el límite de lo que crearás.", // 48
                "La confianza en uno mismo es el primer secreto.", // 48
                "Cada pequeño paso te acerca más a tu gran meta.", // 48
                "El valor de una idea radica en su uso práctico.", // 48
                "Transforma siempre tus heridas en sabiduría ya.", // 48
                "La vida es un viaje, no una carrera de rapidez.", // 48
                "Haz de cada día tu propia obra maestra de arte.", // 48
                "Solo aquellos que arriesgan llegan muy lejos.", // 47
                "El futuro pertenece a quienes creen en sueños.", // 47
                "Donde hay amor por el arte hay amor por el ser.", // 48
                "Siembra pensamientos positivos y cosecharás hoy.", // 49
                "La libertad consiste en ser dueños de la vida.", // 48
                "El éxito es la suma de pequeños esfuerzos hoy.", // 47
                "Nunca es demasiado tarde para ser quien deseas.", // 48
                "La felicidad no es algo que ya esté hecho hoy.", // 47
                "Mantén tu rostro hacia el sol y no verás sombra.", // 49
                "La simplicidad es la máxima sofisticación real.", // 48
                "Lo que no te mata siempre te hace mucho fuerte.", // 48
                "El conocimiento habla, pero la sabiduría oye.", // 46
                "Crea un entorno que te inspire a crecer mucho." // 47
        };

        switch (dificulty) {
            case 1:
                return easySentences[random];
            case 2:
                return midSentences[random];
            case 3:
                return hardSentences[random];
            default:
                return easySentences[random];
        }

    }

    /**
     * Funcion que normaliza una cadena sumandole guiones
     * 
     * @param userTry la cadena a normalizar
     * @param length  el tamanio deseado
     * @return la cadena normalizada
     */
    public static String fixTryLength(String userTry, int length) {

        for (int i = 0; i < length; i++) {
            userTry += "-";
        }
        return userTry;
    }

    /**
     * Comprueba una cadena y devuelve el numero de errores respecto a la original
     * 
     * @param original cadena original
     * @param userTry  cadena a corregir
     * @return numero errores
     */
    public static int checkErrors(String original, String userTry) {

        if (userTry == null || userTry.isBlank()) {
            return -1;
        }
        if (userTry.equals(original)) {
            return 0;
        }

        String tryFixed;
        if (userTry.length() != original.length()) {
            tryFixed = fixTryLength(userTry, original.length());
        } else {
            tryFixed = userTry;
        }

        int errors = 0;
        for (int i = 0; i < original.length(); i++) {
            if (tryFixed.charAt(i) != original.charAt(i)) {
                errors++;
            }
        }

        return errors;
    }

    /**
     * Funcion que inicia el juego y cronometra al usuario
     * 
     * @return tiempo del usuario
     */
    public static float gameLauncher() {

        // Colores de consola
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        Scanner scanner = new Scanner(System.in);

        boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");

        System.out.println(" Fácil:   1 " + (isWindows ? "~"   : "💦"));
        System.out.println(" Media:   2 " + (isWindows ? "~~"  : "🔥🔥"));
        System.out.println(" Difícil: 3 " + (isWindows ? "~~~" : "💥💥💥"));

        int dificulty = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("¡Pulsa enter para empezar!");
        scanner.nextLine();

        long start = System.currentTimeMillis();

        String original = randomSentence(dificulty);
        System.out.println(original);

        String userTry = scanner.nextLine();
        int errores = checkErrors(original, userTry);

        long end = System.currentTimeMillis();
        long timeMilis = end - start;
        float time = (timeMilis / 1000f);

        if (errores == 0) {
            System.out.println(GREEN + "¡Impresionante!" + RESET + " sin errores y en " + YELLOW + time + RESET + " segundos");
        } else {
            System.out.println("\nHas tenido " + RED + errores + " errores" + RESET + " y has tardado " + YELLOW + time + RESET + " segundos");
        }

        return time;
    }


    /**
     * Funcion que activa el ansi de windows para habilitar colores
     * en la terminal //todo Si el ansi no funciona bien se van a ver los códigos de color
     */
    public static void enableWindowsAnsi() {
    try {
        new ProcessBuilder("reg", "add", 
            "HKCU\\Console", "/v", "VirtualTerminalLevel", 
            "/t", "REG_DWORD", "/d", "1", "/f")
            .start().waitFor();
    } catch (Exception e) {
        // Si falla pues no hay colorines
    }
}
    

    public static void main(String[] args) {

        enableWindowsAnsi();

        // Colores de consola
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        String BLUE = "\u001B[34m";

        Scanner scanner = new Scanner(System.in);

        System.out.println(GREEN + "\n========" + BLUE + "¡Bienvenido a Mecanográfico!" + GREEN + "========\n" + RESET);
        System.out.println("Copia la frase que aparezca por consola lo más rápido que puedas \n");

        char election = 's';
        while (election != 'n') {

            gameLauncher();

            System.out.println("\n¿Quieres jugar de nuevo? (s/n)");
            String e = scanner.nextLine();
            election = e.charAt(0);
            if (election != 's' && election != 'n') {
                System.out.println("\n¡Me lo tomaré como un sí!");
            }
        }

    }
}