package com.entity.vo;

import com.entity.BokeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 博客信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("boke")
public class BokeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 博客名称
     */

    @TableField(value = "boke_name")
    private String bokeName;


    /**
     * 博客类型
     */

    @TableField(value = "boke_types")
    private Integer bokeTypes;


    /**
     * 博客图片
     */

    @TableField(value = "boke_photo")
    private String bokePhoto;


    /**
     * 博客门票
     */

    @TableField(value = "lvyouluxian_money")
    private Double lvyouluxianMoney;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 博客详情
     */

    @TableField(value = "boke_content")
    private String bokeContent;


    /**
     * 博客审核
     */

    @TableField(value = "boke_yesno_types")
    private Integer bokeYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "boke_yesno_text")
    private String bokeYesnoText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：博客名称
	 */
    public String getBokeName() {
        return bokeName;
    }


    /**
	 * 获取：博客名称
	 */

    public void setBokeName(String bokeName) {
        this.bokeName = bokeName;
    }
    /**
	 * 设置：博客类型
	 */
    public Integer getBokeTypes() {
        return bokeTypes;
    }


    /**
	 * 获取：博客类型
	 */

    public void setBokeTypes(Integer bokeTypes) {
        this.bokeTypes = bokeTypes;
    }
    /**
	 * 设置：博客图片
	 */
    public String getBokePhoto() {
        return bokePhoto;
    }


    /**
	 * 获取：博客图片
	 */

    public void setBokePhoto(String bokePhoto) {
        this.bokePhoto = bokePhoto;
    }
    /**
	 * 设置：博客门票
	 */
    public Double getLvyouluxianMoney() {
        return lvyouluxianMoney;
    }


    /**
	 * 获取：博客门票
	 */

    public void setLvyouluxianMoney(Double lvyouluxianMoney) {
        this.lvyouluxianMoney = lvyouluxianMoney;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：博客详情
	 */
    public String getBokeContent() {
        return bokeContent;
    }


    /**
	 * 获取：博客详情
	 */

    public void setBokeContent(String bokeContent) {
        this.bokeContent = bokeContent;
    }
    /**
	 * 设置：博客审核
	 */
    public Integer getBokeYesnoTypes() {
        return bokeYesnoTypes;
    }


    /**
	 * 获取：博客审核
	 */

    public void setBokeYesnoTypes(Integer bokeYesnoTypes) {
        this.bokeYesnoTypes = bokeYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getBokeYesnoText() {
        return bokeYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setBokeYesnoText(String bokeYesnoText) {
        this.bokeYesnoText = bokeYesnoText;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
