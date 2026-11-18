import java.util.Scanner;

public class JavaQuiz {
public static void main(String[] args) throws Exception {


Scanner teclado = new Scanner(System.in);
int aciertos = 0;

System.out.println("========== JAVAQUIZ ==========");
System.out.println("Concurso de preguntas sobre Java");
System.out.println("Responde escribiendo A, B o C.");

// --- RONDA 1 - INTEGRANTE A ---

System.out.println("--- RONDA 1 ---");

// PREGUNTA 1
System.out.println("Pregunta 1. ¿Qué tipo de dato almacena números enteros?");
System.out.println("A) double");
System.out.println("B) int");
System.out.println("C) String");
System.out.print("Respuesta: ");

String respuesta = teclado.nextLine();

if (respuesta.equalsIgnoreCase("B")) {
System.out.println("¡Correcto!");
aciertos++;
} else {
System.out.println("Incorrecto.");
}
// --- RESULTADO FINAL ---

System.out.println("========== RESULTADO ==========");
System.out.println("Respuestas correctas: " + aciertos + " de 6");
System.out.println("Fin del concurso.");

teclado.close();
teclado.close();
}
}