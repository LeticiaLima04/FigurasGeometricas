
---

# 🟦 Exercícios de Figuras Geométricas — Encapsulamento, Herança e Abstração

Este repositório reúne projetos de **figuras geométricas planas e espaciais** organizados para exemplificar os principais conceitos da Programação Orientada a Objetos (POO):
**Abstração**, **Herança** e **Encapsulamento**.

Os exercícios foram desenvolvidos como parte da disciplina de Programação no IFCE Campus Maranguape.

---

## 📌 Objetivos do Repositório

Aqui você encontrará três versões do estudo das figuras geométricas que ilustram:

* 🔒 **Encapsulamento**
  Proteção dos dados internos das classes, utilizando atributos privados e métodos públicos para acesso e alteração (getters e setters).

* 🌳 **Herança**
  Reutilização e extensão de código por meio de classes base que definem propriedades e métodos comuns, e subclasses que especializam o comportamento.

* 🎭 **Abstração**
  Definição de classes abstratas e métodos abstratos que obrigam as subclasses a implementar funcionalidades específicas, promovendo flexibilidade e organização.

---

## 📚 Conteúdo dos Projetos

Cada projeto trata das figuras geométricas com foco em um conceito da POO, e abrange:

* **Figuras Geométricas Planas**
  Triângulo, Quadrado, Retângulo, Círculo, Losango, Trapézio, Paralelogramo, Hexágono e Pentágono.

* **Figuras Geométricas Espaciais**
  Cubo, Prisma, Cilindro, Pirâmide, Esfera, Cone, Paralelepípedo e Tetraedro.

* **Funcionalidades Implementadas**
  Cálculo de áreas, perímetros, volumes e outras propriedades específicas.

---

## 🚀 Como utilizar

### 1️⃣ Instale o Eclipse IDE

Baixe e instale o Eclipse em [eclipse.org/downloads](https://www.eclipse.org/downloads/).

---

### 2️⃣ Importe o projeto desejado

Cada conceito está em uma pasta específica:

* `Encapsulamento`
* `Heranca`
* `Abstracao`

Você pode importar qualquer um dos projetos para seu workspace no Eclipse.

---

### 3️⃣ Crie os pacotes e classes

Dentro do Eclipse, crie os seguintes pacotes:

* `br.edu.figurasgeometricasplanas`
* `br.edu.figurasgeometricasespaciais`
* `br.edu.principal`

Em cada pacote, crie as classes correspondentes conforme a estrutura de cada projeto (veja abaixo).

---

### 4️⃣ Copie o código

Copie e cole o conteúdo de cada arquivo `.java` do repositório para o arquivo correspondente na IDE.

---

### 5️⃣ Execute o projeto

Execute a classe `Principal.java` dentro do pacote `br.edu.principal`:
Clique com o botão direito > `Run As` > `Java Application`.

---

## 📁 Estrutura do Repositório

---

### Abstração

```
📂 Abstracao
┣ 📂 bin
┣ 📂 src
┃ ┗ 📂 br.edu
┃   ┣ 📂 figurasgeometricasespaciais
┃   ┃ ┣ 📜 Cilindro.java
┃   ┃ ┣ 📜 Cone.java
┃   ┃ ┣ 📜 Cubo.java
┃   ┃ ┣ 📜 Esfera.java
┃   ┃ ┣ 📜 FiguraEspacial.java (classe abstrata)
┃   ┃ ┣ 📜 Paralelepipedo.java
┃   ┃ ┣ 📜 Piramide.java
┃   ┃ ┣ 📜 Prisma.java
┃   ┃ ┗ 📜 Tetraedro.java
┃   ┣ 📂 figurasgeometricasplanas
┃   ┃ ┣ 📜 Circulo.java
┃   ┃ ┣ 📜 FiguraPlana.java (classe abstrata)
┃   ┃ ┣ 📜 Hexagono.java
┃   ┃ ┣ 📜 Losango.java
┃   ┃ ┣ 📜 Paralelogramo.java
┃   ┃ ┣ 📜 Pentagono.java
┃   ┃ ┣ 📜 Quadrado.java
┃   ┃ ┣ 📜 Retangulo.java
┃   ┃ ┣ 📜 Trapezio.java
┃   ┃ ┗ 📜 Triangulo.java
┃   ┗ 📂 principal
┃     ┗ 📜 Principal.java
┣ 📜 module-info.java
```

### Encapsulamento

```
📂 Encapsulamento
┣ 📂 bin
┣ 📂 src
┃ ┗ 📂 br.edu
┃   ┣ 📂 figurasgeometricasespaciais
┃   ┃ ┣ 📜 Cilindro.java
┃   ┃ ┣ 📜 Cone.java
┃   ┃ ┣ 📜 Cubo.java
┃   ┃ ┣ 📜 Esfera.java
┃   ┃ ┣ 📜 Paralelepipedo.java
┃   ┃ ┣ 📜 Piramide.java
┃   ┃ ┣ 📜 Prisma.java
┃   ┃ ┗ 📜 Tetraedro.java
┃   ┣ 📂 figurasgeometricasplanas
┃   ┃ ┣ 📜 Circulo.java
┃   ┃ ┣ 📜 Hexagono.java
┃   ┃ ┣ 📜 Losango.java
┃   ┃ ┣ 📜 Paralelogramo.java
┃   ┃ ┣ 📜 Pentagono.java
┃   ┃ ┣ 📜 Quadrado.java
┃   ┃ ┣ 📜 Retangulo.java
┃   ┃ ┣ 📜 Trapezio.java
┃   ┃ ┗ 📜 Triangulo.java
┃   ┗ 📂 principal
┃     ┗ 📜 Principal.java
┣ 📜 module-info.java
```

---

### Herança

```
📂 Heranca
┣ 📂 bin
┣ 📂 src
┃ ┗ 📂 br.edu
┃   ┣ 📂 figurasgeometricasespaciais
┃   ┃ ┣ 📜 Cilindro.java
┃   ┃ ┣ 📜 Cone.java
┃   ┃ ┣ 📜 Cubo.java
┃   ┃ ┣ 📜 Esfera.java
┃   ┃ ┣ 📜 FiguraEspacial.java
┃   ┃ ┣ 📜 Paralelepipedo.java
┃   ┃ ┣ 📜 Piramide.java
┃   ┃ ┣ 📜 Prisma.java
┃   ┃ ┗ 📜 Tetraedro.java
┃   ┣ 📂 figurasgeometricasplanas
┃   ┃ ┣ 📜 Circulo.java
┃   ┃ ┣ 📜 FiguraPlana.java
┃   ┃ ┣ 📜 Hexagono.java
┃   ┃ ┣ 📜 Losango.java
┃   ┃ ┣ 📜 Paralelogramo.java
┃   ┃ ┣ 📜 Pentagono.java
┃   ┃ ┣ 📜 Quadrado.java
┃   ┃ ┣ 📜 Retangulo.java
┃   ┃ ┣ 📜 Trapezio.java
┃   ┃ ┗ 📜 Triangulo.java
┃   ┗ 📂 principal
┃     ┗ 📜 Principal.java
┣ 📜 module-info.java
```


---

## 🖼️ Diagramas UML dos Projetos

### 📂 Abstração

![image](https://github.com/user-attachments/assets/e9d8e2d4-4d02-4c8b-b9d9-110c3846f2c2)

*Diagrama UML destacando as classes abstratas com métodos abstratos, e as subclasses que implementam esses métodos, representando a abstração.*

---

### 📂 Encapsulamento

![image](https://github.com/user-attachments/assets/7fa0c06d-70cb-41df-8703-aab2b5bd7b5b)

*Diagrama UML demonstrando a estrutura das classes e o uso do encapsulamento via atributos privados e métodos públicos.*

---

### 📂 Herança

![image](https://github.com/user-attachments/assets/3a5bd3c1-74c0-4440-9d53-652d3d7182ca)![image](https://github.com/user-attachments/assets/8c291f56-4794-4a23-b0b0-3ef0540480b0)


*Diagrama UML evidenciando a hierarquia entre classes base abstratas e suas subclasses concretas, representando o conceito de herança.*

---

## 📬 Contato

Se tiver dúvidas, sugestões, ou quiser contribuir:
📩 Abra uma issue ou envie mensagem!
