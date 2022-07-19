# Fonte de Tensão Ajustável

## Instruções

Construir uma fonte de tensão ajustável entre 3V e 12V DC com capacidade de 100mA e que funcione a partir de uma tomada de 127V AC.

## Objetivo

O objetivo desse projeto é a ratificação do conhecimento passado durante o 1° semestre por meio de sua aplicação para a criação de um circuito que atenda as especificações estabelecidas. Assim, os estudos por trás dos componentes e de suas funções nos auxiliaram a alcançar o que foi pedido.

## Cálculos

![alt text][foto1]

[foto1]: https://i.imgur.com/PvzGco1.png

## Componentes

| Quantidade |         Componente          |    Valor    |
| :--------- |:--------------------------: | ----------: |
| 1x         | Protoboard                  | emprestado  |
| 1x         |     Transformador           | emprestado  |
| 1x         | Potenciômetro 10Ω           | R$7.00      |
| 1x         | Capacitor 680uF 25V         | R$5.78      |
| 1x         | Diodo Zener 13V 1N4743      | R$2.79      |
| 4x         | Diodo retificador 1N4007    | R$0.20 cada |
| 1x         | LED                         | R$0.50      |
| 1x         | Transistor 2N3904           | R$0.40      |
| 1x         | Resistor CR25 1K carvão LGE | R$0.07 cada |
|            |         TOTAL               | R$16,74     |

## Descrição dos componentes

* **Transformador**: Basicamente aumenta ou dimunui a tensão de acordo com a quantidade de espiras de cada lado do transformador. Ex: Um transformador 10/1 pode diminuir a tensão em 10 vezes ou aumentar tensão em 10 vezesl, dependendo de como for conectado.

* **Potenciômetro**: É um componente com resistência ajustável. Usamos ele para controlr a tensão de saída (3 a 12 Volts).

* **Capacitor**:  Ele armazena parte da carga para soltar quando a tensão interna é maior que a tensão vinda da fonte. O capacitor escolhido foi 680uF 25V;

* **LED**: Usada somente para informar a passagem de corrente. Quanto mais brilhoso, maior a tensão que está passando por ele.

* **Ponte de Diodo**: Feito com 4 diodos, tem a missão de retificar a tensão vinda do transformador.

* **Diodo Zener**: O zener tem a função de "travar" o valor de tensão em 13V para manter a corrente contínua.

* **Transistor**: Nesse circuito usamos o transistor para alimentar a saída com corrente suficiente, caso não utilizássemos a corrente na saída seria muito baixa.

* **Resistor**: Tem a função de limitar a corrente do circuito para que não ultrapasse os valores que os componentes suportam.

## Imagens da fonte montada

![alt text][foto2]
![alt text][foto3]

[foto2]: https://i.imgur.com/fknIOfn.jpeg
[foto3]: https://i.imgur.com/iAvvsa3.jpeg

## Circuito no Falstad

![alt text][foto4]

[foto4]: https://i.imgur.com/Js8pvWE.png

link: https://tinyurl.com/27m4wobq

## Imagem do projeto esquemático e do PCB no Eagle

![altt text][foto5]
![alt text][foto6]

[foto5]: https://i.imgur.com/AwHHvlB.png
[foto6]: https://i.imgur.com/Xo6GL79.png

## Vídeo explicando o circuito

link: 

## Alunos

|         Alunos          |   NUSP    |
| :---------------------- | :-------: |
| Gabriel da Costa Merlin |  12544420 |
| Mateus Bernal Leffeck   |  13673318 |
| Rafael Galbiati Valério |  13672895 |
