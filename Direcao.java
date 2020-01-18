public class Direcao implements Carro {

  Carro car;

  Direcao(Carro car) {

   this.car = car;

  }

  @Override

  public String setDescription() {

   return car.setDescription() + " e direção hidráulica";

  }

  @Override

  public double setCost() {

   return car.setCost() + 250.00;

 }

}
