
package empleados;




public class botones extends Empleados  {
    private boolean carga;

    public botones() {
    }

    public botones(boolean carga, String ID, String name, String fecha, String puesto, String jornada) {
        super(ID, name, fecha, puesto, jornada);
        this.carga = carga;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    
    @Override
        public String oligaciones(){
            return "/t cargar equipaje " +
                   "/t orientar a los huespedes" +
                   "/t servicio a cuartos "; 
        }
    
    

    
}
