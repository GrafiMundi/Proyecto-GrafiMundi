package model;

// clase para crear las graficas y su informacion
public class nodoGraficas {
    public String codigo;
    public String nombre;
    public String precio;
    public String descripcion;
    public String marca;
    public int cantidad;
    public nodoGraficas sig;
    public nodoGraficas ant;
    
    public nodoGraficas(String c, String n, String p, String d, String m){
        codigo=c;
        nombre=n;
        precio=p;
        descripcion=d;
        marca=m;
        cantidad=5;
        sig=null;
        ant=null;
    }
}