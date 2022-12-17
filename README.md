# Teste para contratação de desenvolvedor(a) Java + Spring Boot

Realize um `fork` e suba o código desenvolvido dentro deste repositório.

### Aplicação
- Desenvolver uma aplicação utilizando Java e Spring;
- Utilizar Spring Boot;
- Autenticação;
- Criar a operação baseado em uma entidade simples com relacionamento, exemplo:
  - Pessoa com automóveis;
  - Pedido com produtos;
  - Tarefa com sub-itens;
- Realizar operações CRUD;
  - Create, Read, Update, Delete;
- Banco de dados MySQL;
- Aplicação do front-end utilizando as próprias plataformas do Java/Spring, exemplo:
  - MVC

### Exemplo de relacionamento:

![Diagrama](https://user-images.githubusercontent.com/9052611/204873954-05bca811-68c0-4059-9457-40565552b1b3.png)

### O que será avaliado:
  - Padrão utilizado de desenvolvimento;
  - Boas práticas aplicadas;
  - Aplicação de conceitos de clean code, design patterns, SOLID;
  - Separação de camadas de apresentação, serviços, negócios e repositório;

Os itens propostos são sugestões de implementações e padrões que serão utilizados nos desenvolvimentos dos projetos no cliente.

Disponibilizar o código desenvolvido via GitHub (realize um `fork` deste repositório) para avaliação, incluir no mesmo repositório o back-end, front-end e banco de dados separado por pastas. 

Para comunicação, caso não tenha recebido algum contato, notifique rh@targetsoftware.com.br sobre a finalização do teste com o link do repositório.

----------------------------

# Solução: aplicação "RequisicaoDemo"
### sistema Web para requisição de produtos

Descrição: API Rest desenvolvida com Java 17 e Spring Boot 3.0.0. Configurada nas propriedades para gerar o Banco de dados automaticamente no MySQL 8.

- Configuração do Banco de dados em /src/main/resources/application.properties
- Em application.properties, basta alterar o valor das linhas abaixo para que nelas conste o usuário e senha do banco instalado:

  - spring.datasource.username=[usuário]
  - spring.datasource.password=[senha]

Ao executar o projeto como Spring Boot App, as tabelas de banco de dados serão criadas automaticamente e a aplicação estará pronta para uso.

Exemplo de objeto de entrada na API Rest:

{
    "cliente": {
        "nome": "Pessoa 1244746321000",
        "email": "pessoa1244746321@mail.com",
        "telefone": "(11) 74481-9839"
    },
    "produtos": [
        {
            "nome": "Computador Plus",
            "descricao": "Desktop Deluxe",
            "preco": 5.0
        },
        {
            "nome": "Smartphone Plus",
            "descricao": "Motorola G200",
            "preco": 4.0
        },
        {
            "nome": "Bicicleta Plus",
            "descricao": "Mountain Bike Super",
            "preco": 6.0
        }
    ],
    "localEntrega": {
        "logradouro": "Rua Jornalista Jeovan Pacheco",
        "numero": "15",
        "bairro": "Aeroporto",
        "cidade": "Mossoró",
        "estado": "RN",
        "complemento": "Casa"
    }
}

Endpoints utilizados para as operações CRUD:

![image](https://user-images.githubusercontent.com/23488612/208210411-d13a4f4c-1ac8-40f0-98ef-f213c38928fd.png)
