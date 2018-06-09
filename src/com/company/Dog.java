package com.company;

public class Dog {
    private int varsta;
    private float greutate;
    private float inaltime;
    private String nume;
    private String culoare;

    public void latra(){
        System.out.println("Ham!");
    }
    public void mananca(){
        System.out.println("Eating");
    }


    public void setVarsta(int varsta){

        this.varsta = varsta;
    }

    public int getVarsta(){

        return this.varsta;
    }


    public void setGreutate(float greutate){

        this.greutate = greutate;
    }

    public float getGreutate() {
        return this.greutate;
    }


    public void setInaltime(){
        this.inaltime = inaltime;
    }

    public float getInaltime() {
        return inaltime;
    }


    public void setNume(String nume){
        this.nume = nume;
    }

    public String getNume(){
        return nume;
    }


    public void setCuloare(String culoare){
        this.culoare = culoare;
    }

    public String getCuloare(){
        return culoare;
    }

}
