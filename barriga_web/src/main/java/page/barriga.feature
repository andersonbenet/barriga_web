#Author: andersondacruzbenet@gmail.com
Feature: Incluir proposta via site Crédito Pessoal
  Como cliente novo
  Eu quero solicitar um novo empréstimo

  @regressao
  Scenario: Incluir nova proposta de crédito pessoal para cliente novo
    Given Eu acessei o site de crédito pessoal
    When Eu informar os dados para nova solicitação de crédito pessoal
    Then Eu recebo a mensagem a mensagem de solicitação de crédito pessoal efetivada com sucesso
