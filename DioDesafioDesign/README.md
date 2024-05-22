# API de Gestão de Tarefas

## Descrição
Uma API para gerenciar tarefas genéricas, categorizadas por trabalho, estudo, lazer, etc.

## Endpoints
- `POST /api/tasks` - Criar uma nova tarefa
- `GET /api/tasks` - Listar todas as tarefas
- `GET /api/tasks/{id}` - Obter detalhes de uma tarefa específica
- `PUT /api/tasks/{id}` - Atualizar uma tarefa
- `DELETE /api/tasks/{id}` - Excluir uma tarefa

## Modelos de Dados

### Task
- `Long id`
- `String title`
- `String description`
- `String category`
- `String status`
- `String dueDate`

### TaskDTO
- `Long id`
- `String title`
- `String description`
- `String category`
- `String status`
- `String dueDate`

## Dependências
- Spring Boot
- Spring Data JPA -- precisei remover pois tive problemas nos primeiros testes
- H2 Database (ou outro banco de dados de sua escolha) -- precisei remover pois tive problemas nos primeiros testes

## Instruções de Configuração
1. Clone o repositório
2. Navegue até o diretório do projeto
3. Execute `mvn spring-boot:run`
4. Acesse a API em `http://localhost:8080/api/tasks`
