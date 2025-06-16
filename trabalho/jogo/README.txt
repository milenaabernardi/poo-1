=====================================================================
    JOGO: CAÇADORES DE DIAMANTES - VERSÃO JAVA (TEXTO)
=====================================================================

Desenvolvido por: Milena Alessandra Bernardi
Disciplina: Programação Orientada a Objetos I (POOI)
Professora: Inali Wisniewski Soares
Data de entrega: 16/06/2025

---------------------------------------------------------------------
🔍 DESCRIÇÃO DO JOGO
---------------------------------------------------------------------

"Caçadores de Diamantes" é um jogo de aventura em interface textual
no qual os jogadores se movimentam por uma mina em busca de diamantes.
Ao longo do caminho, eles enfrentam armadilhas, descobrem pistas e
tentam acumular a maior pontuação possível antes do fim das rodadas.

O jogo foi adaptado da versão original em C++ para Java, aplicando
os principais conceitos de Programação Orientada a Objetos.

---------------------------------------------------------------------
⚙️ COMO EXECUTAR
---------------------------------------------------------------------

1. Compile todos os arquivos `.java`:
   Exemplo usando terminal:
     > javac jogo/**/*.java

2. Execute a classe principal:
     > java jogo.core.Jogo

3. Siga o menu textual para iniciar o jogo.

Requisitos:
- JDK 17 ou superior
- Terminal que suporte ANSI escape codes para cores (opcional)

---------------------------------------------------------------------
💡 CONCEITOS DE POO APLICADOS
---------------------------------------------------------------------

✅ Encapsulamento:
   - Atributos privados com acesso controlado por métodos `get/set`.

✅ Herança:
   - `ElementoMina` como classe abstrata, com subclasses para cada tipo
     de elemento da mina.

✅ Interface:
   - `ElementoAcao` define comportamento polimórfico dos elementos.

✅ Classe Abstrata:
   - `ElementoMina` define a base comum para elementos interativos da mina.

✅ Polimorfismo:
   - Ações diferentes ao chamar `executar()` em instâncias de `ElementoMina`.

✅ Composição:
   - O `Tabuleiro` compõe os elementos da mina e diamantes.

✅ Exceções personalizadas:
   - `MovimentoInvalidoException`
   - `JogadorDesqualificadoException` (em implementação ou uso adicional)

✅ Estrutura de dados:
   - Uso de `ArrayList<Jogador>`, `List<ElementoMina>`, etc.

✅ Arquivos:
   - (Em implementação) Gravação e leitura de pontuação e rankings.

✅ JavaDoc:
   - Todas as classes possuem documentação com as tags:
     `@author`, `@version`, `@param`, `@return`, `@exception`

---------------------------------------------------------------------
✨ FUNCIONALIDADE EXTRA
---------------------------------------------------------------------

▶ TELEPORTE INTELIGENTE:
   - Quando o jogador encontra um teleporte, ele é enviado para uma
     posição aleatória **livre** na mina.

Justificativa:
   - Torna a jogabilidade mais estratégica e menos repetitiva.

Passos de implementação:
   - Criada a classe `ElementoTeleporte` herdando de `ElementoMina`.
   - Implementado método `executar()` que escolhe nova posição.
   - Atualiza coordenadas do jogador e exibe mensagem animada no console.

---------------------------------------------------------------------
📁 ORGANIZAÇÃO DOS PACOTES
---------------------------------------------------------------------

- `jogo.core`    → Fluxo principal do jogo, menu, motor
- `jogo.modelo`  → Modelo de dados (Jogador, Tabuleiro, Elementos)
- `jogo.util`    → Utilitários (cores ANSI, helpers)
- `jogo.modelo.excecoes` → Exceções personalizadas

---------------------------------------------------------------------
📝 OBSERVAÇÕES FINAIS
---------------------------------------------------------------------

Este projeto foi desenvolvido com foco didático, priorizando clareza
na aplicação dos conceitos de POO e na interação textual com o usuário.

Não foi utilizado nenhum recurso gráfico externo (como Swing ou JavaFX),
seguindo as diretrizes da disciplina.

Obrigado por jogar! 💎💥
