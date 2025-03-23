# StreamHub API  
**Desafio DecolaTech - AVANADE**  

Uma API RESTful para gerenciamento de usuários, assinaturas, listas de reprodução e notificações em uma plataforma de streaming.  

## 📌 Funcionalidades  
- Cadastro e gerenciamento de usuários  
- Gerenciamento de assinaturas  
- Criação e manipulação de listas de reprodução  
- Adição e recuperação de vídeos  
- Sistema de notificações  

## 📊 Diagrama de Classes  

```mermaid
classDiagram
    class Usuario {
        - nome: String
        - email: String
        - assinatura: Assinatura
        - listas: List<ListaDeReproducao>
        - notificacoes: List<Notificacao>
    }

    class Assinatura {
        - plano: String
        - preco: Float
        - validade: Date
    }

    class ListaDeReproducao {
        - nome: String
        - videos: List<Video>
    }

    class Video {
        - titulo: String
        - duracao: String
        - categoria: String
    }

    class Notificacao {
        - tipo: String
        - mensagem: String
        - data: Date
    }

    Usuario --> Assinatura
    Usuario --> ListaDeReproducao
    Usuario --> Notificacao
    ListaDeReproducao --> Video
