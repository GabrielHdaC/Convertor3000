# Convertor3000
O Convertor3000 é uma aplicação em linha de comando (CLI) desenvolvida em Java para realizar conversões de números decimais para bases binária, octal e hexadecimal. O projeto foi estruturado com foco em modularidade, utilizando classes específicas para cada tipo de conversão.

## Visão Geral

O **Convertor3000** é uma ferramenta de linha de comando (CLI) simples, mas robusta, desenvolvida em Java. Seu objetivo principal é auxiliar desenvolvedores, estudantes e entusiastas de programação a realizar conversões rápidas de números decimais para os sistemas binário, octal e hexadecimal. A aplicação foi criada para ser intuitiva e fácil de usar, fornecendo um menu interativo para as escolhas de conversão.

## Estrutura do Projeto

A arquitetura do projeto foi pensada para ser modular e organizada, o que facilita a manutenção e a adição de novas funcionalidades no futuro.

-   `src/App.java`: A classe principal que contém o método `main`. Ela gerencia a interface com o usuário, exibindo o menu de opções e controlando o fluxo do programa.
-   `src/ConvertorBinario.java`: Contém a lógica específica para a conversão de números decimais para o formato binário.
-   `src/ConvertorOctal.java`: Responsável pela lógica de conversão de números decimais para o formato octal.
-   `src/ConvertorHexadecimal.java`: Implementa a lógica de conversão de números decimais para o formato hexadecimal.

## Tecnologias Utilizadas

-   **Linguagem de Programação**: Java
-   **Versão do Java**: `openjdk version "21.0.8"` (ou superior)
-   **Ambiente de Desenvolvimento (IDE)**: Visual Studio Code (VS Code)
-   **Extensão do VS Code**: [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
-   **Fontes de Pesquisa**: `w3schools` (para referências de comandos e sintaxe)

## Como Usar

Para executar o **Convertor3000**, siga estes passos:

1.  **Pré-requisitos**: Certifique-se de ter o Java Development Kit (JDK) instalado na versão 21 ou superior.
2.  **Compilação**: Abra o terminal na pasta raiz do projeto (`ConvertorDHBO`) e compile os arquivos `.java` utilizando o comando:
    ```bash
    javac -d bin src/*.java
    ```
    Isso criará os arquivos `.class` compilados na pasta `bin`.
3.  **Execução**: Agora, execute a aplicação com o seguinte comando:
    ```bash
    java -cp bin App
    ```
    O menu interativo será exibido no terminal, permitindo que você escolha o tipo de conversão desejado.

## Licença

Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo `LICENSE.md`.
