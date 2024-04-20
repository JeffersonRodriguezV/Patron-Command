package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class DibujarInvoker {

    private List<Comando> historial = new ArrayList<>();   //<---Crea una lista donde se almacena el historial.

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();                   //<---llama al método ejecutar del comando para llevar a cabo la acción asociada con ese comando.
        historial.add(comando);               //<---Añade el comando al historial.
    }

    public void deshacerUltimoComando() {
        if (!historial.isEmpty()) {               //<---Verifica si hay comandos en el historial.
            Comando ultimoComando = historial.remove(historial.size() - 1);   //<---Obtiene el ultimo comando y lo elimina.
            System.out.println("Deshacer: " + ultimoComando);
            // Aquí iría la lógica para deshacer el comando en la interfaz gráfica.
        } else {                             
            System.out.println("No hay comandos para deshacer.");  //<---En el caso de que no haya ningun comando en el historial se lanza este mensaje.
        }
    }
    
}
