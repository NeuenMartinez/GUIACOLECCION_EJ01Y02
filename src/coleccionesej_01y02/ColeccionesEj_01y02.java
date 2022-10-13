/*
 * @author NeuenMartinez
 */
package ColeccionesEj_01y02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionesEj_01y02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> ListaRazas = new ArrayList();
        boolean aux = true;
        do {
            System.out.println("Ingresar la raza del perro:");
            ListaRazas.add(leer.next());
            System.out.println("Desea ingresar otra raza? (pulse cualquier tecla para seguir agregando, o pulse n para terminar)");
            String eleccion = leer.next();
            if (eleccion.equalsIgnoreCase("n")) {
                aux = false;
            } else {
                aux = true;
            }

        } while (aux == true);

        ListaRazas.forEach((index) -> {
            System.out.println(index + " ");
        });

        System.out.println("Ingresar una raza de perro a buscar y eliminar de la lista:");
        String razaElim = leer.next();

        Iterator<String> it = ListaRazas.iterator();
        boolean aux2 = false;
        while (it.hasNext()) {
            if (it.next().equals(razaElim)) {
                it.remove();
            } else {
                aux2 = true;
            }
        }
        Collections.sort(ListaRazas);
        if (aux2 == true) {
            System.out.println("La raza no fue encontrada en la lista");
        }
        System.out.println("La lista ordenada queda asi:");
        ListaRazas.forEach((index) -> {
            System.out.println(index + " ");
        });
    }

}
