package lab5.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specialty", schema = "public")
public class Specialty extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "cod_spec")
    private String cod_spec;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "specialty")
    private List<Group> groups;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcod_spec() {
        return cod_spec;
    }

    public void setcod_spec(String cod_spec) {
        this.cod_spec = cod_spec;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;

    }

}
