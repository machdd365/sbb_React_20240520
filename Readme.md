```mermaid
sequenceDiagram
    SBB->>JPA: Java 객체(DAO)
    JPA->>JDBC: JDBC API
    JDBC->>H2: SQL
    H2-->>JDBC: DB
    JDBC-->>JPA: API return
    JPA-->>SBB: 객체 return

```
SBB _SpringBoot Board_
-----------------------------
-----------------------------
### 스프링부트 게시판 입니다.

스프링부트 게시판 입니다.

