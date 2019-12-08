package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "newword", schema = "eng", catalog = "")
public class NewwordEntity {
    private String userid;
    private String wordid;
    private String id;

    @Basic
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "wordid")
    public String getWordid() {
        return wordid;
    }

    public void setWordid(String wordid) {
        this.wordid = wordid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewwordEntity that = (NewwordEntity) o;
        return Objects.equals(userid, that.userid) &&
                Objects.equals(wordid, that.wordid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, wordid);
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
