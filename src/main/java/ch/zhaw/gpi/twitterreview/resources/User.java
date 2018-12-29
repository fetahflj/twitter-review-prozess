package ch.zhaw.gpi.twitterreview.resources;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Flora
 */
public class User {
    
    private String firstName;
    private String eMail;

    public String getFirstName() {
        return firstName;
    }

    public String geteMail() {
        return eMail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    

}
