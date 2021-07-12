package source.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "account")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role_id;
    @OneToOne
    @JoinColumn(name = "account_info_id")
    private Account_info account_info_id;
    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart_id;
    @Column(name = "create_by")
    private String create_by;
    @Column(name = "update_by")
    private String update_by;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "update_date")
    private Date update_date;
    @Column(name = "active_fag")
    private int active_fag;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public Account_info getAccount_info_id() {
        return account_info_id;
    }

    public void setAccount_info_id(Account_info account_info_id) {
        this.account_info_id = account_info_id;
    }

    public Cart getCart_id() {
        return cart_id;
    }

    public void setCart_id(Cart cart_id) {
        this.cart_id = cart_id;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public int getActive_fag() {
        return active_fag;
    }

    public void setActive_fag(int active_fag) {
        this.active_fag = active_fag;
    }
}
