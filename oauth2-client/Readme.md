# Spring Boot 4 OAuth2 Client (Reference)

This project demonstrates the **official and recommended way** to implement an OAuth2 Client using **Spring Boot 4** and **Spring Security 6.4+**.

It showcases how to securely call protected resource servers **without any manual token handling**, leveraging Spring’s built-in OAuth2 client support.

---

## 🚀 High-Level Overview

- Built with **Spring Boot 4** and **Spring Security 6.4+**
- Uses the **OAuth2 Client** module
- No custom token parsing, storage, or refresh logic
- Tokens are **automatically attached** to outgoing requests
- Expired tokens are **auto-refreshed by Spring**
- Follows modern, production-ready Spring Security best practices

This project serves as a clean reference implementation for OAuth2 client applications.

---

## ✅ Key Notes

> **This is the OFFICIAL Spring Boot 4 / Spring Security 6.4+ way!**  
> **Zero manual token handling.**

- Tokens are **auto refreshed with Spring Boot 4**
- `/call-api` fetches protected data automatically with token
- Spring manages:
    - Access tokens
    - Refresh tokens
    - Token renewal
    - Token propagation to HTTP clients

---

## 🔐 How It Works

1. User authenticates via OAuth2 login
2. Spring Security stores the authorized client
3. When `/call-api` is called:
    - Spring automatically resolves the OAuth2 client
    - Attaches a valid access token
    - Refreshes the token if it is expired
4. The protected resource is fetched transparently

No token code. No interceptors. No filters. ✅

---

## 📡 Test the Endpoint

Once the application is running, call:

```bash
curl http://localhost:8081/call-api
