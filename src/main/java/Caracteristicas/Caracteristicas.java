package Caracteristicas;

/**
 *
 * @author Andres Lopez
 */
public abstract class Caracteristicas {
    public int Potencia;
    public int Velocidad;
    public int Peso;
    public String Altura;
    public String Empuje;

    public Caracteristicas(int Potencia, int Velocidad, int Peso, String Altura, String Empuje) {
        this.Potencia = Potencia;
        this.Velocidad = Velocidad;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Empuje = Empuje;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public String getEmpuje() {
        return Empuje;
    }

    public void setEmpuje(String Empuje) {
        this.Empuje = Empuje;
    }
    
    public abstract void Acelerar();
    public abstract void Frenar();
    
    
    
}
