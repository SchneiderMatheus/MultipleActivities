Na tabela ASCII, cada caractere possui um valor inteiro correspondente. Em Java,
é possível obter as letras seguintes por meio de operações como:
char('a' + 1) // resulta em 'b'
char('a' + 2) // resulta em 'c'
Desenvolva um programa em JAVA que utilize uma estrutura de repetição while
para apresentar uma tabela contendo todas as letras minúsculas de a até z.
Para cada letra, o programa deverá mostrar:
• o caractere;
• o valor inteiro correspondente ao caractere.
Exemplo de saída
Caractere: a | Valor inteiro: 97
Caractere: b | Valor inteiro: 98
Caractere: c | Valor inteiro: 99
...
Caractere: z | Valor inteiro: 122
O valor numérico deverá ser obtido por meio da conversão do caractere para o tipo
int.