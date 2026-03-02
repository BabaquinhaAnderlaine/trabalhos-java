import java.time.LocalTime;

public class MensagemHorario {
    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();
        
        System.out.println("Hora atual: " + hora + ":" + horaAtual.getMinute());
        
        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Vai dormir!");
        }
    }
}