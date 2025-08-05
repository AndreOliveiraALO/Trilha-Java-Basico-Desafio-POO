# 📱 Projeto iPhone – Desafio POO da DIO - Santander Java BackEnd

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/AndreOliveiraALO/dslist/blob/main/LICENSE)

Este projeto foi desenvolvido como parte do desafio **"POO - Modelagem e Diagramação de um Componente iPhone"** da **Digital Innovation One (DIO)**.

---

## 🎯 Desafio Proposto

Modelar e implementar o diagrama de classes do **componente iPhone**, com base no vídeo oficial de lançamento de 2007, contemplando suas principais funcionalidades.

- 📻 Reprodutor Musical
- ☎️ Aparelho Telefônico
- 🌐 Navegador de Internet
---

## 🧠 O que foi implementado

Implementei todo o modelo orientado a objetos em Java, seguindo os princípios da **POO (Programação Orientada a Objetos)** como:

- **Herança**
- **Interfaces**
- **Encapsulamento**
- **Polimorfismo**

---

## 🧩 Estrutura e Função das Classes

### 🧷 `Midia` (interface base) 
Interface genérica para dispositivos que reproduzem mídia (áudio ou vídeo). Define os comportamentos básicos:
- `reproduzir(String nome)`: inicia a execução da mídia
- `pausar()`: pausa a execução
- `selecionar(String nome)`: seleciona a mídia a ser reproduzida

---

### 🎵 `ReprodutorMusical` (interface) 
Herda da interface `Midia`, voltada para música. Define comportamento específico:
- `criarPlaylist(String nome)`: Metodo extra, permite criar playlists personalizadas

---

### 🎥 `ReprodutorVideo` (interface)
Classe extra, criado com bonus, Também herda de `Midia`, mas voltado para vídeo. Possui:
- `selecionarLegenda(String idioma)`: Metodo extra, seleciona uma legenda durante a reprodução

---

### 📞 `AparelhoTelefonico` (interface)
Responsável pelas funções básicas de telefonia:
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

---

### 🌐 `NavegadorInternet` (interface)
Simula um navegador web dentro do iPhone:
- `exibirPagina(String url)`
- `adicionarNovaAba(String url)`
- `atualizarPagina()`

---

### 📱 `IPhone` (classe principal)
Implementa todas as interfaces citadas acima. É a classe que **simula o funcionamento completo do iPhone**, concentrando funcionalidades de:
- reprodução de áudio
- reprodução de vídeo
- chamadas telefônicas
- navegação na internet

> Aqui são centralizadas as implementações dos métodos definidos nas interfaces. Todos os métodos imprimem no console uma simulação do comportamento.

---

## 🚀 Funcionalidades implementadas

### 📻 Reprodutor Musical
- `reproduzir(String nome)`
- `pausar()`
- `selecionar(String nome)`
- `criarPlaylist(String nome)`

### 🎥 Reprodutor de Vídeo
- `reproduzir(String nome)`
- `pausar()`
- `selecionar(String nome)`
- `selecionarLegenda(String idioma)`

### ☎️ Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba(String url)`
- `atualizarPagina()`

---

## 🧩 Estrutura UML (resumida - Mermaid)

```mermaid
classDiagram
    class Midia {
        <<interface>>
        +reproduzir(nome: String)
        +pausar()
        +selecionar(nome: String)
    }

    class ReprodutorMusical {
        <<interface>>
        +criarPlaylist(nome: String)
    }

    class ReprodutorVideo {
        <<interface>>
        +selecionarLegenda(idioma: String)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(url: String)
        +adicionarNovaAba(url: String)
        +atualizarPagina()
    }

    class IPhone {
        +implementa todas as interfaces acima
    }

    Midia <|-- ReprodutorMusical
    Midia <|-- ReprodutorVideo

    ReprodutorMusical <|.. IPhone
    ReprodutorVideo <|.. IPhone
    AparelhoTelefonico <|.. IPhone
    NavegadorInternet <|.. IPhone
