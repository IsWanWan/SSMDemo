package com.planet.sysrole.domain;

public class SysroleMenu {
    private Long id;

    private Long roleId;

    private String menuIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds == null ? null : menuIds.trim();
    }

    public SysroleMenu(Long roleId, String menuIds) {
        this.roleId = roleId;
        this.menuIds = menuIds;
    }
    public SysroleMenu() {

    }
}