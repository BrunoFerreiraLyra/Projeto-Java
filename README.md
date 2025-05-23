# Areias do destino
#### Programação orientada a objetos
#### Grupo: Bruno Ferreira de Andrade Lyra 852103. - Projeto 2°GQ 

## Sobre o jogo
 Em Areias do destino jogador assume o papel de um aventureiro que precisa trilhar o caminho no deserto até chegar no tesouro. Porém a cada movimento o avnetureiro sente a dificuldade de andar no clima do deserto, e por isso precisa coletar Águas espalhadas pelo labirinto para conseguir concluir a sua rota até o tesouro. No Labirinto o jogador precisa ficar atendo para não encostar em Cactos que ficam espalhados pelo labirinto, caso ele encoste em um sofrerá dano, dificultando a chegar no seu destino final. Diante da situação o aventureiro terá que se mover de forma estratégica para conseguir evitar Cactos e coletar Águas para conseguir ter vida suficiente e chegar no tesouro.
 ### Regras do jogo 
- O aventureiro ( *O* ) começa com 100 de vida
- A cada movimento executado o aventureiro perde 5 de vida
- Paredes ( *#* ) determinam o limite do mapa
- A cada Água ( *Á* ) que o jogador coleta ele ganha 15 de vida
- Se o jogador encostar em Cacto ( * ) ele perde 30 de vida
- observação: quando o jogador coleta um item, seja Cacto ou Água, ele não perde os 5 de vida causado pelo movimento
- O jogo é encerrado com vitória quando o aventureiro chega ao Tesouro ( *T* )
- O jogo é encerrado com derrota caso a vida chege a 0
### Como jogar
No começo é perguntado o nome do aventureiro, logo depois o jogador tem a opção de escolher entre 3 dificuldades, Fácil, Médio e Difícil. Após escolher um nome e dificuldade o labirinto é gerado com a posição do Aventureio e do Tesouro fixas, possibilitando um caminho a ser seguido. Para se movimentar o jogador deve escolher entre as teclas WASD para escolher a direção do movimento e inserir a entrada. (W -> cima) (A -> esquerda) (S -> baixo) (D -> direita). O mapa é atualizado a cada jogada.
### Funcionalidades do jogo
- Escolher o nome
- Escolha de dificuldade (a dificuldade implica no tamanho do labirinto, quanto maior a dificuldade maior o tamanho do labirinto)
- Labirinto gerado aleatóriamente 
- Geração aleatória de Itens e Perigos proporcional a dificuldade
- Exibidor dos status do jogador sendo atualizados e exibidos a cada jogada
- Easter Egg: Caso o jogador vença o labirinto em um número específico de rodadas é exibida uma mensagem de vitória especial
#### Screen shots
[Interface inicial da escolha do nome e dificuldade](![image](https://github.com/user-attachments/assets/1b6d4977-34bf-43a7-a251-b5f168448745)
