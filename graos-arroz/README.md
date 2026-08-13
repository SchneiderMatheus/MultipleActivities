Conta uma antiga lenda que um imperador desejava agradecer ao inventor do jogo
de xadrez por sua criação e pediu que ele escolhesse uma recompensa.
O inventor fez um pedido aparentemente simples:
• 1 grão de arroz para a primeira casa do tabuleiro;
• 2 grãos para a segunda casa;
• 4 grãos para a terceira;
• 8 grãos para a quarta;
e assim sucessivamente, dobrando a quantidade de grãos a cada nova casa, até
completar as 64 casas do tabuleiro.
Embora o pedido parecesse modesto, rapidamente percebe-se que a quantidade
total de grãos cresce de forma extraordinária.
Item 1 — Quantidade mínima de casas
Escreva um programa em Java que determine quantas casas do tabuleiro são
necessárias para que a quantidade acumulada de grãos seja igual ou superior a:
• 1.000 grãos;
• 1.000.000 de grãos;
• 1.000.000.000 de grãos.
Durante a execução, apresente para cada iteração:
• o número da casa;
• a quantidade de grãos da casa atual;
• a quantidade total de grãos acumulada até aquela casa.
Exemplo de saída
Casa: 1 | Grãos na casa: 1 | Total acumulado: 1
Casa: 2 | Grãos na casa: 2 | Total acumulado: 3
Casa: 3 | Grãos na casa: 4 | Total acumulado: 7
...
Item 2 — Representação do tabuleiro
Crie um vetor bidimensional (8 × 8) para representar o tabuleiro de xadrez.
Cada posição da matriz deverá armazenar a quantidade de grãos correspondente
à respectiva casa do tabuleiro.
Após preencher a matriz, apresente o tabuleiro completo na tela, mostrando a
quantidade de grãos armazenada em cada casa.
O preenchimento deverá ser realizado da primeira até a última casa, linha por
linha.
Dica: para armazenar corretamente a quantidade de grãos das últimas casas do
tabuleiro, utilize o tipo de dado:
unsigned long long
Esse tipo permite armazenar valores muito maiores do que os tipos inteiros
tradicionais, sendo adequado para este problema.