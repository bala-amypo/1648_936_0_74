package.com.example.demo.entity
@Entity
public class studententity{
    private Integer id;
    private String user;
    private String email;
    private String password;
    private Date date;
    private Time time;
}
public Integer getId() {return id;}
public void setId(Integer id) {this.id=id;}

public String getUser() {return user;}
public void setUser(String user) {this.user=user}

public String getEmail() {return email;}
public void setEmail(String email) {this.email=email}

public String getPassword() {return password;}
public void setPassword(String password) {this.password=password}
