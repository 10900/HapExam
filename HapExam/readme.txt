���� mvn clean install
���� mvn eclipse:eclipse 
�����̵���eclipse����������
��servers �µ�context.xml�ļ��м����������ݣ�
<Resource auth="Container" driverClassName="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/hap_dev" name="jdbc/hap_dev" type="javax.sql.DataSource" username="hap_dev" password="hap_dev"/>

����Ŀ������tomcat�ϣ����������������ַ��
http://localhost:8080/HapExam