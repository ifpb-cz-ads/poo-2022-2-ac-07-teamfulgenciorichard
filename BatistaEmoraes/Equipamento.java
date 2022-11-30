package BatistaEmoraes;

public class Equipamento {

  private String equipamento1 = "processador";
  private String equipamento2 = "Solid State Drive";

  public Equipamento(String equipamento1, String equipamento2) {
    this.equipamento1 = equipamento1;
    this.equipamento2 = equipamento2;
  }

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
}
