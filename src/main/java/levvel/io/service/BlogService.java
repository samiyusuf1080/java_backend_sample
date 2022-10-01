package levvel.io.service;

import levvel.io.model.Blog;
import levvel.io.model.Comment;

import java.util.ArrayList;

public interface BlogService {

    void addBlog(Blog blog);

    Blog getBlog(String id);

    void addComment(Comment comment, String id);

    ArrayList<Comment> getComments(String id);

}
