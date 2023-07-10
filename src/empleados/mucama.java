package empleados;



public class mucama extends Empleados{

    
     public mucama (boolean carga, String ID, String name, String fecha, String puesto, String jornada) {
        super(ID, name, fecha, puesto, jornada);
    }

    
    @Override
        public String oligaciones(){
            return "/t limpiar " +
                   "/t poner toallas " +
                   "/t mantener limpio";
        }
    
}
