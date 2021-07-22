package com.springboot.toyproject.todolist.config;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfig {

    private final String POOL_SIZE = "1";
    private final String ALGORITHM = "PBEWithMD5AndDES";
    private final String PROVIDER_NAME = "haeny";
    private final String STRING_OUTPUT_TYPE = "base64";
    private final String KEY_OBTENTION_ITERATIONS = "1000";
    private final String SALT_GENERATOR_CLASS_NAME = "org.jasypt.salt.RandomSaltGenerator";

    @Value("${jasypt.encryptor.password}")
    private String PASSWORD;

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor(){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(PASSWORD);
        config.setPoolSize(POOL_SIZE);
        config.setAlgorithm(ALGORITHM);
        config.setProvider(new BouncyCastleProvider());
        config.setProviderName(PROVIDER_NAME);
        config.setStringOutputType(STRING_OUTPUT_TYPE);
        config.setKeyObtentionIterations(KEY_OBTENTION_ITERATIONS);
        config.setSaltGeneratorClassName(SALT_GENERATOR_CLASS_NAME);
        encryptor.setConfig(config);
        return encryptor;
    }
}
