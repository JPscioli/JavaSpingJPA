![icons8-postgreesql](https://user-images.githubusercontent.com/45456833/156367134-9d6b3005-ca16-4da7-bc22-43083c79245e.svg)
![spring (1)](https://user-images.githubusercontent.com/45456833/156366775-97332df2-eebb-4a2b-abb6-2ecc1a426056.svg)

# JavaSpingJPA
 Usando o Spring Data JPA para conectar em um Banco de Dados.
 No exemplo abaixo irei mostrar a configuração básica para conectar em seu Banco de Dados PostgreSQL, assim usando a ferramenta Spring e suas dependências (SpringDataJPA,PostgreSQL,SpringWeb).
 
## Criando o arquivo no spring initializr.
 
 ![image](https://user-images.githubusercontent.com/45456833/156364953-642a755f-1755-4a8f-9d12-b83278328fbe.png)
 Para o projeto funcionar é preciso Adicionar as dependências (SpringDataJPA,PostgreSQL,SpringWeb) e depois gerar o arquivo.
### Conhecendo as Dependências.
#### Spring Data JPA
 O Spring Data JPA é um framework que nasceu para facilitar a criação dos nossos repositórios.
Ele faz isso nos liberando de ter que implementar as interfaces referentes aos nossos repositórios (ou DAOs), e também já deixando pré-implementado algumas funcionalidades como, por exemplo, de ordenação das consultas e de paginação de registros. (Blog: https://blog.algaworks.com/spring-data-jpa/#:~:text=Ele%20(o%20Spring%20Data%20JPA,Spring%20Data%20Commons)
 #### PostgreSQL
  É um driver JDBC e R2DBC que permite que programas Java se conectem a um banco de dados PostgreSQL usando código Java padrão independente de banco de dados.
 #### SpringWeb
  Cria aplicativos web, incluindo RESTful, usando Spring MVC. Usa o Apache Tomcat como o contêiner incorporado padrão.
 ### Configurando as propriedades de conexão.
 ![image](https://user-images.githubusercontent.com/45456833/156369220-599a3fd6-32ca-4a59-a9e7-7e183adafbca.png)
 Configurar nas propriedades é uma ótima opção para passar configurações para uma determinada aplicação que necessitada de configurações externas. 
