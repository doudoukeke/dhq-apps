## dhq-app 学能通总部管理系统

该项目主要是为学能通公司提供门店管理，设备管理，课程管理，评测管理等功能模块，方便公司的运营与发展。

### 项目结构
```
├── dhq-admin   (后台接口和逻辑)
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com.xnt.dhq
│       │   │               ├── DhqAdminApplication.java （应用入口）
│       │   │               ├── config       （配置类）
│       │   │               ├── controller  （接口）
│       │   │               ├── dao           （数据操作）
│       │   │               ├── service      （业务逻辑）
│       │   │               └── util            （工具类）
│       │   └── resources  （资源/配置文件）
│       │       ├── application.properties
│       │       ├── static
│       │       └── templates
│       └── test
│           └── java
│               └── com.xnt.dhq
│                           └── DhqAdminApplicationTests.java
├── dhq-db   （数据库操作）
│   ├── dhq-db.iml
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com.xnt.dhq
│       │   │               ├── DhqDbApplication.java
│       │   │               ├── mapper （mybatis mapper）
│       │   │               └── model  （对应实体模型类）
│       │   └── resources
│       │       └── application.properties
│       └── test
│           └── java
│               └── com.xnt.dhq
│                           └── DhqDbApplicationTests.java
├── doc
│   └── basic-learning.md
├── pom.xml
└── target
```
### 
