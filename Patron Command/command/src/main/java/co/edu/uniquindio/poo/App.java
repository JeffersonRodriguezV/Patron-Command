package co.edu.uniquindio.poo;


public class App {
    public static void main(String[] args) {
        DibujarInvoker dibujarInvoker = new DibujarInvoker();

        // Ejecutar comandos
        dibujarInvoker.ejecutarComando(new ComandoDibujarLinea("rojo", 0, 0, 100, 100));
        dibujarInvoker.ejecutarComando(new ComandoDibujarLinea("azul", 50, 50, 200, 200));

        // Deshacer el último comando
        dibujarInvoker.deshacerUltimoComando();
    }
}
