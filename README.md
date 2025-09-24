## 🍓 Sol e Fruta - Sistema de Pedidos (Java)

Este é um projeto básico em Java desenvolvido como atividade da disciplina **Linguagem de Programação II**. O objetivo é criar um sistema de gerenciamento de pedidos para o restaurante fictício **Sol e Fruta**, especializado em saladas de frutas, fondue e sobremesas naturais.

---

### 📚 Funcionalidades

O sistema é executado via **console** e permite:

1. **Registrar Pedido**  
   - Solicita o nome do cliente  
   - Adiciona um ou mais itens (nome e preço)  
   - Gera número de pedido automaticamente  
   - Exibe uma nota fiscal com resumo do pedido

2. **Remover Pedido**  
   - Remove um pedido pelo número

3. **Listar Pedidos**  
   - Mostra todos os pedidos registrados com detalhes

4. **Sair**  
   - Encerra o programa

---

### 🛠️ Tecnologias Utilizadas

- **Java** (Orientação a Objetos)
- **ArrayList** para armazenar pedidos
- **Scanner** para entrada de dados via console
- **Switch-case** e **while** para controle de fluxo

---

### 📁 Estrutura do Projeto

```
SolEFruta/
├── Item.java         // Classe que representa um item do pedido
├── Pedido.java       // Classe que representa o pedido
└── SolEFruta.java    // Classe principal com o menu e lógica do sistema
```

---

### ▶️ Como Executar

1. Clone o repositório ou baixe os arquivos `.java`
2. Compile os arquivos com um compilador Java ou IDE (como IntelliJ ou VS Code)
3. Execute a classe `SolEFruta.java`
4. Interaja com o menu pelo console

---

### 📷 Exemplo de Saída

```text
========================================
 Restaurante Sol e Fruta 
========================================
Pedido N°: 1
Cliente: Ana
----------------------------------------
Itens:
- Salada Tropical R$ 12.5
- Fondue de Morango R$ 18.0
----------------------------------------
Total: R$ 30.5
========================================
 Obrigado pela preferência! :) 
========================================
```

---

### 👨‍💻 Autor

**Filipe Lucena**  
Aluno da disciplina Linguagem de Programação II  
Universidade Federal do Rio Grande do Norte (UFRN)
