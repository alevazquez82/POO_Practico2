package com.mycompany.practico2;
//Almacena la parte real y la parte imaginaria del numero complejo
class Complejo {
    private double real;
    private double imaginaria;
//Constructor para crear el objeto complejo
    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }
//Se suma los numeros complejos
    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginaria + otro.imaginaria);
    }
//Se multiplica los numeros complejos
    public Complejo multiplicar(Complejo otro) {
        double realResultado = this.real * otro.real - this.imaginaria * otro.imaginaria;
        double imagResultado = this.real * otro.imaginaria + this.imaginaria * otro.real;
        return new Complejo(realResultado, imagResultado);
    }
//Comparacion de numeros complejos
    public boolean esIgual(Complejo otro) {
        return this.real == otro.real && this.imaginaria == otro.imaginaria;
    }
//Se multiplica un complejo por un entero
    public Complejo multiplicarPorEntero(int entero) {
        return new Complejo(this.real * entero, this.imaginaria * entero);
    }

    @Override
    public String toString() {
        return real + " + " + imaginaria + "i";
    }
}
