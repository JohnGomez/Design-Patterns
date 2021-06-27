# Prototype
Esse é um simples projeto com um exemplo de implementação do padrão Prototype. 

### Atenção:
O Java possui uma interface padrão para implementar esse patterns ```java.lang.Cloneable```. 
Essa implentação não considera a existência dessa interface.

## Problema
Você precisa clonar um objeto. Ou seja, outra instância da mesma classe com os mesmo valores.
Mas porque não apenas criar uma nova instância da classe com ```new```, e atribuir os valores um a um ?

O primeiro problema é que alguns atributos dessa classe podem ser privado (sem métodos gets ou setters) e o outro é o acoplamento. Para clonar um objeto você precisaria saber qual é a classe daquele objeto. Se estiver usando inversão de controle por exemplo, onde você não tem a classe concreta e sim a interface, como saber quais o atributos aquela classe vai ter?  


## Solução
Criamos uma [interface](https://github.com/JohnGomez/Design-Patterns/blob/master/Criacionais/prototype/src/com/patterns/AbstractModel.java) (poderia ser uma classe abstrata) com o método ```clone()``` e a implementamos na [classe](https://github.com/JohnGomez/Design-Patterns/blob/master/Criacionais/prototype/src/com/patterns/People.java) dos objetos que podem ser clonados.
A implementação do método ```clone()``` é bem simples; Invoca um contrutor privado da classe concreta que recebe uma instância da propria classe. 



