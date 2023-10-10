package Vuelos.logic;

import jakarta.xml.bind.annotation.*;

@XmlAccesorType(XmlAccessType.FIELD)

public class Ciudad {
    @XmlID
    private string id;
    private string nombre;
    private int gmt;

    public Ciudad(){
    }
    public Ciudad(String id, String nombre, int gmt) {
    this.id = id;
    this.nombre = nombre;
    this.gmt = gmt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGmt() {
        return gmt;
    }

    public void setGmt(int gmt) {
        this.gmt = gmt;
    }
}

