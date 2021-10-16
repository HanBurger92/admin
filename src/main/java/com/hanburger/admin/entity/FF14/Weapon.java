package com.hanburger.admin.entity.FF14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HanBurger
 * @date 2021/10/16 10:17
 * FF14武器实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Weapon implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 装备名称
     */
    private String name;

    /**
     * 物品品级
     */
    private Integer level;

    /**
     * 物品部位
     */
    private String type;

    /**
     * 等级要求
     */
    private Integer requirement;

    /**
     * 基本性能
     */
    private Integer basicAttribute;

    /**
     * 自动攻击性能
     */
    private Integer physicAttack;

    /**
     * 自动攻击间隔
     */
    private Double attackFrequency;

    /**
     * 职业要求
     */
    private String role;

    /**
     * 属性1
     */
    private String attribute1;

    /**
     * 属性1值
     */
    private Integer attribute1Value;

    /**
     * 属性2
     */
    private String attribute2;

    /**
     * 属性2值
     */
    private Integer attribute2Value;

    /**
     * 同模装备
     */
    private String sameModel;

    /**
     * 是否可染色
     */
    private Boolean colourable;

    /**
     * 是否可幻化
     */
    private Boolean transmogrificationable;

    /**
     * 是否可魔晶石化
     */
    private Boolean materialable;

    /**
     * 是否可分解
     */
    private Boolean desynthesisable;

    /**
     * 删除标识
     */
    private Boolean isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建时间
     */
    private Date updateTime;

    /**
     * 修理要求
     */
    private String repairRequirement;

    /**
     * 修理要求
     */
    private String repairMaterial;

    /**
     * 是否可在板子上出售
     */
    private Boolean sellableOnMarket;

    /**
     * 是否只能持有一个
     */
    private Boolean isUnique;

    /**
     * 是否可出售
     */
    private Boolean sellable;
}
