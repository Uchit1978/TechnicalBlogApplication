package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;
import technicalblog.service.UserService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);

        return "index";

    }
}
