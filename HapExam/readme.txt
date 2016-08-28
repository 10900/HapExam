运行 mvn clean install
运行 mvn eclipse:eclipse 
将工程导入eclipse开发环境中
在servers 下的context.xml文件中加入如下内容：
<Resource auth="Container" driverClassName="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hap_dev" name="jdbc/hap_dev" type="javax.sql.DataSource" username="hap_dev" password="hap_dev"/>

将项目发布到tomcat上，打开浏览器，输入网址：
http://localhost:8080/HapExam