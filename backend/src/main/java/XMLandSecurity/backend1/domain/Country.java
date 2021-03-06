package XMLandSecurity.backend1.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "country")

public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @XmlElement(name = "id", required = true)
    private Long id;

    //
    @Column(name = "name", nullable = false)
    @XmlElement(name = "name", required = true)
    private String name;

    //
    @Column(name = "code", nullable = false)
    @XmlElement(name = "code", required = true)
    private String code;

    //  @XmlElement(required = true)
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    @XmlElementWrapper(name = "cityList", required = true)
    @XmlElement(name = "city", required = true)
    private List<City> cityList = new ArrayList<City>();

    public Country() {
    }

    public Country(String name, String code, List<City> cityList) {
        this.name = name;
        this.code = code;
        this.cityList = cityList;
    }

    // @XmlElement
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //  @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  @XmlElement
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // @XmlElement
    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
