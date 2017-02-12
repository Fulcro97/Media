package media;


/**
 *
 * @author veljk
 */
public class Materia {
    int nVoti=0;
    double voti[] = new double[20];
    String nome;
    
    Materia (String pnome){
        nome = pnome;
    }
    
    void addMark (double pvoto){
        voti[nVoti]=pvoto;
        nVoti++;
    }

    void removeMark (){
        nVoti--;
        voti[nVoti]=0;
    }
    
}