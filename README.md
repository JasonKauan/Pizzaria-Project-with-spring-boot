# 🍕 Inventory Management API

API REST para gerenciamento de estoque de uma pizzaria,
desenvolvida com Java e Spring Boot.

---

## 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)

---

## 📦 Funcionalidades

- Cadastro e controle de ingredientes
- Atualização de estoque
- Consulta de disponibilidade

---

## ⚙️ Como rodar

### Pré-requisitos
- Java 17+
- PostgreSQL

### Clone o repositório
```bash
git clone https://github.com/JasonKauan/inventory-management-api-spring-boot
```

### Configure o banco no `application.properties`
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/inventory
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
```

### Rode a aplicação
```bash
./mvnw spring-boot:run
```

API disponível em `http://localhost:8080`

---

## 📄 Licença

MIT
