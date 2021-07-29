
import java.text.SimpleDateFormat;
import java.util.Date;


public class Usuario<T,K> {

    public T Name;
    public T Apellido;
    public T Nick;
    public K Edad;
    public T Correo;
    public T Contraseña;
    public T Type;

    public Usuario(T Name, T Apellido, T Nick, K Edad, T Correo, T Contraseña, T Type) {
        this.Name = Name;
        this.Apellido = Apellido;
        this.Nick = Nick;
        this.Edad = Edad;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.Type = Type;
    }
    
    public static String clock(){
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("hh: mm a dd/MMM/YYYY");
        return formato.format(fecha);        
    } 

}
