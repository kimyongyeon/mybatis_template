# mybatis & jdbc & springboot 2.3
### mybatis 설정 
```
# mybatis 매핑 type을 짧게 쓰기 위한 설정
mybatis.type-aliases-package=com.yyk.mybatistemplate.model

# mapper 이하를 로깅 위치로 설정.
logging.level.com.yyk.mybatistemplate.mapper=TRACE

mybatis.configuration.default-scripting-language=com.yyk.mybatistemplate.config.EnhanceMybatisLanguageDriver
```
### sql query
```
DROP TABLE IF EXISTS CITY;

CREATE TABLE CITY (ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR, COUNTRY VARCHAR, POPULATION INT);

INSERT INTO CITY (NAME, COUNTRY, POPULATION) VALUES ('San Francisco', 'US', 10000);
INSERT INTO CITY (NAME, COUNTRY, POPULATION) VALUES ('서울', 'KR', 20000);
INSERT INTO CITY (NAME, COUNTRY, POPULATION) VALUES ('東京', 'JP', 30000);
INSERT INTO CITY (NAME, COUNTRY, POPULATION) VALUES ('부산', 'KR', 40000);
```
### h2 config
```
spring.datasource.url=jdbc:h2:mem:test
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
```
### xml 쿼리 예제
```
<?xml version="1.0" encoding="UTF-8"?>

<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="com.yyk.mybatistemplate.mapper.CityMapper">

    <select id="selectCityById" resultType="city">
        SELECT ID
              ,NAME
              ,COUNTRY
              ,POPULATION
          FROM CITY
         WHERE ID = #{id}
    </select>

    <select id="selectAllCity" resultType="city">
        SELECT ID
              ,NAME
              ,COUNTRY
              ,POPULATION
          FROM CITY
    </select>

    <insert id="insertCity">
      INSERT INTO CITY (NAME, COUNTRY, POPULATION)
      VALUES (#{name}, #{country}, #{population})
    </insert>

</mapper>
```