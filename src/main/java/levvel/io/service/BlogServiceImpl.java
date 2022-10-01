package levvel.io.service;

import levvel.io.data.BlogRepository;
import levvel.io.model.Blog;
import levvel.io.model.Comment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    @Override
    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog getBlog(String id) {
        return blogRepository.findById(id).orElseGet(null);
    }

    /*
     *  Create a new comment for a post with passed {id}
    */

    @Override
    public void addComment(Comment comment, String id){
        Blog blog = getBlog(id);
        if(blog != null){
            blog.addNewComment(comment);
            blogRepository.save(blog);
        }
        else{
            System.out.println("Invalid Blog ID");
        }
    }

    /*
     *  Return all comments for a post with passed {id}
    */

    @Override
    public ArrayList<Comment> getComments(String id){
        Blog blog = getBlog(id);
        if(blog != null){
            return blog.getallComments();
        }
        else{
            System.out.println("Invalid Blog ID");
            return null;
        }
    }
}
