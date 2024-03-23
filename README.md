# Calculadora de Velocidade de Download

Este é um projeto Java que calcula a velocidade estimada de download com base na distância dos servidores e na velocidade do plano de internet.

## Funcionamento

O programa apresenta um menu com uma opção para calcular a velocidade estimada de download. O usuário informa a distância dos servidores em quilômetros e a velocidade do plano de internet em Mbps (megabits por segundo). O programa então calcula a velocidade de download estimada usando a fórmula: VD = VelocidadePlano / (1 + (DistanciaServidores / 100))

- `VD` é a velocidade de download estimada em Mbps.
- `VelocidadePlano` é a velocidade do plano de internet em Mbps.
- `DistanciaServidores` é a distância dos servidores em quilômetros.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- `Internet.java`: Classe principal que inicia a aplicação.
- `Menu.java`: Classe responsável por exibir o menu de opções e interagir com o usuário.

## Como Executar

Para executar o projeto, siga estas etapas:

1. Certifique-se de ter o Java 17 instalado em sua máquina.
2. Compile os arquivos do projeto.
3. Execute o arquivo `Internet.class`.

## Como Usar

1. Ao iniciar o programa, você será apresentado com um menu de opções.
2. Escolha a opção correspondente ao cálculo da velocidade estimada de download digitando o número e pressionando Enter.
3. Siga as instruções exibidas na tela para inserir a distância dos servidores e a velocidade do plano de internet.
4. O programa calculará e exibirá a velocidade de download estimada.

## Contribuindo

Se deseja contribuir com este projeto, siga estas etapas:

1. Faça um fork do projeto.
2. Implemente suas alterações.
3. Envie um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
