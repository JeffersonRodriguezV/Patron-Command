package co.edu.uniquindio.poo;

public class ComandoDibujarLinea implements Comando {
    private String color;
    private int x1, y1, x2, y2;

    public ComandoDibujarLinea(String color, int x1, int y1, int x2, int y2) {
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void ejecutar() {
        System.out.println("Dibujar línea de " + color + " desde (" + x1 + ", " + y1 + ") hasta (" + x2 + ", " + y2 + ")");
        // Aquí iría la lógica para dibujar la línea en la interfaz gráfica
    }

    
}
