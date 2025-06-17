# 🧩 Microservices com RabbitMQ — Comunicação Assíncrona Escalável

Este projeto demonstra como construir uma arquitetura de **microservices** robusta utilizando o **RabbitMQ** como ferramenta de comunicação assíncrona entre serviços distribuídos. É ideal para quem busca resiliência, escalabilidade e organização em sistemas modernos.

## Este repositório explora os seguintes tópicos essenciais:

### 📌 Conceitos Fundamentais
- **Arquitetura de Microservices**: Entenda os princípios por trás de microsserviços e as vantagens frente a arquiteturas monolíticas.
- **Desafios de Arquiteturas Distribuídas**: Veja boas práticas para mitigá-los.

### 📦 Conceitos-Chave do RabbitMQ
- **Queue (Fila)**
- **Exchange (Troca)**
- **Producer (Produtor)**
- **Consumer (Consumidor)**

### 🔁 Tipos de Exchange no RabbitMQ
- `Direct`
- `Fanout`
- `Topic`
- `Headers`

### ☁️ Integração com CloudAMQP
- Criação de ambiente RabbitMQ na nuvem
- Configuração de credenciais e acesso

---

## 🛠️ Conteúdo Prático — Implementação

Este projeto contém uma aplicação prática completa com dois microsserviços que se comunicam via RabbitMQ.

### 1. Configuração do Banco de Dados
- Setup inicial do banco usado pelos serviços (ex: PostgreSQL, MongoDB, etc.)

### 2. Microsserviço de Pedidos (Producer)
- Desenvolvimento do serviço responsável por emitir mensagens na fila
- Integração com o RabbitMQ
- Uso de CloudAMQP como broker de mensagens

### 3. Microsserviço de Processamento (Consumer)
- Serviço que consome e processa as mensagens da fila
- Validação e execução da lógica de negócio

### 4. Testes e Integração
- Subindo os serviços
- Verificação da comunicação entre Producer e Consumer
- Logs de teste e diagnóstico

---

## ✅ Benefícios do RabbitMQ nesta Arquitetura

- Comunicação desacoplada e confiável
- Tolerância a falhas e reentregas
- Escalabilidade horizontal facilitada
- Flexibilidade com múltiplos tipos de exchange e filas


