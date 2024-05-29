import java.util.Objects;
import java.util.Scanner;

public class SmartTv {
    boolean turnOn = true;
    int channel = 1;
    int volume = 100;

    public void turnOn_Off(){
        System.out.println("Deseja ligar a TV?");
        Scanner s =  new Scanner(System.in);
        String userAction_turn = s.nextLine();
        s.close();
        if(Objects.equals(userAction_turn, "Sim")){
            turnOn = true;
        } else {
            turnOn = false;
        }
    }
    public String tvStatus (boolean status){
        String tvStatus = "";
        if(!status){
            tvStatus = "Desligada";
        } else {
            tvStatus = "Ligada";
        }
        return tvStatus;
    };

    public void changeChannel (int userChannel){

        if (userChannel == 0){
            System.out.println("Canal inválido");
            channel = channel;
        } else {
            channel =  userChannel;
        }
    }



}