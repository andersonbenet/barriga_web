#Author: andersondacruzbenet@gmail.com
Feature: Incluir proposta via site Cr�dito Pessoal
  Como cliente novo
  Eu quero solicitar um novo empr�stimo

  @regressao
  Scenario: Incluir nova proposta de cr�dito pessoal para cliente novo
    Given Eu acessei o site de cr�dito pessoal
    When Eu informar os dados para nova solicita��o de cr�dito pessoal
    Then Eu recebo a mensagem a mensagem de solicita��o de cr�dito pessoal efetivada com sucesso
