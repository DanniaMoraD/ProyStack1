import java.util.Stack;
public class Pila {
    private Stack<Integer> pila; //Referencia

    public Pila() {
        pila=new Stack<Integer>(); //Solo se pueden insertar datos integer
    }
    public void insertar (Integer dato){
        pila.push(dato); //Inserta
    }
    public Integer eliminar () throws Exception {
        if(pila.empty())
            throw new Exception("Pila sin elementos");
            return pila.pop(); // Manera de omitir el else
    }
    public Integer consultarTope()throws Exception {
        if(pila.empty())
            throw new Exception("Pila sin elementos");
        return pila.peek(); // Manera de omitar el else
    }

    @Override   //Transforma un objeto a una cadena de caracteres.
    public String toString() {
        String resultado= "===Pila===\n";
        for (int i=pila.size()-1; i>=0; i--){
            resultado+=pila.get(i)+"\n";
        }
        return resultado;

    }
}
