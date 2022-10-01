package levvel.io.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class Blog {

    @Id
    String id;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    String author;
    String title;
    String text;

    //ArrayList of Comments to store comments for each post
    public ArrayList<Comment> comments = new ArrayList<Comment>();

    //Helper Methods
    public ArrayList<Comment> getallComments(){
        return comments;
    }

    public void addNewComment(Comment comment){
        comments.add(comment);
    }


}
