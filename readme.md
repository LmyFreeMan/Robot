**一:项目功能**
- qq机器人自动往群里发信息

|  时间 |发送信息|
|---|---|
|8:00   | 早安心语|
|  9:30 | it新闻|
| 12:00  | 疫情报告|
|  6:00  |疫情报告|
|11:00 |晚安心语|
|每隔一小时|网易云热评|







**二：目录结构**
```
Project
│  .gitignore git忽略文件
│  LICENSE    Mit开源协议
│  pom.xml    pom.xml
│  readme.md  项目说明文件
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      ├─api
    │  │      │      Request.java 调第三方的API,自己懒得写
    │  │      │      
    │  │      ├─jcq
    │  │      │      Robot.java   遵循QQ协议,封装的框架
    │  │      │      Util.java    自己封装的方法
    │  │      │      
    │  │      └─pojo
    │  │          ├─hotcomment            网易云热评的pojo包
    │  │          │      HotComment.java
    │  │          │      NewsList.java
    │  │          │      
    │  │          ├─itnews                IT新闻的包
    │  │          │      ItNews.java
    │  │          │      Newslist.java
    │  │          │      
    │  │          ├─morning               早安心语的包            
    │  │          │      Morning.java
    │  │          │      NewsList.java
    │  │          │      
    │  │          ├─Ncov                  疫情实时的包
    │  │          │      Case.java 
    │  │          │      Desc.java
    │  │          │      Ncov.java
    │  │          │      News.java
    │  │          │      NewsList.java
    │  │          │      
    │  │          └─night                 晚安心语的包      
    │  │                  NewsList.java
    │  │                  Night.java
    │  │                  
    │  └─resources 资源文件
    └─test
        └─java
```
**三：需要掌握的技术**

- 良好的程序调试能力
- 扎实的java技术
- 简单的多线程编程

**四：项目依赖**

- fastjson
- cjq

**以上都不会，也没事，只要热爱，总想办法把它搞定的。**