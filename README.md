# citywhisper

# API REST – Consulta CEP + Curiosidade da Cidade via OpenAI

Projeto Java que implementa uma API RESTful capaz de:

✅ Receber um CEP via requisição HTTP  
✅ Consultar dados de endereço (rua, bairro, cidade, estado) através da API ViaCEP  
✅ Extrair o nome da cidade retornada pelo CEP  
✅ Consultar a OpenAI API para obter uma curiosidade sobre a cidade  
✅ Retornar ao cliente todas as informações em formato JSON

---

## 🚀 Tecnologias

- **Linguagem Backend:** Java 17+
- **Framework:** Spring Boot
- **APIs utilizadas:**
  - [ViaCEP](https://viacep.com.br)
  - OpenAI API (Chat Completion ou outro endpoint)
- **Formato de resposta:** JSON

---

## 🔗 Fluxo da API

1. Usuário envia requisição com o CEP → `/api/cep/{cep}`
2. API consulta dados do CEP na ViaCEP
3. Extrai o nome da cidade
4. Monta o prompt:  
   > Me diga uma curiosidade sobre a cidade [nome da cidade].
5. Envia o prompt à OpenAI API
6. Retorna ao usuário:
   - Dados do endereço
   - Curiosidade sobre a cidade

---

## 📥 Exemplo de Requisição

```http
GET /api/cep/30140-110
