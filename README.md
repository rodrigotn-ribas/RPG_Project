A equipe de desenvolvimento de um novo MMORPG entregou a primeira versão do motor do jogo, que vai rodar nos servidores do Rio de Janeiro. O sistema já possui classes jogáveis, cálculos de dano, transições de estado e um sistema de notificação de eventos.
No entanto, o código está uma verdadeira bagunça: construtores gigantes para montar os heróis, regras de combate engessadas, um nível altíssimo de acoplamento na hora de processar a morte dos personagens ou iniciar uma fase, além de conexões pesadas que podem derrubar o servidor.
A sua missão é atuar como Engenheiro(a) de Software, identificar os problemas arquiteturais e aplicar os Padrões de Projeto (GoF e GRASP) corretos para limpar e profissionalizar esta arquitetura.

A Sua Missão: O Desafio dos Padrões
Para consertar essa arquitetura, você deverá pesquisar no material do SAVA, descobrir qual padrão resolve o sintoma e aplicá-lo.
Missão 1: O sistema corre risco de queda por excesso de conexões. Modifique a ConexaoServidorRio para garantir que seja impossível criar mais de uma instância dela em toda a aplicação.
📖 Dica: Procure pelos padrões que cuidam da restrição de instâncias no Tema 2 (Padrões GoF de Criação).
Missão 2: A instanciação do Personagem usando construtores gigantes e obscuros precisa acabar. Implemente uma solução que permita criar o personagem passo a passo de forma fluente (ex: .comNome("Arthas").comMontaria().build()).
📖 Dica: Procure por formas de montar objetos complexos no Tema 2 (Padrões GoF de Criação).
Missão 3: O nosso motor não pode chamar a SistemaGuildaAPI em inglês ou passando dados soltos de servidor. Crie uma classe intermediária que implemente a interface que nós esperamos e faça a tradução para a API antiga nos bastidores.
📖 Dica: Como conectar interfaces incompatíveis? Revise o Tema 3 (Padrões GoF Estruturais).
Missão 4: O arquivo Main.java está orquestrando e chamando múltiplas lógicas de Áudio, Cenário e Monstros manualmente para iniciar uma masmorra. Encapsule essas três ações dentro de um único método simplificado.
📖 Dica: Estude como fornecer uma "frente de loja" simples para um subsistema complexo no Tema 3 (Padrões GoF Estruturais).
Missão 5: O método calcularDanoBase viola a regra de negócio se precisarmos adicionar uma nova classe mágica no futuro. Extraia a matemática de cada personagem para classes próprias e faça o motor aceitá-las de forma genérica.
📖 Dica: Como aplicar diferentes variações de algoritmos? Revise o Tema 4 (Padrões GoF Comportamentais) e associe com a força de remover condicionais usando o princípio que está no Tema 5 (Padrões GRASP).
Missão 6: O método processarMorte acopla o motor a três outras classes (Tela, Log, Conquista). Modifique a estrutura para que o Motor atue como um "Publicador" e apenas emita um aviso de que uma morte ocorreu, deixando os "Assinantes" reagirem.
📖 Dica: Revise como criar mecanismos de assinatura/notificação no Tema 4 (Padrões GoF Comportamentais).
Missão 7: O método atacar() na classe Personagem está preso por ifs que validam o statusAtual. Substitua as strings por objetos que representem cada estado de forma independente e saibam como agir.
📖 Dica: Procure como mudar o comportamento de um objeto quando o que ele "sente" por dentro muda, também no Tema 4 (Padrões GoF Comportamentais).
Boa sorte! Leia os materiais, identifique a ferramenta correta para cada sintoma e bom código!
