# Areias do destino

![image](https://github.com/user-attachments/assets/a0b58d5d-536f-4483-896d-338ebe9027fa)


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
- Easter Egg: Se o jogador alcançar o tesouro em determinado tempo, é exibida uma mensagem especial de vitória perfeita (esse tempo varia de acordo com a dificuldade. Fácil: até 10 segundos, Médio: até 15 segundos, Difícil até 20 segundos )
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
- **Responsabilidade central:** controla a estrutura física do jogo e toda a lógica de interação com o ambiente.
- **Geração automática:** o método gerarLabirinto() é chamado assim que a classe é instanciada.
- **Criação do mapa:**
  - Utiliza uma matriz bidimensional de caracteres (char[][]).
  - O tamanho da matriz é definido com base na dificuldade (Fácil, Médio ou Difícil) usando a enum Dificuldade.
- **Construção do labirinto:**
  - Bordas são preenchidas com # (paredes) para limitar o mapa.
  - Células internas são preenchidas com ' ' (espaços livres) para permitir movimentação.
- **Geração de obstáculos:**
  - Cactos ( * ) são gerados em 10% da área total do mapa.
  - São posicionados aleatoriamente em locais livres.
- **Geração de itens:**
  - Águas ( Á ) são geradas com base na fórmula:  
    Math.max(5, (linhas + colunas - 4) / 5).
  - Essa lógica garante equilíbrio entre dificuldade e possibilidade de cura.
- **Posições fixas:**
  - O aventureiro começa sempre na posição (1, 1).
  - O tesouro é posicionado na última célula disponível do mapa: (linhas - 2, colunas - 2).
- **Objetivo garantido:** sempre existe um caminho possível entre o início e o tesouro, mesmo com elementos aleatórios no mapa.
#### LabirintoFactory.java
Uma fábrica que cria labirintos com base na dificuldade escolhida. Centraliza a criação do objeto Labirinto, melhorando a legibilidade da Main.
#### Dificuldade.java
Enumeração que define três níveis de dificuldade (FÁCIL, MÉDIO, DIFÍCIL), cada um associado a um tamanho específico de labirinto.
#### ControleMovimento.java
- **Função principal:** interpreta os comandos de movimentação do jogador e verifica se o movimento é permitido no labirinto.
- **Papel no sistema:** atua como um intermediário entre o jogador e o mapa, garantindo que o personagem:
  - Não ultrapasse os limites do labirinto.
  - Não atravesse paredes ( # ).
- **Método lerComando()**
  - Lê o comando inserido pelo jogador via teclado.
  - Converte a entrada para letra maiúscula.
  - Verifica se o caractere digitado é válido (W, A, S, D).
  - Lança uma exceção com mensagem amigável se o comando for inválido.
- **Método calcularNovaPosicao()**
  - Recebe o comando e a posição atual do aventureiro.
  - Calcula a nova coordenada com base na direção indicada.
  - Valida se a nova posição:
    - Está dentro dos limites do mapa.
    - Não é uma parede.
  - Retorna a nova posição se for válida; caso contrário, lança uma exceção.
- **Benefícios para o jogo:**
  - Impede erros de movimentação.
  - Mantém o sistema estável e funcional mesmo com entradas incorretas.
  - Garante uma jogabilidade segura e controlada.
#####  Aplicações da Programação Orientada a Objetos
Encapsulamento: todas as estruturas internas (mapa, lista de itens, perigos) são manipuladas apenas por métodos públicos, protegendo a integridade do jogo.

Composição: o labirinto é composto por Item, Perigo e um Aventureiro, que interagem por meio de métodos como verificarItem() e verificarPerigo().

Abstração: o uso de LabirintoFactory esconde os detalhes de construção e facilita o uso da classe principal.

Coleções: a classe Labirinto utiliza listas genéricas do tipo ArrayList para representar dinamicamente os elementos interativos do jogo.

Polimorfismo: possibilita chamar aplicarEfeito() sem saber se o objeto é uma Água ou Tesouro, por exemplo.

Tratamento de Exceções: garantir que apenas comandos válidos sejam aceitos e que o jogo continue funcionando mesmo em caso de erro do jogador. Quando o jogador digita um comando de movimentação, o método lerComando() verifica se a entrada está entre os caracteres permitidos (W, A, S, D). Caso contrário, uma exceção personalizada é lançada com uma mensagem explicativa, como: "Comando inválido. Use W, A, S ou D.".
Além disso, o método calcularNovaPosicao() verifica se a nova posição está dentro dos limites do labirinto e se a célula de destino não é uma parede. Se a posição for inválida, uma nova exceção é lançada, impedindo a movimentação e mantendo o aventureiro seguro.
### jogo
O pacote jogo concentra as classes responsáveis por iniciar o jogo, exibir o menu, controlar o tempo e integrar todos os outros pacotes. É nele que está localizada a Main, além de componentes auxiliares como o menu principal, o temporizador e a exibição de status.
#### Menu.java
- **Função principal:** exibir as opções iniciais do jogo e redirecionar o jogador conforme sua escolha.
- **Método principal: exibirMenuPrincipal()**
  - Exibido assim que o programa é iniciado.
  - Apresenta três opções:
    1. Iniciar o jogo
    2. Visualizar o ranking
    3. Encerrar o programa
- **Funcionamento:**
  - Utiliza Scanner para capturar a escolha do jogador.
  - Redireciona para:
    - Main.iniciarJogo() ao iniciar uma partida.
    - Exibição do ranking, com vitórias separadas por dificuldade.
    - Encerramento do jogo, com mensagem de despedida.
#### Temporizador.java
- **Função principal:** medir e exibir o tempo de duração de cada partida.
- **Papel no jogo:** atua como um cronômetro, iniciando no começo da partida e parando no momento da vitória ou derrota.
- **Funcionamento interno:**
  - Utiliza o método System.currentTimeMillis() para capturar:
    - A hora de início (iniciar())
    - A hora de término (parar())
  - O tempo total é calculado como a diferença entre os dois momentos e convertido em segundos.
- **Formatos de exibição:**
  - O método formatarTempo() transforma o tempo total em um formato legível (minutos e segundos).
  - O método getTempoDecorrido() permite acompanhar o tempo em tempo real, sendo exibido junto ao status do jogador a cada rodada.
#### ExibidorStatus.java 
- **Função principal:** exibir no console os dados atualizados do aventureiro durante a partida.
- **Dados exibidos a cada rodada:**
  - Nome do jogador
  - Vida atual
  - Posição no labirinto
  - Tempo decorrido desde o início da partida
- **Método principal:** 
  - mostrarStatus(Aventureiro aventureiro, Temporizador temporizador)
  - Recebe o aventureiro e o temporizador como parâmetros.
  - Exibe os dados de forma formatada, clara e padronizada, com divisões visuais para facilitar a leitura.
#### Main.java
- **Função principal:** atua como o ponto de entrada da aplicação e controla o fluxo geral do jogo.
- **Responsabilidades principais:**
  - Exibe o menu principal por meio da classe Menu.
  - Cria o Labirinto com base na dificuldade escolhida.
  - Instancia e posiciona o Aventureiro no ponto de partida fixo.
  - Inicia o Temporizador para controle do tempo da partida.
- **Loop do jogo:**
  - Exibe o labirinto no console.
  - Mostra os status atualizados do jogador.
  - Processa o comando de movimentação com a ajuda de ControleMovimento.
  - Aplica efeitos de perigos e itens após o movimento.
  - Verifica vitória (tesouro alcançado) ou derrota (vida insuficiente).
- **Pós-partida:**
  - Ao fim da partida (vitória ou derrota), o menu é reexibido automaticamente.
  - O jogador pode:
    - Jogar novamente.
    - Consultar o ranking.
    - Encerrar o programa.
#### Easter Egg (presente na Main.java)
- **Objetivo:** recompensar o jogador por concluir o labirinto com desempenho excepcional.
- **Condição de ativação:**
  - Ocorre quando o jogador encontra o tesouro dentro de um tempo limite definido por dificuldade.
  - Limites:
    - **Fácil:** até 10 segundos
    - **Médio:** até 15 segundos
    - **Difícil:** até 20 segundos
- **Implementação:**
  - A lógica está dentro da classe Main.java, logo após a verificação de vitória.
  - Utiliza o Temporizador para calcular o tempo total da partida.
  - Um switch compara o tempo com o limite da dificuldade escolhida.
- **Resultado:**
  - Se a condição for satisfeita, é exibida a mensagem especial no console:
    "Vitória Perfeita! [Nome] dominou as Areias do Destino!"
##### Aplicações da Programação Orientada a Objetos
Encapsulamento: Cada classe do pacote jogo encapsula uma responsabilidade distinta: Temporizador gerencia o tempo de forma independente. Menu lida exclusivamente com a interação inicial do usuário. ExibidorStatus concentra toda a exibição das informações do jogador. Os atributos são privados e só acessados por meio de métodos públicos, protegendo os dados internos.

Abstração: As interfaces oferecidas pelas classes (iniciar(), parar(), mostrarStatus(), lerComando(), etc.) escondem os detalhes de implementação e expõem apenas o necessário.

Reutilização: Menu e ExibidorStatus também podem ser facilmente reaproveitados em outros projetos de console com pouca ou nenhuma modificação.

Polimorfismo: Objetos do tipo Item ou Perigo são manipulados de forma genérica. Isso permite aplicar efeitos (aplicarEfeito) sem saber o tipo específico do objeto.

##### Bibliotecas utilizadas:
java.util.Scanner: Usada para ler entradas do usuário.

java.util.ArrayList: Armazena elementos de forma sequencial, permite adicionar, remover e acessar elementos por índice, e redimensiona automaticamente conforme os elementos são adicionados/removidos.

java.util.Random: Usada para gerar elementos aleatórios.
