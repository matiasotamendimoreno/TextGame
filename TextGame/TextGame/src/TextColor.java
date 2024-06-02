public class TextColor {
    // Códigos de escape ANSI para colores principales
    public static final String RED = "\033[0;31m";     // Rojo
    public static final String GREEN = "\033[0;32m";   // Verde
    public static final String BLUE = "\033[0;34m";    // Azul

    // Códigos de escape ANSI para colores secundarios
    public static final String WHITE = "\033[0;37m";   // Blanco
    public static final String GRAY = "\033[0;90m";    // Gris

    // Códigos de escape ANSI para colores mezclados
    public static final String YELLOW = "\033[0;33m";  // Rojo + Verde = Amarillo
    public static final String CYAN = "\033[0;36m";    // Verde + Azul = Cian
    public static final String MAGENTA = "\033[0;35m"; // Azul + Rojo = Magenta

    // Código de escape ANSI para reiniciar el color
    public static final String RESET = "\033[0m";

    // Método para imprimir en arcoíris
    public static void printRainbow(String text) {
        String[] colors = {RED, YELLOW, GREEN, CYAN, BLUE, MAGENTA};
        for (int i = 0; i < text.length(); i++) {
            System.out.print(colors[i % colors.length] + text.charAt(i) + RESET);
        }
        System.out.println();
    }
}

