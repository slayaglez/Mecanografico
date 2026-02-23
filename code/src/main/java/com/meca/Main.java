package com.meca;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * Devuelve una cadena aleatoria de entre 100
     * 
     * @return la cadena
     */
    public static String randomSentence() {

        int random = new Random().nextInt(100);

        String[] sentences = {
                "La vida es bella.",
                "El tiempo vuela.",
                "Todo es posible.",
                "La esperanza nunca muere.",
                "Disfruta el momento.",
                "Sonríe siempre.",
                "La paz comienza en ti.",
                "Ama sin medida.",
                "La amistad es un tesoro.",
                "Cada día es una nueva oportunidad.",
                "Cree en ti mismo.",
                "La música es vida.",
                "La risa es el mejor remedio.",
                "Vive el presente.",
                "El amor lo conquista todo.",
                "La paciencia es una virtud.",
                "La felicidad está en los pequeños detalles.",
                "La vida es una aventura.",
                "Sé tú mismo.",
                "Hoy es un buen día.",
                "Los sueños se hacen realidad.",
                "La naturaleza es hermosa.",
                "El conocimiento es poder.",
                "Siempre hay algo que aprender.",
                "Agradece lo que tienes.",
                "Cada día cuenta.",
                "La simplicidad es la clave.",
                "El cambio es parte de la vida.",
                "Las mejores cosas son gratuitas.",
                "El futuro es brillante.",
                "Las palabras tienen poder.",
                "Tu actitud determina tu altitud.",
                "Eres más fuerte de lo que crees.",
                "Los amigos son la familia que elegimos.",
                "Lo que piensas, lo creas.",
                "El amor propio es esencial.",
                "La vida es un viaje.",
                "Todo esfuerzo tiene su recompensa.",
                "Sé la razón de alguien para sonreír.",
                "El perdón libera el alma.",
                "El fracaso es un paso hacia el éxito.",
                "La gratitud transforma.",
                "Cambia tus pensamientos y cambiarás tu mundo.",
                "Cada instante es único.",
                "La perseverancia es clave.",
                "La felicidad se elige.",
                "Vive con pasión.",
                "Busca la belleza en cada día.",
                "El sol siempre vuelve a brillar.",
                "Las experiencias nos definen.",
                "El amor es el lenguaje universal.",
                "La vida comienza al final de tu zona de confort.",
                "La mente es un poderoso aliado.",
                "Eres el arquitecto de tu destino.",
                "La curiosidad es la chispa del aprendizaje.",
                "Las risas son contagiosas.",
                "Aprender a amar es un arte.",
                "La belleza está en los ojos del que mira.",
                "Cada final es un nuevo comienzo.",
                "Tu valor no disminuye por la opinión de otros.",
                "Aprovecha el día.",
                "Los cambios son oportunidades.",
                "La confianza en uno mismo es fundamental.",
                "Eres un milagro.",
                "La vida es corta, sonríe mientras tengas dientes.",
                "Hazlo con amor.",
                "Sigue tus sueños.",
                "Cada segundo cuenta.",
                "Los buenos momentos se crean, no se encuentran.",
                "La bondad es un lenguaje que todos pueden entender.",
                "Tus limitaciones son solo ilusiones.",
                "Tu vida es tu mensaje al mundo.",
                "Sigue aprendiendo.",
                "La lucha es parte del proceso.",
                "Eres suficiente.",
                "La aventura comienza donde termina la zona de confort.",
                "Haz una cosa al día que te asuste.",
                "La mente es como un paracaídas, funciona mejor cuando está abierta.",
                "El optimismo es la fe que conduce al logro.",
                "El éxito es un camino, no un destino.",
                "La confianza es el primer paso hacia el éxito.",
                "A veces, lo más pequeño ocupa más espacio en tu corazón.",
                "El amor es una flor que se debe dejar crecer.",
                "La vida es el arte de dibujar sin borrador.",
                "Las oportunidades no se pierden, se crean.",
                "Las historias nos conectan.",
                "La belleza comienza en el momento en que decides ser tú mismo.",
                "Haz lo que ames y nunca trabajarás.",
                "Las grandes ideas comienzan con una gran pregunta.",
                "Nunca es tarde para empezar de nuevo.",
                "La felicidad es un viaje, no un destino.",
                "El alma de una persona está en su risa.",
                "El camino hacia el éxito es siempre en construcción.",
                "Haz del mundo un lugar mejor.",
                "La vida es un regalo, disfrútala.",
                "El viaje es más importante que el destino.",
                "La felicidad es la suma de pequeños placeres.",
                "Las pequeñas acciones hacen grandes cambios.",
                "La vida es un eco, lo que envías regresa.",
                "Las sonrisas son viajes cortos, pero valen la pena.",
                "El amor y la risa nunca se desvanecen.",
                "Sigue esperando lo inesperado.",
                "La magia está en creer.",
                "Al final del día, el amor es lo único que importa."
        };

        return sentences[random];
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
     * @return tiempo del usuario
     */
    public static float gameLauncher() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Pulsa enter para empezar!");
        String e = scanner.nextLine();

        long start = System.currentTimeMillis();

        String original = randomSentence();
        System.out.println(original);

        String userTry = scanner.nextLine();
        int errores = checkErrors(original, userTry);

        long end = System.currentTimeMillis();
        long timeMilis = end - start;
        float time = (timeMilis / 1000f);

        if (errores == 0) {
            System.out.println("¡Impresionante! sin errores y en " + time + " segundos");
        } else {
            System.out.println("\nHas tenido " + errores + " errores y has tardado " + time + " segundos");
        }
        return time;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n========¡Bienvenido a Mecanográfico!========\n");
        System.out.println("Copia la frase que aparezca por consola lo más rápido que puedas \n");

        char election = 's';
        while(election != 'n'){
            
            gameLauncher();
 
            System.out.println("\n¿Quieres jugar de nuevo? (s/n)");
            String e = scanner.nextLine();
            election = e.charAt(0);
            if(election != 's' && election!= 'n'){
                System.out.println("\n¡Me lo tomaré como un sí!");
            }
        }
        
    }
}