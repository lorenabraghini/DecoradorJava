public class Cliente {

   public static void main(String[] args) {

   Carro a = new Direcao(new ArCondicionado(new BasicCar()));
   Carro b = new ArCondicionado(new BasicCar());
   Carro c = new BasicCar();

   System.out.println(a.setDescription() + " " + a.setCost());
   System.out.println();
   System.out.println(b.setDescription() + " " + b.setCost());
   System.out.println();
   System.out.println(c.setDescription() + " " + c.setCost());

   }

}
