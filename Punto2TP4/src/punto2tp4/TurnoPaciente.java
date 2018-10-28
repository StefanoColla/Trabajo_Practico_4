package punto2tp4;

/** @author Colla Stefano-Mena Hernan */
public class TurnoPaciente {
    private String fecha;
    private int hora;
    private Medico medico;
    private String nombreMedico;

    public TurnoPaciente(String fecha,int hora,Medico medico){
        this.fecha=fecha;
        this.hora=hora;
        this.nombreMedico=medico.getNombre();
    }
    public String getFecha() {
        return fecha;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

   
    public String getNombreMedico() {
        return nombreMedico;
    }

   
    public void setNombreMedico(Medico medico) {
        this.nombreMedico = medico.getNombre();
    }

    @Override
    public String toString() {
        return "TurnoPaciente{" + "fecha=" + fecha + ", hora=" + hora + ", nombreMedico=" + nombreMedico + '}';
    }
    
}
