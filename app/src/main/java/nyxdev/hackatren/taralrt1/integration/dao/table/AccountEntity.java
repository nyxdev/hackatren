package nyxdev.hackatren.taralrt1.integration.dao.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

@Entity
public class AccountEntity {
    @Id private Long id;
    private String email;
    private String rfid;
    private String nfc;
    @Transient private String password;
    @Generated(hash = 2058108414)
    public AccountEntity(Long id, String email, String rfid, String nfc) {
        this.id = id;
        this.email = email;
        this.rfid = rfid;
        this.nfc = nfc;
    }
    @Generated(hash = 40307897)
    public AccountEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRfid() {
        return this.rfid;
    }
    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
    public String getNfc() {
        return this.nfc;
    }
    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
