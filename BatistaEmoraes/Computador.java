package BatistaEmoraes;

public class Computador extends Equipamento {

  String periferico1 = "Mouse";
  String periferico2 = "Teclado";

  public Computador(
    String equipamento1,
    String equipamento2,
    String periferico1,
    String periferico2
  ) {
    super(equipamento1, equipamento2);
    this.periferico1 = periferico1;
    this.periferico2 = periferico2;
  }

  public String getPeriferico1() {
    return periferico1;
  }

  public String getPeriferico2() {
    return periferico2;
  }

  public void setPeriferico1(String periferico1) {
    this.periferico1 = periferico1;
  }

  public void setPeriferico2(String periferico2) {
    this.periferico2 = periferico2;
  }
}
