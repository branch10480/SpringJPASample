package com.example.springjpasample.controller;

import com.example.springjpasample.model.Comment;
import com.example.springjpasample.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommonController {
  private final CommentRepository repository;

//  @Autowired    コンストラクタが1つの場合は省略できる
  // コンストラクタインジェクション
  public CommonController(CommentRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/")
  public String getAllComments(@ModelAttribute Comment comment, Model model) {
    model.addAttribute("comments", repository.findAll());
    return "list";
  }

  @PostMapping("/add")
  public String addComment(@Validated @ModelAttribute Comment comment, BindingResult result, Model model) {
    model.addAttribute("comments", repository.findAll());
    if (result.hasErrors()) {
      return "list";
    }
    repository.save(comment);

    // ルートパスにリダイレクト
    return "redirect:/";
  }
}
