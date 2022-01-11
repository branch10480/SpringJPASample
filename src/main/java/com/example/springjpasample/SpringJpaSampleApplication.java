package com.example.springjpasample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// @Configuration @EnableAutoConfiguration @ComponentScan の3つのアノテーションをつけるのと同義
@SpringBootApplication
// @Configuration ... 設定クラスであることを示します
// @EnableAutoConfiguration ... 自動構成機能を有効にします。必要となる設定を推測して構成しようとします。
// @ComponentScan ... コンポーネントスキャンを有効にします。これは対象クラスをスキャンし、利用可能にする機能です。 対象は @Component @Controller @Service @Repository などです。
public class SpringJpaSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringJpaSampleApplication.class, args);
  }

}
