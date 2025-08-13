package com.citywhisper.dto;

import com.citywhisper.entities.AgentsConfig;

public class AgentsConfigDTO {

    private Long id;
    private String description;
    private String roleSystem;
    private String roleUser;
    private String roleAssistent;

    public AgentsConfigDTO() {}

    public AgentsConfigDTO(AgentsConfig agentsConfig) {
        this.id = agentsConfig.getId();
        this.description = agentsConfig.getDescription();
        this.roleSystem = agentsConfig.getRoleSystem();
        this.roleUser = agentsConfig.getRoleUser();
        this.roleAssistent = agentsConfig.getRoleAssistent();
    }

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
}
