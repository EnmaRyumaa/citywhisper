package com.citywhisper.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;

@Entity
public class AgentsConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String roleSystem;
    private String roleUser;
    private String roleAssistent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoleSystem() {
        return roleSystem;
    }

    public void setRoleSystem(String roleSystem) {
        this.roleSystem = roleSystem;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    public String getRoleAssistent() {
        return roleAssistent;
    }

    public void setRoleAssistent(String roleAssistent) {
        this.roleAssistent = roleAssistent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentsConfig that = (AgentsConfig) o;
        return Objects.equals(id, that.id)
                && Objects.equals(description, that.description)
                && Objects.equals(roleSystem, that.roleSystem)
                && Objects.equals(roleUser, that.roleUser)
                && Objects.equals(roleAssistent, that.roleAssistent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, roleSystem, roleUser, roleAssistent);
    }
}
