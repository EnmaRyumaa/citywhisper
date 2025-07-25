# CityWhisper

A small Spring Boot service that fetches Brazilian postal code (CEP) details and asks OpenAI for an interesting fact about the related city. The service exposes a single REST endpoint and returns the consolidated information in JSON format.

---

## Features

- Fetch address details from [BrasilAPI](https://brasilapi.com.br) using the informed CEP
- Query OpenAI's Chat Completions API for a curiosity about the city
- Respond with the address data plus the generated curiosity

---

## Technologies

- **Java:** 21
- **Framework:** Spring Boot (WebFlux)
- **External APIs:**
  - BrasilAPI
  - OpenAI API

Environment variables are loaded from a `.env` file using `dotenv-java`.

Required keys:

```
OPEN_API_KEY=<your OpenAI key>
PROMPT_AGENT=<system prompt message>
TEMPERATURE=<model temperature>
MODEL=<OpenAI model>
```

---

## Running locally

1. Create a `.env` file with the variables above.
2. Execute the application with Maven:

```bash
./mvnw spring-boot:run
```

The service will start on port `8080` by default.

---

## API usage

Request CEP information and a curiosity with:

```http
GET /cep/{cep}
```

Example:

```http
GET /cep/30140110
```

Sample response:

```json
{
  "cep": "30140110",
  "state": "MG",
  "city": "Belo Horizonte",
  "neighborhood": "Centro",
  "street": "Avenida Amazonas",
  "responseGPT": "Belo Horizonte foi a primeira cidade planejada do Brasil."
}
```

---

With this endpoint the application obtains address data from BrasilAPI and augments it with a city curiosity provided by OpenAI.
