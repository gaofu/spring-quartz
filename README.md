# spring-quartz

Spring整合Quartz

将Quartz相关对象的创建和管理，整合到Spring中beans容器中，使得Quartz的使用和操作更加方便。

比如，将Job中需要的公共资源（如数据库连接池）直接配置在SchedulerContext中。

比如，将quartz.properties的内容直接配置在beans.xml，减少配置文件的管理维护，而且使内容更加清晰。

比如，将Quartz持久化Job和Trigger使用的DataSource，交由Spring管理维护。
