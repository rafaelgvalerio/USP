# Controle de Video Game - Arduino

## Instruções

O projeto consiste na criação de um controle de video game. Nós o usaremos para jogar games, mas ele pode ser facilmente adaptado para qualquer outro objeto/atividade, como, por exemplo, para um piano.

## Explicação do Projeto

O funcionamento do controle é bem simples. No estado inicial, o Arduino manda 5V para Protoboard e os recebe de volta, no entanto, quando apertamos algum dos push buttons, acabamos por "roubar" parte dessa tensão e isso é sentido pelo Arduino, que manda um sinal para o computador em forma de uma string. Essa string é lida por um programa feito em Java, que está rodando em segundo plano no computador, e é transformada em um comando de teclado. Desse modo, conseguimos mandar inputs de teclado para o computador usando apenas bananas.

* OBS: Foi necessário o uso do programa em Java, porque o Arduino UNO não possui a capacidade de mandar inputs de teclado, diferentemente do Arduino Leonardo. Ou seja, caso tivéssemos conseguido um Arduino Leonardo, o script em Java seria desnecessário.

## Componentes Utilizados

| Quantidade |         Componente          |    Valor    |
| :--------- |:--------------------------: | ----------: |
| 1x         | Protoboard                  | emprestado  |
| 1x         | Arduino UNO                 | emprestado  |
| 24x        | Jumper wire                 | emprestado  |
| 8x         | Push button                 | R$0,70 cada |
| 8x         | Resistor CR25 1K carvão LGE | R$0.07 cada |
| 8x         | Banana                      | R$0.80 cada |
|            |         TOTAL               |             |

* OBS: Utilizamos push buttons para testar o funcionamento do circuito, mas eles não aparecem no projeto final, já que o objetivo é criar um dispositivo controlado por bananas.

## Diagrama com as conexões

![alt text][foto2]

[foto2]: https://i.imgur.com/wLgtLHg.png

* OBS: Optamos por deixar o Tinkercad com os push buttons, porque nele não há bananas.

## Imagem do controle montado

![alt text][foto1]

[foto1]: 

## Vídeo mostrando e explicando o funcionamento do controle

Link:

## Alunos

|         Alunos          |   NUSP    |
| :---------------------- | :-------: |
| Gabriel da Costa Merlin |  12544420 |
| Mateus Bernal Leffeck   |  13673318 |
| Rafael Galbiati Valério |  13672895 |
