package sa.kafd.erp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "XX_AUTHOR")
public class Author {

    @Id
    @Column(name = "AUTHOR_ID")
    private Long authorId;
    @Column(name = "AUTHOR_NAME")
    private String authorName;

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
