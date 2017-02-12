package media;
import java.io.*;
import java.lang.Integer;

/**
 *
 * @author veljk
 */
public class Media {

    public static void main(String[] args) throws IOException {
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       int menù = 1;
       while (menù < 4){
           System.out.println("Cosa desideri fare?");
           System.out.println("1- Aggiungi Materia 2- Aggiungi Voto 3- Rimuovi ultimo Voto 4- Esci dal programma");
           menù = Integer.parseInt(input.readLine());  
            switch(menù){
                case 1:
                    System.out.println("Inserisci Nome Materia:");
                    String nome = input.readLine();
                    break;
                case 2:
                    System.out.println("Quanti voti vuoi aggiungere?");
                    int nv =Integer.parseInt(input.readLine());
                    for (int i = nv; i>0; i--){
                        double voto = Double.parseDouble(input.readLine());
                        //Materia.addMark(voto);
                        // Necessita di un Oggetto per funzionare
                    }
                case 3:
            }
            System.out.println("Salvataggio in corso non spegnere il dispositivo...");
            
       }
       
    }
    
}