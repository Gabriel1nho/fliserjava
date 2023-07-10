package empleados;



public class Empleados {
    
    protected String ID ;
    protected String name  ;
    protected String fecha;
    protected String puesto;
    protected String jornada; 
    protected String obligaciones; 
    

    public Empleados() {
    }

    public Empleados(String ID, String name, String fecha, String puesto, String jornada) {
        this.ID = ID;
        this.name = name;
        this.fecha = fecha;
        this.puesto = puesto;
        this.jornada = jornada;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getJornada() {
        return jornada;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    
        public String oligaciones(){
        return null;
    }
    

    
    
}
