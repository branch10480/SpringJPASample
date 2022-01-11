package com.example.springjpasample.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
// データの入れ物であるクラスであることを定義します
@Entity
public class Book {
  // Entityの主キーを表します
  @Id
  // 主キーの自動採番を行います。＠Idアノテーションとともに用います。
  @GeneratedValue
  private Long id;

  private String title;
  private String detail;
}
