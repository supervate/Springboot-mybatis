package com.vt.learn.mybatis.config;

        import org.apache.ibatis.annotations.Mapper;
        import org.mybatis.spring.mapper.MapperScannerConfigurer;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.jdbc.datasource.DataSourceTransactionManager;

        import javax.sql.DataSource;

@Configuration
public class mybatisConfig {

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //定制只有标注了Mapper注解的接口才被扫描，否则所有接口都会被mybatis强行无差别生成mybatis的代理实现类
        mapperScannerConfigurer.setAnnotationClass(org.apache.ibatis.annotations.Mapper.class);
        mapperScannerConfigurer.setBasePackage("com.vt.learn");
        return mapperScannerConfigurer;
    }

    @Bean
    public DataSourceTransactionManager getTransactionManager(@Autowired DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
