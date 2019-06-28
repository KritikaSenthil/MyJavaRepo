/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProjectPart2;

/**
 *
 * @author kritikasenthil
 */
import java.io.Serializable;
import javax.inject.Named;

@Named()
public class ValidationBean implements Serializable {

    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    /**
     *
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String Firstname) {
        this.firstname = Firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String Lastname) {
        this.lastname = Lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // returns result for rendering on the client
    public String getResult() {
        if (firstname != null && lastname != null && email != null && phone != null) {
            return "<p style=\"background-color:yellow;width:200px;"
                    + "padding:5px\">Name: " + getFirstname() + "padding:5px\">Name: " + getLastname() + "<br/>E-Mail: "
                    + getEmail() + "<br/>Phone: " + getPhone() + "</p>";
        } else {
            return ""; // request has not yet been made
        }
    }
}
