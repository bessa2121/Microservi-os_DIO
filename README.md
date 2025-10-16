# 🧱 Microsserviços com Spring Boot: Warehouse & Storefront

Este projeto tem como objetivo demonstrar uma arquitetura moderna de microsserviços em Java utilizando **Spring Boot**, com foco em comunicação **síncrona (HTTP)** e **assíncrona (RabbitMQ)** entre dois serviços principais:

- 🏬 **Warehouse** (Armazém)
- 🛍️ **Storefront** (Vitrine)

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **RabbitMQ**
- **Docker & Docker Compose**
- **PostgreSQL**
- **Lombok**
- **OpenAPI / Swagger**
- **Actuator & Micrometer**

---

## 🔗 Comunicação entre Serviços

| Tipo         | Tecnologia | Descrição                                                                 |
|--------------|------------|---------------------------------------------------------------------------|
| Síncrona     | HTTP       | O serviço Storefront consome endpoints REST do Warehouse.                 |
| Assíncrona   | RabbitMQ   | Eventos como atualização de estoque são enviados via mensageria.         |

---

## 📦 Estrutura dos Microsserviços

📁 microsservicos-springboot/ 
├── warehouse/ # Serviço de gerenciamento de estoque 
├── storefront/ # Serviço de vitrine e pedidos 
└── docker-compose.yml


---

## 🛠️ Como Executar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/microsservicos-springboot.git
   cd microsservicos-springboot
   ```
2.Suba os containers com Docker:

```bash
docker-compose up --build
```

Acesse os serviços:

Storefront: http://localhost:8080

Warehouse: http://localhost:8081

RabbitMQ Dashboard: http://localhost:15672 

📚 Documentação da API
Acesse a documentação interativa via Swagger:

Storefront Swagger

Warehouse Swagger

🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

Desenvolvido com por Davi com estudos no curso DIO
