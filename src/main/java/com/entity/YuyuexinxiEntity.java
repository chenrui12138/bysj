package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 预约信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-11-30 14:36:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("yuyuexinxi")
public class YuyuexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;


//	public YuyuexinxiEntity() {
//
//	}
//
//	public YuyuexinxiEntity(T t) {
//		try {
//			BeanUtils.copyProperties(this, t);
//		} catch (IllegalAccessException | InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 预约编号
	 */
					
	private String yuyuebianhao;
	
	/**
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 会议主题
	 */
					
	private String huiyizhuti;
	
	/**
	 * 参会人员
	 */
					
	private String canhuirenyuan;
	
	/**
	 * 会议时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date huiyishijian;
	
	/**
	 * 使用时长
	 */
					
	private String shiyongshizhang;
	
	/**
	 * 预约备注
	 */
					
	private String yuyuebeizhu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;

	/**
	 * 删除标志 1未删除，0已删除
	 */
	@TableLogic(value = "1", delval = "0")
	private String isDelete;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

//	public Date getAddtime() {
//		return addtime;
//	}
//	public void setAddtime(Date addtime) {
//		this.addtime = addtime;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//	/**
//	 * 设置：预约编号
//	 */
//	public void setYuyuebianhao(String yuyuebianhao) {
//		this.yuyuebianhao = yuyuebianhao;
//	}
//	/**
//	 * 获取：预约编号
//	 */
//	public String getYuyuebianhao() {
//		return yuyuebianhao;
//	}
//	/**
//	 * 设置：编号
//	 */
//	public void setBianhao(String bianhao) {
//		this.bianhao = bianhao;
//	}
//	/**
//	 * 获取：编号
//	 */
//	public String getBianhao() {
//		return bianhao;
//	}
//	/**
//	 * 设置：名称
//	 */
//	public void setMingcheng(String mingcheng) {
//		this.mingcheng = mingcheng;
//	}
//	/**
//	 * 获取：名称
//	 */
//	public String getMingcheng() {
//		return mingcheng;
//	}
//	/**
//	 * 设置：工号
//	 */
//	public void setGonghao(String gonghao) {
//		this.gonghao = gonghao;
//	}
//	/**
//	 * 获取：工号
//	 */
//	public String getGonghao() {
//		return gonghao;
//	}
//	/**
//	 * 设置：姓名
//	 */
//	public void setXingming(String xingming) {
//		this.xingming = xingming;
//	}
//	/**
//	 * 获取：姓名
//	 */
//	public String getXingming() {
//		return xingming;
//	}
//	/**
//	 * 设置：联系电话
//	 */
//	public void setLianxidianhua(String lianxidianhua) {
//		this.lianxidianhua = lianxidianhua;
//	}
//	/**
//	 * 获取：联系电话
//	 */
//	public String getLianxidianhua() {
//		return lianxidianhua;
//	}
//	/**
//	 * 设置：会议主题
//	 */
//	public void setHuiyizhuti(String huiyizhuti) {
//		this.huiyizhuti = huiyizhuti;
//	}
//	/**
//	 * 获取：会议主题
//	 */
//	public String getHuiyizhuti() {
//		return huiyizhuti;
//	}
//	/**
//	 * 设置：参会人员
//	 */
//	public void setCanhuirenyuan(String canhuirenyuan) {
//		this.canhuirenyuan = canhuirenyuan;
//	}
//	/**
//	 * 获取：参会人员
//	 */
//	public String getCanhuirenyuan() {
//		return canhuirenyuan;
//	}
//	/**
//	 * 设置：会议时间
//	 */
//	public void setHuiyishijian(Date huiyishijian) {
//		this.huiyishijian = huiyishijian;
//	}
//	/**
//	 * 获取：会议时间
//	 */
//	public Date getHuiyishijian() {
//		return huiyishijian;
//	}
//	/**
//	 * 设置：使用时长
//	 */
//	public void setShiyongshizhang(String shiyongshizhang) {
//		this.shiyongshizhang = shiyongshizhang;
//	}
//	/**
//	 * 获取：使用时长
//	 */
//	public String getShiyongshizhang() {
//		return shiyongshizhang;
//	}
//	/**
//	 * 设置：预约备注
//	 */
//	public void setYuyuebeizhu(String yuyuebeizhu) {
//		this.yuyuebeizhu = yuyuebeizhu;
//	}
//	/**
//	 * 获取：预约备注
//	 */
//	public String getYuyuebeizhu() {
//		return yuyuebeizhu;
//	}
//	/**
//	 * 设置：是否审核
//	 */
//	public void setSfsh(String sfsh) {
//		this.sfsh = sfsh;
//	}
//	/**
//	 * 获取：是否审核
//	 */
//	public String getSfsh() {
//		return sfsh;
//	}
//	/**
//	 * 设置：审核回复
//	 */
//	public void setShhf(String shhf) {
//		this.shhf = shhf;
//	}
//	/**
//	 * 获取：审核回复
//	 */
//	public String getShhf() {
//		return shhf;
//	}

}
