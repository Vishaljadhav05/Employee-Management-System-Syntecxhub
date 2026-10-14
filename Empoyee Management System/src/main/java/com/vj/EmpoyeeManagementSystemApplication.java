package com.vj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpoyeeManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpoyeeManagementSystemApplication.class, args);
		
		
		System.out.println("Employee Management System Project is Running ...!!!");
	}

}


//  Output:-


/*

mysql> select * from employees;
+----+-----------------+-------------+-------------------+--------------------------+------------+-----------+------------+------------+
| id | date_of_joining | department  | designation       | email                    | first_name | last_name | phone      | salary     |
+----+-----------------+-------------+-------------------+--------------------------+------------+-----------+------------+------------+
|  1 | 2023-03-10      | HR          | HR Manager        | priya.verma@example.com  | Priya      | Verma     | 9123456780 |  700000.00 |
|  2 | 2024-06-15      | Engineering | Software Engineer | aarav.sharma@example.com | Aarav      | Sharma    | 9876543210 |  850000.00 |
|  3 | 2024-06-15      | Engineering | Java Developer    | vishal@gmail.com         | Vishal     | Jadhav    | 9825685542 | 1150000.00 |
+----+-----------------+-------------+-------------------+--------------------------+------------+-----------+------------+------------+
3 rows in set (0.00 sec)

mysql> select * from employees;
+----+-----------------+-------------+--------------------------+--------------------------+------------+-----------+------------+------------+
| id | date_of_joining | department  | designation              | email                    | first_name | last_name | phone      | salary     |
+----+-----------------+-------------+--------------------------+--------------------------+------------+-----------+------------+------------+
|  2 | 2024-06-15      | Engineering | Senior Software Engineer | aarav.sharma@example.com | Aarav      | Sharma    | 9876543210 | 1100000.00 |
|  3 | 2024-06-15      | Engineering | Java Developer           | vishal@gmail.com         | Vishal     | Jadhav    | 9825685542 | 1150000.00 |
+----+-----------------+-------------+--------------------------+--------------------------+------------+-----------+------------+------------+
2 rows in set (0.00 sec)







  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v4.1.1)[0;39m

[2m2026-10-14T16:35:19.269+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mc.vj.EmpoyeeManagementSystemApplication [0;39m [2m:[0;39m Starting EmpoyeeManagementSystemApplication using Java 21.0.12 with PID 34280 (E:\Eclipse Workspace\Syntecxhub Workspace\Week 3\EmpoyeeManagementSystem\target\classes started by hp in E:\Eclipse Workspace\Syntecxhub Workspace\Week 3\EmpoyeeManagementSystem)
[2m2026-10-14T16:35:19.272+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mc.vj.EmpoyeeManagementSystemApplication [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2026-10-14T16:35:19.810+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[2m2026-10-14T16:35:19.857+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Finished Spring Data repository scanning in 39 ms. Found 1 JPA repository interface.
[2m2026-10-14T16:35:20.253+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat initialized with port 8080 (http)
[2m2026-10-14T16:35:20.268+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2026-10-14T16:35:20.269+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/11.0.24]
[2m2026-10-14T16:35:20.326+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mb.w.c.s.WebApplicationContextInitializer[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 1018 ms
[2m2026-10-14T16:35:20.482+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36morg.hibernate.orm.jpa                   [0;39m [2m:[0;39m HHH008540: Processing PersistenceUnitInfo [name: default]
[2m2026-10-14T16:35:20.544+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36morg.hibernate.orm.core                  [0;39m [2m:[0;39m HHH000001: Hibernate ORM core version 7.4.5.Final
[2m2026-10-14T16:35:20.958+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mo.s.o.j.p.SpringPersistenceUnitInfo     [0;39m [2m:[0;39m No LoadTimeWeaver setup: ignoring JPA class transformer
[2m2026-10-14T16:35:20.992+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Starting...
[2m2026-10-14T16:35:21.331+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mcom.zaxxer.hikari.pool.HikariPool       [0;39m [2m:[0;39m HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@54997f67
[2m2026-10-14T16:35:21.332+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Start completed.
[2m2026-10-14T16:35:21.383+05:30[0;39m [33m WARN[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36morg.hibernate.orm.deprecation           [0;39m [2m:[0;39m HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
[2m2026-10-14T16:35:21.401+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36morg.hibernate.orm.connections.pooling   [0;39m [2m:[0;39m HHH10001005: Database info:
	Database JDBC URL [jdbc:mysql://localhost:3306/syntecxhub]
	Database driver: MySQL Connector/J
	Database dialect: MySQLDialect
	Database version: 8.0.45
	Default catalog/schema: syntecxhub/undefined
	Autocommit mode: undefined/unknown
	Isolation level: REPEATABLE_READ [default REPEATABLE_READ]
	JDBC fetch size: none
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
[2m2026-10-14T16:35:22.266+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36morg.hibernate.orm.core                  [0;39m [2m:[0;39m HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
[2m2026-10-14T16:35:22.323+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Initialized JPA EntityManagerFactory for persistence unit 'default'
[2m2026-10-14T16:35:22.391+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mo.s.d.j.r.query.QueryEnhancerFactories  [0;39m [2m:[0;39m Hibernate is in classpath; If applicable, HQL parser will be used.
[2m2026-10-14T16:35:22.612+05:30[0;39m [33m WARN[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mJpaBaseConfiguration$JpaWebConfiguration[0;39m [2m:[0;39m spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[2m2026-10-14T16:35:22.905+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mo.s.boot.tomcat.TomcatWebServer         [0;39m [2m:[0;39m Tomcat started on port 8080 (http) with context path '/'
[2m2026-10-14T16:35:22.910+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [           main] [0;39m[36mc.vj.EmpoyeeManagementSystemApplication [0;39m [2m:[0;39m Started EmpoyeeManagementSystemApplication in 4.042 seconds (process running for 4.471)
Employee Management System Project is Running ...!!!
[2m2026-10-14T16:35:48.548+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [nio-8080-exec-1] [0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2026-10-14T16:35:48.548+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [nio-8080-exec-1] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2026-10-14T16:35:48.548+05:30[0;39m [32m INFO[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [nio-8080-exec-1] [0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 0 ms
Hibernate: select e1_0.id from employees e1_0 where e1_0.email=? limit ?
Hibernate: insert into employees (date_of_joining,department,designation,email,first_name,last_name,phone,salary) values (?,?,?,?,?,?,?,?)
Hibernate: select e1_0.id from employees e1_0 where e1_0.email=? limit ?
Hibernate: insert into employees (date_of_joining,department,designation,email,first_name,last_name,phone,salary) values (?,?,?,?,?,?,?,?)
Hibernate: select e1_0.id from employees e1_0 where e1_0.email=? limit ?
Hibernate: insert into employees (date_of_joining,department,designation,email,first_name,last_name,phone,salary) values (?,?,?,?,?,?,?,?)
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where upper(e1_0.department)=upper(?)
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: select e1_0.id from employees e1_0 where e1_0.email=? limit ?
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: select e1_0.id from employees e1_0 where e1_0.email=? limit ?
[2m2026-10-14T16:45:50.519+05:30[0;39m [33m WARN[0;39m [35m34280[0;39m [2m--- [EmpoyeeManagementSystem] [nio-8080-exec-9] [0;39m[36m.w.s.m.s.DefaultHandlerExceptionResolver[0;39m [2m:[0;39m Resolved [org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Unexpected character ('}' (code 125)): was expecting double-quote to start property name]
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: update employees set date_of_joining=?,department=?,designation=?,email=?,first_name=?,last_name=?,phone=?,salary=? where id=?
Hibernate: select e1_0.id,e1_0.date_of_joining,e1_0.department,e1_0.designation,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.phone,e1_0.salary from employees e1_0 where e1_0.id=?
Hibernate: delete from employees where id=?




*/