package com.dream21th.web.bean;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * <p>
 * 角色菜单表
 * </p>
 *
 * @author lengleng
 * @since 2017-10-29
 */
@TableName("sys_role_menu")
@Entity
public class SysRoleMenu extends Model<SysRoleMenu> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @Id
    @TableField("role_id")
	private Integer roleId;
    /**
     * 菜单ID
     */
	@Id
    @TableField("menu_id")
	private Integer menuId;


	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	@Override
	protected Serializable pkVal() {
		return this.roleId;
	}

	@Override
	public String toString() {
		return "SysRoleMenu{" +
			", roleId=" + roleId +
			", menuId=" + menuId +
			"}";
	}
}
