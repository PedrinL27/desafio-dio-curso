import java.time.LocalDate;

import br.pedro.desafio.dominio.Bootcamp;
import br.pedro.desafio.dominio.Curso;
import br.pedro.desafio.dominio.Dev;
import br.pedro.desafio.dominio.Mentoria;

public class Main {
  public static void main(String[] args) {
  Curso curso1 = new Curso();
  curso1.setTitulo("Principios Java");
  curso1.setDescricao("O basico do java");
  curso1.setCargaHoraria(40);

  Curso curso2 = new Curso();
  curso2.setTitulo("Intermediario Java");
  curso2.setDescricao("O intermediario do java");
  curso2.setCargaHoraria(60);

  Mentoria mentoria1 = new Mentoria(LocalDate.now());
  mentoria1.setTitulo("Mentoria Java");
  mentoria1.setDescricao("Mentoria para iniciantes Java");

  Bootcamp bootcamp = new Bootcamp();
  bootcamp.setNome("Java Developer");
  bootcamp.setDescricao("Torne-se um desenvolvedor Java");
  bootcamp.getConteudos().add(curso1);
  bootcamp.getConteudos().add(mentoria1);
  bootcamp.getConteudos().add(curso2);

  Dev devPedro = new Dev();
  devPedro.setNome("Pedro");
  devPedro.inscreverBootcamp(bootcamp);
  System.out.println(devPedro.getConteudosInscritos());
  devPedro.progredir();
  System.out.println(" ");
  System.out.println(devPedro.getConteudosConcluidos());

  System.out.println("----------------------------------");

  Dev devMatheus = new Dev();
  devMatheus.setNome("Matheus");
  devMatheus.inscreverBootcamp(bootcamp);
  System.out.println(devMatheus.getConteudosInscritos());
  devMatheus.progredir();
  System.out.println(" ");
  System.out.println(devMatheus.getConteudosConcluidos());
  }
}
