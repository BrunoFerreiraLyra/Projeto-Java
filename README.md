# Areias do destino
#### Programação orientada a objetos
#### Grupo: Bruno Ferreira de Andrade Lyra 852103. - Projeto 2°GQ 

## Sobre o jogo
 Em Areias do destino jogador assume o papel de um aventureiro que precisa cruzar o caminho no deserto até chegar no tesouro. Porém a cada movimento o avnetureiro sente a dificuldade de andar no clima do deserto, e por isso precisa coletar Águas espalhadas pelo labirinto para conseguir concluir a sua rota até o tesouro. No Labirinto o jogador precisa ficar atendo para não encostar em Cactos que ficam espalhados pelo mapa, caso ele encoste em um sofrerá dano, dificultando a chegar no seu destino final. Diante da situação o aventureiro terá que se mover de forma estratégica para conseguir evitar Cactos e coletar Águas para conseguir ter vida suficiente e chegar no tesouro.
 ### Regras do jogo 
- O aventureiro ( *O* ) começa com 100 de vida
- A cada movimento executado o aventureiro perde 5 de vida
- Paredes ( *#* ) determinam o limite do mapa
- A cada Água ( *Á* ) que o jogador coleta ele ganha 15 de vida
- Se o jogador encostar em Cacto ( * ) ele perde 30 de vida
- observação: quando o jogador coleta um item, seja Cacto ou Água, ele não perde os 5 de vida causado pelo movimento naquela jogada
- O jogo é encerrado com vitória quando o aventureiro chega ao Tesouro ( *T* )
- O jogo é encerrado com derrota caso a vida chege a 0
### Como jogar
No começo é perguntado o nome do aventureiro, logo depois o jogador tem a opção de escolher entre 3 dificuldades, Fácil, Médio e Difícil. Após escolher um nome e dificuldade, o aventureiro sempre inicia no canto superior esquerdo do mapa e o tesouro está posicionado no canto inferior direito, possibilitando um caminho a ser seguido. Para se movimentar o jogador deve escolher entre as teclas WASD para escolher a direção do movimento e inserir a entrada. (W -> cima) (A -> esquerda) (S -> baixo) (D -> direita). O mapa é atualizado a cada jogada.
### Funcionalidades do jogo
- Escolher o nome
- Escolha de dificuldade (a dificuldade implica no tamanho do labirinto, quanto maior a dificuldade maior o tamanho do labirinto)
- Labirinto gerado aleatóriamente 
- Geração aleatória de Itens e Perigos proporcional a dificuldade
- Exibição do tempo de jogo em tempo real
- Sistema de menu para iniciar novas partidas ou visualizar o ranking
- Ranking com nome e tempo de conclusão para cada dificuldade
- Exibidor dos status do jogador sendo atualizados e exibidos a cada jogada
- Tratamento de erro para comandos inválidos
- Easter Egg: Se o jogador alcançar o tesouro em determinado tempo, é exibida uma mensagem especial de vitória perfeita (esse tempo varia de acordo com a dificuldade)
##### Legenda do jogo:
- '#' - Parede, determina os limites do labirinto
- ' ' - Caminho livre, espaço livre para movimentação
- '*' - Cacto, Perigo
- 'Á' - Água, Item de cura
- 'T' - Tesouro, O objetivo principal
- 'O' - Aventureiro, A peça que você controla 


#### Screen shots
##### Interface inicial da escolha do nome e dificuldade:

![image](https://github.com/user-attachments/assets/1b6d4977-34bf-43a7-a251-b5f168448745)

##### Interface geral do jogo, Labirinto na dificuldade fácil e exibidor de status:

![image](https://github.com/user-attachments/assets/c86e5292-fb2a-4506-aa18-1805da9eaf5c)

##### Mensagem para quando o aventureiro interage com o item Água:

![image](https://github.com/user-attachments/assets/458d9914-df46-4f8e-a917-c737d3e8106b)

##### Mensagem para quando o aventureiro interage com o item Cacto:

![image](https://github.com/user-attachments/assets/87f3e570-358b-49c5-a243-504657f28e15)

##### Imagem da mensagem de derrota:

![image](https://github.com/user-attachments/assets/536809ba-4951-4db0-916f-55afc5c64a25)

##### Exemplo de labirinto na dificuldade Média:

![image](https://github.com/user-attachments/assets/cf771bc9-29b1-4bd2-9fc0-355b15bb8c5d)

##### Exemplo de labirinto na dificuldade Difícil:

![image](https://github.com/user-attachments/assets/6e730b7d-43fa-4905-88da-efd1fb7ed01c)

##### Imagem da mensagem de vitoria:

![image](https://github.com/user-attachments/assets/41a6df18-2f0f-4d95-8daf-38e6d8b76ebf)

##### Imagem de mensagem da vitória perfeita (easter egg):

![image](https://github.com/user-attachments/assets/be767ff4-7d7b-4793-9834-adcb2ed9cfc5)

Substituir Turnos por temporizador
Adicionar Menu pra poder re jogar
Adicionar Raking




