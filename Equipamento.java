public class Equipamento {

  private String equipamento1;
  private String equipamento2;

  public Equipamento(String equipamento1, String equipamento2) {
    this.equipamento1 = equipamento1;
    this.equipamento2 = equipamento2;
  }

  public Equipamento() {}

  public String getEquipamento1() {
    return equipamento1;
  }

  public String getEquipamento2() {
    return equipamento2;
  }

  public void setEquipamento1(String equipamento1) {
    this.equipamento1 = equipamento1;
  }

  public void setEquipamento2(String equipamento2) {
    this.equipamento2 = equipamento2;
  }

  public class Computador extends Equipamento {

    String periferico1;
    String periferico2;

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

    public Computador() {}

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

  public static void main(String[] args) {
    Equipamento desktop1 = new Equipamento();

    desktop1.equipamento1 = "Processador";
    desktop1.equipamento2 = "Solid State Drive";

    System.out.println(
      "Computador 1: " + desktop1.equipamento1 + ", " + desktop1.equipamento2
    );

    Computador desktop2 = new Equipamento().new Computador();

    desktop2.setEquipamento1("Processador");
    desktop2.setEquipamento2("Solid State Drive");
    desktop2.periferico1 = "Mouse";
    desktop2.periferico2 = "Teclado";

    System.out.println(
      "Computador 2: " +
      desktop2.getEquipamento1() +
      ", " +
      desktop2.getEquipamento2() +
      ", " +
      desktop2.periferico1 +
      ", " +
      desktop2.periferico2
    );
  }
}
