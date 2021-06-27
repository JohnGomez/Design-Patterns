#Prototype
Esse é um simples projeto com um exemplo de implementação do padrão Prototype. 

### Atenção:
Esse padrão já é implementado pelo java através da interface clonable

## Problema
Você precisa clonar um objeto. Ou seja, outra instância da mesma classe com os mesmo valores.
Mas porque não apenas criar uma nova instância da classe com new, e atribuir os valores um a um ?

A resposta é auto acoplamento. 


## Solução
Criamos uma interface (poderia ser uma classe abstrata) com o método clone e a implementamos na classe que poderá ser clonada.
A implementação do método clone é bem simples; Invoca um contrutor da concreta que recebe uma instância da prorpia classe. 



