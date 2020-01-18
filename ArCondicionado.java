public class ArCondicionado implements Carro {

  Carro car;

  ArCondicionado(Carro car) {

   this.car = car;

  }
 
  @Override
  public String setDescription() {

    return car.setDescription() + " tem ar condicionado";

  }

  
  @Override
  public double setCost() {

   return car.setCost() + 50.00;

  }

}
