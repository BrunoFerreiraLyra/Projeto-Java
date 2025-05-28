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
Representa um registro de vitória. Armazena o nome do jogador, o tempo (em segundos) e a dificuldade correspondente. Também inclui um método para formatar o tempo em minutos e segundos, facilitando a exibição no ranking.
#### Ranking.java
Responsável por manter e exibir os rankings separados por dificuldade. Usa um Map<Dificuldade, List<Registro>> para armazenar os resultados de forma categorizada. Também implementa a ordenação dos registros por tempo, do menor para o maior, garantindo que os jogadores mais rápidos apareçam primeiro.
#####  Aplicações da Programação Orientada a Objetos
Encapsulamento: os registros e a estrutura interna do ranking estão protegidos; interações externas ocorrem apenas por métodos públicos (adicionarRegistro(), mostrarRanking()).
### labirinto
O pacote labirinto é o núcleo estrutural do jogo. Ele concentra toda a lógica da criação do mapa, posicionamento do aventureiro, interação com itens e perigos, e exibição do cenário no console. Ele também define o tamanho do labirinto com base na dificuldade e garante que o jogo responda visualmente a cada jogada. A geração do labirinto acontece dentro do método private void gerarLabirinto(). Esse método é chamado automaticamente pelo construtor da classe Labirinto, e ele é responsável por construir todo o mapa do jogo antes da primeira jogada começar.
#### Labirinto.java
A classe Labirinto é uma das mais importantes do projeto, pois centraliza a estrutura física do jogo e a lógica de interação com o ambiente. A geração do labirinto ocorre dentro do método gerarLabirinto(), chamado automaticamente ao instanciar a classe Labirinto. O processo se inicia com a criação de uma matriz bidimensional de caracteres (char[][]), cujo tamanho é definido com base na dificuldade escolhida pelo jogador (Fácil, Médio ou Difícil), utilizando os valores definidos na enumeração Dificuldade. Em seguida, essa matriz é preenchida com paredes (#) ao longo das bordas, garantindo que o jogador não possa sair dos limites do mapa. As células internas são marcadas como caminhos livres (' '), permitindo movimentação. Após isso, o jogo calcula a quantidade de cactos (*) com base em 10% da área total do mapa (linhas * colunas / 10) e os posiciona aleatoriamente em células vazias. O próximo passo é a geração das Águas (Á), cuja quantidade é proporcional à distância mínima entre a posição inicial do aventureiro e o tesouro, usando a fórmula Math.max(5, (linhas + colunas - 4) / 5), o que garante um equilíbrio entre dificuldade e recursos de cura. Por fim, o aventureiro é posicionado sempre na célula superior esquerda do labirinto (posição fixa (1, 1)), enquanto o tesouro é colocado na célula inferior direita (posição (linhas - 2, colunas - 2)), criando um percurso claro a ser percorrido e assegurando que um caminho mínimo sempre exista, mesmo com a geração aleatória de elementos.
#### LabirintoFactory.java
Uma fábrica que cria labirintos com base na dificuldade escolhida. Centraliza a criação do objeto Labirinto, melhorando a legibilidade da Main.
#### Dificuldade.java
Enumeração que define três níveis de dificuldade (FÁCIL, MÉDIO, DIFÍCIL), cada um associado a um tamanho específico de labirinto.
#### ControleMovimento.java
A classe ControleMovimento é responsável por capturar os comandos de movimentação inseridos pelo jogador e determinar se o movimento é válido dentro dos limites do labirinto. Ela funciona como um intermediário entre o jogador e o mapa, garantindo que cada ação respeite as regras do ambiente, como não atravessar paredes nem sair das bordas do labirinto. O método lerComando() lê a entrada do jogador, converte para letra maiúscula e verifica se a tecla digitada é válida, lançando uma exceção amigável caso contrário. Já o método calcularNovaPosicao() utiliza a posição atual do aventureiro e o comando inserido para calcular a nova posição pretendida, validando se a célula de destino está dentro dos limites do mapa e se não é uma parede ('#'). Se o movimento for válido, ele retorna as novas coordenadas; caso contrário, uma exceção é lançada e a jogada é ignorada. Essa estrutura permite que o jogo reaja adequadamente a comandos inválidos, mantendo a integridade do sistema e proporcionando uma jogabilidade mais segura e controlada.
#####  Aplicações da Programação Orientada a Objetos
Encapsulamento: todas as estruturas internas (mapa, lista de itens, perigos) são manipuladas apenas por métodos públicos, protegendo a integridade do jogo.

Composição: o labirinto é composto por Item, Perigo e um Aventureiro, que interagem por meio de métodos como verificarItem() e verificarPerigo().

Abstração: o uso de LabirintoFactory esconde os detalhes de construção e facilita o uso da classe principal.

Coleções: a classe Labirinto utiliza listas genéricas do tipo ArrayList para representar dinamicamente os elementos interativos do jogo.

Polimorfismo: possibilita chamar aplicarEfeito() sem saber se o objeto é uma Água ou Tesouro, por exemplo.
### jogo
O pacote jogo concentra as classes responsáveis por iniciar o jogo, exibir o menu, controlar o tempo e integrar todos os outros pacotes. É nele que está localizada a Main, além de componentes auxiliares como o menu principal, o temporizador e a exibição de status.
#### Menu.java
A classe Menu, localizada no pacote jogo, é responsável por exibir ao jogador as opções iniciais do sistema e encaminhar a execução conforme a escolha feita. Logo ao iniciar o programa, a Main chama Menu.exibirMenuPrincipal(), que apresenta três opções: iniciar o jogo, visualizar o ranking ou encerrar o programa. O menu captura a entrada do usuário usando a classe Scanner e, com base na escolha, direciona o fluxo para o método correspondente. Caso o jogador escolha iniciar uma partida, o método iniciarJogo() da Main é chamado, dando início ao processo completo de configuração e execução do jogo. Se a opção for exibir o ranking, a estrutura Ranking exibe as vitórias registradas separadas por dificuldade. Se a opção for encerrar, o programa finaliza com uma mensagem de despedida. A presença dessa classe demonstra uma separação clara entre a lógica do jogo e a interface de interação inicial, favorecendo a organização, legibilidade e expansão futura do código. A estrutura do menu também permite que o jogador retorne ao início após uma partida concluída, promovendo uma experiência contínua e mais dinâmica.
#### Temporizador.java
A classe Temporizador é responsável por medir o tempo de duração de cada partida. Ela atua como um cronômetro que registra o momento de início e calcula o tempo total quando a partida é concluída, seja por vitória ou derrota. Internamente, a classe utiliza o método System.currentTimeMillis() para capturar a hora exata em milissegundos, tanto no início (iniciar()) quanto no fim da partida (parar()). O tempo final é calculado como a diferença entre esses dois momentos e convertido em segundos. Além disso, o método formatarTempo() permite exibir o tempo total de forma legível, no formato minutos e segundos, tanto ao jogador quanto na exibição do ranking. Durante o jogo, o tempo decorrido também pode ser mostrado em tempo real por meio do método getTempoDecorrido(), o que enriquece o status do jogador exibido a cada rodada.
#### ExibidorStatus.java 
A classe ExibidorStatus, localizada no pacote jogo, é responsável por exibir no console as informações atualizadas do aventureiro durante a partida. A cada jogada válida, ela imprime dados como o nome do jogador, quantidade atual de vida, posição no labirinto e o tempo decorrido desde o início da partida.A lógica de exibição é centralizada no método mostrarStatus(Aventureiro aventureiro, Temporizador temporizador), que recebe o objeto do aventureiro e o temporizador ativo, formatando e imprimindo todas as informações de forma padronizada e estética. Essa abordagem contribui diretamente para a clareza da interface textual, e também ajuda a manter a classe principal (Main) mais limpa.
#### Main.java
A classe Main, localizada no pacote jogo, é o ponto de entrada da aplicação e atua como coordenadora principal do fluxo do jogo. Inicialmente, ela exibe o menu principal através da classe Menu. a classe cria o Labirinto, posiciona o Aventureiro na célula inicial e inicia o Temporizador. O jogo entra então em um loop onde a cada jogada o labirinto é impresso, o status do jogador é exibido e um comando de movimento é processado com ajuda do ControleMovimento. Caso a vida chegue ao limite mínimo, o jogo encerra com derrota. Após o fim da partida — seja por vitória ou derrota — o menu principal é automaticamente reexibido, permitindo ao jogador escolher jogar novamente, consultar o ranking ou encerrar o programa. Essa estrutura garante um ciclo contínuo de jogabilidade, reforçando a interatividade e promovendo uma experiência fluida e modular para o usuário.
#### Easter Egg (presente na Main.java)
O jogo inclui um easter egg que recompensa o jogador por concluir o desafio com um desempenho excepcional. Esse easter egg é ativado quando o jogador encontra o tesouro dentro de um tempo considerado “perfeito”, de acordo com a dificuldade escolhida. O código do easter egg está implementado diretamente dentro da lógica de vitória, na classe Main.java, logo após o jogador encontrar o tesouro. A verificação é feita com base no tempo total da partida, utilizando o Temporizador, que é iniciado no começo da sessão e parado no momento da vitória. O tempo total em segundos é então comparado com um limite específico para cada dificuldade: 10 segundos para o nível fácil, 15 para o médio e 20 para o difícil. Caso o jogador vença dentro desse intervalo, o sistema imprime uma mensagem especial no console: "Vitória Perfeita! [Nome] dominou as Areias do Destino!". O trecho responsável por essa verificação está estruturado com um switch que analisa a dificuldade escolhida e define se a vitória se enquadra como “perfeita”. A lógica está integrada ao fluxo padrão do jogo, sem interferir na funcionalidade do ranking, e atua apenas como uma recompensa adicional para o desempenho rápido e estratégico do jogador. Essa funcionalidade é simples, mas eficaz, e adiciona um toque de desafio e surpresa ao jogo, incentivando múltiplas tentativas e otimizando o tempo de conclusão.
##### Aplicações da Programação Orientada a Objetos
Encapsulamento: Cada classe do pacote jogo encapsula uma responsabilidade distinta: Temporizador gerencia o tempo de forma independente. Menu lida exclusivamente com a interação inicial do usuário. ExibidorStatus concentra toda a exibição das informações do jogador. Os atributos são privados e só acessados por meio de métodos públicos, protegendo os dados internos.

Abstração: As interfaces oferecidas pelas classes (iniciar(), parar(), mostrarStatus(), lerComando(), etc.) escondem os detalhes de implementação e expõem apenas o necessário.

Reutilização: Menu e ExibidorStatus também podem ser facilmente reaproveitados em outros projetos de console com pouca ou nenhuma modificação.

Polimorfismo: Objetos do tipo Item ou Perigo são manipulados de forma genérica. Isso permite aplicar efeitos (aplicarEfeito) sem saber o tipo específico do objeto.


