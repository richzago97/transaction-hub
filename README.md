## Sobre o Projeto

Bem-vindo ao LearningSpring, meu primeiro projeto em Java, desenvolvido com entusiasmo e dedicação para aprimorar minhas habilidades em Spring Boot. Este projeto implementa um sistema básico de gerenciamento de usuários e transações, utilizando PostgreSQL como banco de dados.

### Tabelas do Banco de Dados

**1. Tabela `users`**

| Campo     | Tipo    | Restrições         |
|-----------|---------|--------------------|
| id        | Integer | Primary Key        |
| name      | VARCHAR | Not Null           |
| cpf       | VARCHAR | Not Null, Unique    |
| email     | VARCHAR | Not Null, Unique    |
| password  | TEXT    | Not Null           |
| type      | VARCHAR | Not Null           |
| balance   | FLOAT   | Default: 0.0       |

**2. Tabela `transactions`**

| Campo     | Tipo    | Restrições         |
|-----------|---------|--------------------|
| id        | Integer | Primary Key        |
| payer_id  | Integer | Not Null           |
| payee_id  | Integer | Not Null           |
| value     | FLOAT   | Not Null           |
| date      | DATE    | Not Null           |

### Regras de Negócio

- Usuários do tipo 'SELLER' não podem realizar transações.

## Instalação

### Pré-requisitos

- Java 11 ou superior
- Maven
- PostgreSQL
- [Render](https://render.com/) account (opcional)
- Docker (opcional)

### Passos de Instalação

1. **Clone o Repositório:**

   ```bash
   git clone https://github.com/seu-usuario/learning-spring.git
   ```

2. **Configure o Banco de Dados:**

   - Certifique-se de ter um banco de dados PostgreSQL em execução.
   - Edite as configurações do banco de dados no arquivo `src/main/resources/application.properties`.
    - **Configuração Docker (Opcional):** Preencha o arquivo `.env` com suas credenciais.

       ```
       POSTGRES_DB=seu-banco-de-dados
       POSTGRES_USER=nome-database
       POSTGRES_PASSWORD=password
       ```

   - Se estiver usando Docker, suba o contêiner do PostgreSQL:

     ```bash
     docker compose up

3. **Compile e Execute o Projeto:**

   ```bash
   cd learning-spring
   mvn spring-boot:run
   ```

   O aplicativo estará acessível em [http://localhost:8080](http://localhost:8080).

## Rotas

### Usuários

- **Criar Usuário**
  - **Método:** `POST`
  - **Endpoint:** `/users`
  - **Corpo da Requisição (Exemplo):**
    ```json
    {
      "name": "Nome do Usuário",
      "cpf": "12345678901",
      "email": "usuario@email.com",
      "password": "senha",
      "type": "BUYER"
    }
    ```
  - **Resposta de Sucesso:** `201 Created`

- **Listar Usuários**
  - **Método:** `GET`
  - **Endpoint:** `/users`
  - **Resposta de Sucesso:** `200 OK` com uma lista de usuários.

- **Recuperar Usuário por ID**
  - **Método:** `GET`
  - **Endpoint:** `/users/{id}`
  - **Resposta de Sucesso:** `200 OK` com os detalhes do usuário.

- **Atualizar Usuário por ID**
  - **Método:** `PUT`
  - **Endpoint:** `/users/{id}`
  - **Corpo da Requisição (Exemplo):**
    ```json
    {
      "name": "Novo Nome"
    }
    ```
  - **Resposta de Sucesso:** `200 OK` com os detalhes do usuário atualizado.

- **Deletar Usuário por ID**
  - **Método:** `DELETE`
  - **Endpoint:** `/users/{id}`
  - **Resposta de Sucesso:** `204 No Content`

- **Depósito em Conta**
  - **Método:** `POST`
  - **Endpoint:** `/users/{id}/deposit`
  - **Corpo da Requisição (Exemplo):**
    ```json
    {
      "value": 100.0
    }
    ```
  - **Resposta de Sucesso:** `201 Created` com os detalhes do usuário atualizado.

### Transações

- **Criar Transação**
  - **Método:** `POST`
  - **Endpoint:** `/transactions`
  - **Corpo da Requisição (Exemplo):**
    ```json
    {
      "payer_id": 1,
      "payee_id": 2,
      "value": 50.0
    }
    ```
  - **Resposta de Sucesso:** `201 Created` com os detalhes da transação criada.

- **Recuperar Transação por ID**
  - **Método:** `GET`
  - **Endpoint:** `/transactions/{id}`
  - **Resposta de Sucesso:** `200 OK` com os detalhes da transação.

## Observações

- Certifique-se de adequar as configurações do banco de dados conforme necessário.
- O projeto foi desenvolvido para fins de aprendizado e prática com Spring Boot, podendo ser personalizado e expandido conforme necessário.
