# Padrões de Criação

  Em um sistema orientado a objetos, a criação de certos objetos pode ser uma tarefa extrema-
mente complexa. Podemos destacar dois problemas relacionados a criação de objetos:

• definir qual classe concreta deve ser utilizada para criar o objeto;

• definir como os objetos devem ser criados e como eles se relacionam com outros objetos do
sistema.

  Seguindo o princípio do encapsulamento, essa complexidade deve ser isolada. 
  
  A seguir, mostra-remos padrões de projetos que podem ser adotados para encapsular a criação de objetos em diversas situações distintas.
  
  Veja abaixo um resumo do objetivo de cada padrão de criação.
  
  Factory Method: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.

  Abstract Factory: Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias.

  Builder: Separar o processo de construção de um objeto de sua representação e permitir a sua criação passo-a-passo. Diferentes tipos de objetos podem ser criados com implementações distintas de cada passo.

  Prototype: Possibilitar a criação de novos objetos a partir da cópia de objetos existentes.

  Singleton: Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.

  Multiton: Permitir a criação de uma quantidade limitada de instâncias de determinada classe e fornecer um modo para recuperá-las.

  Object Pool: Possibilitar o reaproveitamento de objetos.
