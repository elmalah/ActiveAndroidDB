package sample.com.activeandroiddb.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by fifi on 5/7/2017.
 */

//This is our table name
@Table(name = "User")
public class SaveUserModel extends Model{


    //The table consist  fields name
    @Column(name = "name")
    public String name;

    @Column(name = "userName")
    public String username ;

    @Column(name = "firstName")
    public String firstName ;

    @Column(name = "lastName")
    public String lastName ;

    @Column(name = "password")
    public String password ;

    @Column(name = "email")
    public String email ;

    @Column(name = "mobile")
    public String mobile ;




}
