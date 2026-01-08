# Spring Boot 4 OAuth2 Resource Server (Reference)

This project demonstrates the **official and recommended way** to implement an OAuth2 **Resource Server** using **Spring Boot 4** and **Spring Security 6.4+**.

It protects REST APIs by validating OAuth2 access tokens (JWT) issued by an Authorization Server — with **zero manual token handling**.

---

## 🚀 High-Level Overview

- Built with **Spring Boot 4**
- Uses **Spring Security 6.4+**
- Acts as an **OAuth2 Resource Server**
- Validates **JWT access tokens**
- Enforces scopes and authorities
- No custom filters, interceptors, or token parsing code

Spring Security automatically handles:
- Token decoding
- Signature verification
- Expiration checks
- Issuer validation
- Scope enforcement

---

## ✅ Key Notes

> **This is the OFFICIAL Spring Boot 4 / Spring Security 6.4+ way!**  
> **Zero manual token handling.**

- No custom JWT logic
- No token validation code
- Fully managed by Spring Security
- Clean, secure, and production-ready setup

---

## 🔐 Architecture Flow

1. Authorization Server issues an access token
2. Client sends the token in the `Authorization` header
3. Resource Server:
    - Validates the JWT
    - Verifies signature and expiration
    - Enforces required scopes
4. Protected API is accessed if the token is valid

---

## 🔑 Generate Access Token (Client Credentials Grant)

Copy & paste to generate an access token:

```bash
curl -u client:secret \
  -H "Content-Type: application/x-www-form-urlencoded" \
  -d "grant_type=client_credentials&scope=read" \
  http://localhost:8080/oauth2/token
```  

## 📡 Call a Protected API Using the Token
Pass the access token as a Bearer token (copy & paste):

curl -H "Authorization: Bearer <Token>" \
  http://localhost:8080/api/protected