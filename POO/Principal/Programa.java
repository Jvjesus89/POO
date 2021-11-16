package Principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Classes.Livro;
import Classes.Locação;

public class Programa{
    public static void main(String[] args) {
    List<Livro>livros = new ArrayList<>();
    List<Locação>locações = new ArrayList<>();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
Integer opcao;

do{
System.out.println("\n---------- M E N U ------------\n");        
System.out.println("1 - Cadastrar livro");
System.out.println("2 - Consultar livro");
System.out.println("3 - Listar todos os livros");
System.out.println("4 - Realizar locação");
System.out.println("5 - Realizar devolução");
System.out.println("6 - Relatorio de livros com devolução em aberto");
System.out.println("7 - Relatorio de livros alugados por periodo");
System.out.println("0 - sair");
System.out.println("Digite a opção:");
opcao = sc.nextInt();

switch(opcao){
    case 0:
    System.out.println("fim do programa");
    break;

    case 1:
System.out.println("Qual o código do livro ?");
Integer código = sc2.nextInt();
  if(livros.equals(código)){

    System.out.println("código já utilizado");
    break;
}else{System.out.println("Cadastrado");}

System.out.println("Qual o titulo do livro ?");
String titulo = sc1.nextLine();

System.out.println("Qual o autor do livro ?");
String autor = sc1.nextLine();

System.out.println("Qual o numero de paginas do livro ?");
Integer nrPaginas = sc2.nextInt();

Livro livro = new Livro(código, titulo, autor, nrPaginas);
System.out.println(livro + "Cadastrado com exito");
livros.add(livro);
    break;
    
    case 2:
    System.out.println("digite o código do livro que deseja consultar");
    Integer o = sc2.nextInt();  
            livros.stream()
            .filter(p -> p.getCódigo().equals(o) )
            .forEach(System.out::println);    

    break;
    case 3:
    for(Livro a :livros){
        System.out.println(a);
    }
    break;

    case 4:
    System.out.println("Qual a data de locação ?");
    String dataLocacao = sc2.nextLine();
    System.out.println("Qual o cpf do cliente ?");
    String cpfcliente = sc1.nextLine();
    System.out.println("Qual o código do livro ?");
    código = sc.nextInt();
    System.out.println("Qual a data da devolução ?");
    String dtdevolucao = sc2.nextLine();
    String status = "Não devolvido";
    Locação locacao = new Locação(LocalDate.parse(dataLocacao, df), cpfcliente, código, LocalDate.parse(dtdevolucao, df), status);
    locações.add(locacao);

    break;

    case 5:

    for(Locação p : locações)
    System.out.println("Qual o código do livro que deseja remover ?");
    Integer cd = sc2.nextInt();
    locações.removeIf(p -> p.getCdlivro().equals(cd));
    System.out.println("livro do código "+cd+" foi excluido com sucesso");
    
    break;

    case 6:
    for(Locação a : locações){
        System.out.println(a);
    }
  
    break;

    case 7:

    for(Locação a : locações);

    String inicio = sc.nextLine();
    String fim = sc.nextLine();
   
    locações.stream()
    .filter(a -> a.getDataLocacao() == LocalDate.parse(inicio, df) && a.getDataLocacao() == LocalDate.parse(fim, df) && a.getStatus() == "Não devolvido" )
    .collect(Collectors.toList())
    .forEach(System.out::println);   

    break;
    
}
    }  while (opcao != 0); 
    sc.close();
 }
}

