# Calculadora Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)

## Descrição
Este é um projeto de uma calculadora simples desenvolvida em **Java** utilizando **Spring Boot**. A aplicação permite realizar as seguintes operações matemáticas:
- Adição
- Subtração
- Multiplicação
- Divisão (com tratamento para divisão por zero)

Os valores de entrada são do tipo **double** e os resultados são arredondados para duas casas decimais.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **JUnit 5** (para testes unitários)

## Como Executar
### Requisitos
- **JDK 17+**
- **Maven**

### Passos para Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/calculadora-java.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd calculadora-java
   ```
3. Compile e execute o projeto com o Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Siga as instruções no terminal para inserir os números e escolher a operação desejada.

## Estrutura do Projeto
```
calculadora-java/
├── src/
│   ├── main/
│   │   ├── java/br/com/calculadora_java/
│   │   │   ├── CalculadoraJavaApplication.java  # Classe principal da aplicacao
│   ├── test/
│   │   ├── java/br/com/calculadora_java/
│   │   │   ├── CalculadoraJavaApplicationTests.java  # Testes unitarios
├── pom.xml  # Configuracao do Maven
```

## Testes
O projeto possui testes unitários escritos com **JUnit 5** para validar todas as operações.
Para executar os testes, utilize:
```bash
mvn test
```
Se todos os testes passarem, a saída será similar a:
```
[INFO] Results:
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
```

## Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para utilizar e modificar.
