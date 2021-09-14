package com.example.ejercicioanime;

public class Animes
{
    private String nombre = "";
    private int logo = 0;

    public Animes(String nombre, int logo)
    {
        this.nombre = nombre;
        this.logo = logo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getLogo()
    {
        return logo;
    }

    public void setLogo(int logo)
    {
        this.logo = logo;
    }
}
