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
##### Menu Principal

![image](https://github.com/user-attachments/assets/f9a5052b-923d-4e0d-8215-b1c203e10cc8)

##### Menu de escolha de dificuldade:

![image](https://github.com/user-attachments/assets/21f6f1b7-ac9c-4d57-b48a-ccb4f0bf67dc)

##### Interface geral do jogo, labirinto na dificuldade fácil e exibição dos status:

![image](https://github.com/user-attachments/assets/bd8696d4-b378-4adb-851b-06c4fd0ac1fe)

##### Mensagem para quando o aventureiro interage com o item Água: 

![image](https://github.com/user-attachments/assets/a2f06494-44d5-421b-8cc0-fc790ff45fed)

##### Mensagem para quando o aventureiro interage com o item Cacto:

![image](https://github.com/user-attachments/assets/137020d2-c06a-4cfc-a376-702d4f88ff79)

##### Imagem da mensagem de derrota: 

![image](https://github.com/user-attachments/assets/f702db18-c837-42be-b35e-2b700c182af7)

##### Exemplo de labirinto na dificuldade Média:

![image](https://github.com/user-attachments/assets/cf771bc9-29b1-4bd2-9fc0-355b15bb8c5d)

##### Exemplo de labirinto na dificuldade Difícil:

![image](https://github.com/user-attachments/assets/6e730b7d-43fa-4905-88da-efd1fb7ed01c)

##### Imagem da mensagem de vitoria: 

![image](https://github.com/user-attachments/assets/9375f7c7-2f6b-483b-b97e-6ceb2a08d262)

##### Imagem de mensagem da vitória perfeita (easter egg):

![image](https://github.com/user-attachments/assets/a1a6bf39-481e-443e-a4ad-51c1ec11c0df)

##### Vizualização do Ranking e encerramento do programa, Ranking exibe nome e o tempo

![image](https://github.com/user-attachments/assets/95f35c27-a497-40e6-846c-44c385a794e2)

## Explicação do código
O projeto foi desenvolvido com base nos princípios da programação orientada a objetos e estruturado em pacotes que agrupam classes com responsabilidades semelhantes. Essa organização modular permite uma separação clara das funcionalidades do jogo, facilitando a manutenção, o entendimento do código e a expansão futura do sistema. Ao dividir o projeto em pacotes, obtém-se maior modularização, permitindo que cada parte do código atue de forma independente e focada. Isso também proporciona reutilização de componentes, como itens e perigos, que podem ser manipulados por diferentes partes do sistema sem repetição. Além disso, essa abordagem garante maior escalabilidade, permitindo adicionar novas funcionalidades com facilidade, e melhora a manutenibilidade, já que erros e ajustes podem ser resolvidos de forma localizada, sem afetar o restante da aplicação. A seguir, cada pacote é descrito individualmente, destacando sua função, a lógica interna das classes e como os conceitos de orientação a objetos foram aplicados. 
### perigo 
Este pacote é responsável pelos elementos que causam dano ao aventureiro durante sua jornada.
#### Perigo.java 
Classe abstrata que define a estrutura base de todos os perigos do jogo. Ela possui os atributos x e y (posição no mapa) e o método abstrato aplicarEfeito(Aventureiro aventureiro), que deve ser implementado por todas as subclasses.
#### Cacto.java
Classe concreta que estende Perigo. Representa o obstáculo cacto, que ao ser tocado reduz a vida do aventureiro. Implementa o método aplicarEfeito, causando um dano de 30 pontos.
##### Aplicações da Programação Orientada a Objetos
Herança: a classe Cacto herda atributos e métodos de Perigo, reutilizando código e centralizando a lógica comum.
Polimorfismo: o método aplicarEfeito é chamado de forma genérica, independentemente do tipo específico de perigo. Isso permite que o labirinto trate diferentes perigos da mesma forma, sem precisar conhecer os detalhes de cada um.
### item
O pacote item agrupa todos os elementos que auxiliam o jogador ao longo da partida. Ele segue a mesma arquitetura do pacote perigo, utilizando classes abstratas, herança e polimorfismo para organizar os diferentes tipos de itens.
#### Item.java
Classe abstrata que define a estrutura básica de todos os itens do jogo. Contém os atributos x e y (posição do item no labirinto) e o método abstrato aplicarEfeito(Aventureiro aventureiro), que precisa ser implementado pelas subclasses.
#### Agua.java
Classe que representa um item de cura. Quando coletado pelo aventureiro, recupera 15 pontos de vida. Implementa o método aplicarEfeito, que chama aventureiro.curar(20) e exibe uma mensagem de recuperação.
#### Tesouro.java
Item que finaliza o jogo com vitória. Sua presença representa o objetivo principal da partida. Ao ser coletado, exibe uma mensagem de sucesso e registra o tempo no ranking.
#####  Aplicações da Programação Orientada a Objetos
Encapsulamento: cada classe é responsável apenas por seu comportamento e interação com o aventureiro, mantendo responsabilidade única.
### personagem
Este pacote contém a classe responsável por armazenar e manipular os dados do jogador principal, o aventureiro. Toda a lógica relacionada à posição, movimentação e controle da vida está encapsulada aqui.
#### Aventureiro.java
Classe que representa o personagem controlado pelo jogador. Armazena os atributos nome, vida, e posição atual no labirinto. Contém métodos para mover o personagem, curar, reduzir vida e acessar ou modificar os dados essenciais.
#####  Aplicações da Programação Orientada a Objetos
Encapsulamento: os atributos são privados, e só podem ser acessados ou modificados através de métodos públicos (getVida(), curar(), reduzirVida(), etc.)
### ranking
O pacote ranking é responsável por armazenar, organizar e exibir os resultados dos jogadores que venceram o jogo, levando em conta o tempo de conclusão e a dificuldade escolhida.
#### Registro.java 
