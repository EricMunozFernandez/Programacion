package Modelo.UML;

public class Empresa {
    
    private String nif;
    private String nombre;
    private String razonSocial;
    private Integer cnae;
    
    // No hago la relación bidireccional
    // private ArrayList<Persona> listaTrabajadores;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCnae() {
        return cnae;
    }

    public void setCnae(Integer cnae) {
        this.cnae = cnae;
    }
    
    

    public Empresa() {
    }

    public Empresa(String nif, String nombre, String razonSocial, Integer cnae) {
        this.nif = nif;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cnae = cnae;
    }
    
    

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

  
}
