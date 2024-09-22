package gestionTarjetas.Gestion_Tarjetas.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tarjetas")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tarjeta;
    private String nombre;
    private String tipo;
    @Column(length = 16)
    private String num_tarjeta;
    @Column(length = 3)
    private Integer cvv;
    @Column(length = 1, nullable = false, columnDefinition = "SMALLINT DEFAULT 1")
    private Integer estado;

    public Tarjeta() {
    }

    public Tarjeta(Integer id_tarjeta, String nombre, String tipo, Integer estado, Integer cvv, String num_tarjeta) {
        this.id_tarjeta = id_tarjeta;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.cvv = cvv;
        this.num_tarjeta = num_tarjeta;
    }

    public Integer getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(Integer id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
