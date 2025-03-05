# BATALHA RPG

Este é um jogo de batalha de personagens em Java, onde você pode escolher seu personagem, equipar armas e armaduras, e lutar contra um inimigo. 
Criado como um trabalho para a cadeira "Principios e Padrões de Projeto" do curso "Analise e Desenvolvimento de Sistemas" no IFRS - Campus Rio Grande.

## Estrutura do Projeto

```
controller/
    Jogo.java
models/
    factories/
        PersonagemFactory.java
        ArmaFactory.java
        ArmaduraFactory.java
    armaduras/
        Armadura.java
        ArmaduraLeve.java
        ArmaduraMedia.java
        ArmaduraPesada.java
    armas/
        ArcoEFlecha.java
        Arma.java
        Espada.java
        Faca.java
        Machado.java
        Mao.java
    Dado.java
    personagens/
        Cavaleiro.java
        Orc.java
        Personagem.java
        Rainha.java
        Rei.java
view/
    Main.java
```



## Como Jogar

1. Clone o repositório para sua máquina local.
2. Compile o projeto.
3. Execute a classe `Main` localizada em `view/Main.java`.

## Classes Principais

### Personagens

- `Personagem`: Classe abstrata que define um personagem.
- `Cavaleiro`: Implementação de um personagem Cavaleiro.
- `Orc`: Implementação de um personagem Orc.
- `Rainha`: Implementação de um personagem Rainha.
- `Rei`: Implementação de um personagem Rei.

### Armaduras

- `Armadura`: Classe abstrata que define uma armadura.
- `ArmaduraLeve`: Implementação de uma armadura leve.
- `ArmaduraMedia`: Implementação de uma armadura média.
- `ArmaduraPesada`: Implementação de uma armadura pesada.

### Armas

- `Arma`: Classe abstrata que define uma arma.
- `ArcoEFlecha`: Implementação de uma arma Arco e Flecha.
- `Espada`: Implementação de uma arma Espada.
- `Faca`: Implementação de uma arma Faca.
- `Machado`: Implementação de uma arma Machado.
- `Mao`: Implementação de uma arma Mão.

### Outros

- `Dado`: Classe que representa um dado de 20 lados.

### Factories

- `PersonagemFactory`: Fábrica para a criação de personagens.
- `ArmaFactory`: Fábrica para a escolha de armas.
- `ArmaduraFactory`: Fábrica para a escolha de armaduras.

### Jogo

- `Jogo`: Classe que contém a lógica do jogo.

### Main

- `Main`: Classe principal que contém a lógica de inicialização e o loop principal do jogo.

## Como Contribuir

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-feature`).
3. Faça suas alterações e commit (`git commit -am 'Adiciona nova feature'`).
4. Faça um push para a branch (`git push origin feature/nova-feature`).
5. Crie um novo Pull Request.

