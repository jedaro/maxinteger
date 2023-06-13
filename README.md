
# Test Rest API
API Rest que recibe 3 párametos 𝑥,𝑦 y 𝑛 y obtiene el mayor número entero 𝑘 donde  0 ≤ 𝑘 ≤ 𝑛 y  𝑘 mod 𝑥 = 𝑦

## Requirements
- Java 11
- Maven 3.6.3
- Spring Boot 3.1
- Visual Studio Code

## Build and Run
Clonar el repositorio desde Visual Studio Code y ejecutar
 
```mvn clean install```
 
## Acceso API Rest
Acceder a la API Rest desde el navegador o curl con la URL

```GET http://localhost:8080/```

## Acceso al servicio /max-integer
```
GET /max-integer?xInteger=5&yInteger=0&nInteger=4
Accept: application/json
Content-Type: application/json

RESPONSE: HTTP 200 (OK)
{
    "maximumInteger": K
}
```

## Error en la consulta /max-integer
Se maneja excepción con estado 404 para errores que se puedan presentar en el cálculo
```
GET /max-integer?xInteger=5&yInteger=0&nInteger=4
Accept: application/json
Content-Type: application/json

RESPONSE: HTTP 404 (NOT FOUND)

```
