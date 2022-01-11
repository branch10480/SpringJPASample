package com.example.springjpasample.config;

import com.example.springjpasample.model.Comment;
import com.example.springjpasample.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// コンストラクタを自動生成します。
// 対象は private なプロパティです。
// コンストラクタインジェクションを省略できる。
@RequiredArgsConstructor
// このクラスがコンポーネントだということを示します。
// コンポーネントには「構成要素」や「部品」といった意味があります。
@Component
// ApplicationRunner を実装すると、Spring Boot起動時の処理を定義できます。
// 定義は run メソッド内に記述します。
public class DataLoader implements ApplicationRunner {
  private final CommentRepository repository;

  // このコンストラクタ記述を省略できる
//  public DataLoader(CommentRepository repository) {
//    this.repository = repository;
//  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    var comment = new Comment();
    comment.setContent("こんにちは");
    repository.save(comment);

    var testComment = new Comment();
    testComment.setContent("テストコメント");
    repository.save(testComment);
  }
}
