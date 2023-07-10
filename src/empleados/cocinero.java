
package empleados;



public class cocinero extends Empleados{
    private String titulo;
    private String especialidad;
    
    public cocinero() {
    }

    public cocinero(String titulo, String especialidad, String ID, String name, String fecha, String puesto, String jornada) {
        super(ID, name, fecha, puesto, jornada);
        this.titulo = titulo;
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override

    public double Sueldo (int hrs) (
    int extra = 0;
    int hrsext = hrs - 48;
    if (hrs<48)//se pregunta para saber si trabajo menos de lo esperado
    {
        hrs=hrs*160;
    }
    if (hrsext > 0)//se pregunta si trabajo mas de los esperado
    {
    extra=hrsext*320;
    }
    double s hrs+extra;

    

    return trabajador;
}


   
}
