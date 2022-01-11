package com.example.springjpasample.repository;

import com.example.springjpasample.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepositoryを継承するだけでDBの取得や保存など、便利な機能が使えるようになります。
//@Repository   これは省略できる（JpaRepositoryを継承しているので）
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
