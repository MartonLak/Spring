package org.fasttrackit.trainginspring.model;
import org.fasttrackit.trainginspring.Additional.Species;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "animals")
public class Animals
{
    private @Id @GeneratedValue Long id;
    private String name;
    private @Enumerated(EnumType.STRING)  @Column Species Species;
    public Animals() {

    }
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Species getSpecies() {
        return this.Species;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(Species species) {
        this.Species = species;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Animals))
            return false;
        Animals animals = (Animals) o;
        return Objects.equals(this.id, animals.id) && Objects.equals(this.name, animals.name)
                && Objects.equals(this.Species, animals.Species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.Species);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.Species + '\'' + '}'+"\r\n";
    }
}