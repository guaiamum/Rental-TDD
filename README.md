# Rental-TDD
Movie rental application using Test Driven Design

## Descrição do processo
  * Começamos por Customer testando o total dos seus pontos de fidelidade;
  * Refactoring para ajustar os parâmetros da classe Customer (possui String nome, ArrayList myRentals);
  * Testes FAIL. Falta somar os pontos dos Rentals;
  * Refactoring para o método getAllFidelityPoints, da classe Customer, tendo por base uma lista de Rentals;
  * Testes OK. 
  ### Rental points
  * Prosseguimos pelo teste dos pontos de fidelidade para cada aluguel;
  * Refactoring para ajustar os parâmetros da classe Rental (possui int points);
  * Testes OK;
  * Refactoring para somar pontos de Movies no Rental;
  * Testes FAIL. Falta referenciar Movies em Rental;
  * Refactoring para referenciar Movies em rental;
  * Testes OK;
  * Refactor para remover pontos do Rental;
  * Testes OK;
  * Agora testamos o preço do Movie;
  * Testes FAIL. Falta propriedade em Movie;
  * Refactoring para atribuir preço em Movie;
  * Testes OK;
  * Testamos valor total da Rental;
  * Testes FAIL. Falta somar preços de Movies de Rental;
  * Refactoring para soma;
  * Testes OK;
  
  
