import java.util.Scanner;
public class Qudra_tenis
{
    // Code by Gustavo Zirger 
    public static int hora(int horaI,int horaF){
        int resultadoH = horaF - horaI;
            if(resultadoH<0){//caso vire o dia
                return resultadoH*(-1);
            }
        return resultadoH;
    }
    
    public static double desconto(int horaCheia){ //calcula valor
        double valor = horaCheia*90;
            if (horaCheia>3){ //calcula desconto
                return valor*0.90;
            }
        return valor; //retorna pro chamado o valor
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
            System.out.println("Bem vindo a quadra Na Dau Silva!!");
            System.out.println("A hora aqui vale 90,00");
            System.out.println("Após 3 horas, tem 10% de desconto");
            System.out.println("Hora de inicio da partida:");
             int horaInicio = ler.nextInt();
            System.out.println("Minuto da hora:");
             int minutoInicio = ler.nextInt(); 
                 if(minutoInicio<0 || minutoInicio>=60){ //caso erro
                     System.out.println("Minutos invalidos. Tente denovo.");
                     minutoInicio = ler.nextInt();
                 }
                 
            System.out.println("Boas partidas!!");
            System.out.println("Hora de termino:");
             int horaFinal = ler.nextInt();
            System.out.println("Minuto da hora:");
             int minutoFinal = ler.nextInt();
                 if(minutoFinal<0 || minutoFinal>=60){ //caso erro
                     System.out.println("Minutos invalidos. Tente denovo.");
                     minutoFinal = ler.nextInt();
                 }
                 
             int horaCheia = hora(horaInicio,horaFinal);
                 if(minutoFinal>0){ //completar a hora
                    horaCheia+=1;
                 }
             
             double valor = desconto(horaCheia);
             System.out.println("Você jogou por: "+horaCheia+" Horas.");
             System.out.println("Valor da quadra ficou: "+valor);
             System.out.println("Volte sempre!!");
            
    }
}
