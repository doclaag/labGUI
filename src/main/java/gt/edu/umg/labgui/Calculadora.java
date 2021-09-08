package gt.edu.umg.labgui;

/**
 * @author docla
 */

class Calculadora {

    private String marca;
    private String modelo;
    
    public Calculadora(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // SETTERS
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    // GETTERS
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    
    // METHODS
    public double sumar(double num1, double num2){
        return num1+num2;
    }
    
    public double restar(double num1, double num2){
        return num1-num2;
    }
    
    public double multiplicar(double num1, double num2){
        return num1*num2;
    }
    
    public double dividir(double num1, double num2){
        return num1/num2;
    }
}
