public class Usuario {

  public  static  void main(String[] args) throws Exception {
      SmartTv smartTv = new SmartTv();
      smartTv.turnOn_Off();
        smartTv.changeChannel(0);
      System.out.println("Tv está ligada?" +  smartTv.tvStatus(smartTv.turnOn) );
      System.out.println("Qual é o canal atual? "+ smartTv.channel);
      System.out.println("Volume: " + smartTv.volume);
  }

}
