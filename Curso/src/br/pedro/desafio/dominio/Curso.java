package br.pedro.desafio.dominio;

public class Curso extends Conteudo {
  private int cargaHoraria;

  @Override
  public double calcularXp() {
      return XP_PADRAO + 30 * cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
  }
}
