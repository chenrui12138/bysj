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
 * 会议室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-11-30 14:36:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("huiyishi")
public class HuiyishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;


//	public HuiyishiEntity() {
//
//	}
//
//	public HuiyishiEntity(T t) {
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
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 规模
	 */
					
	private String guimo;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 状况
	 */
					
	private String zhuangkuang;
	
	/**
	 * 可约时间
	 */
					
	private String keyueshijian;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	/**
	 * 删除标志 1未删除，0已删除
	 */
	@TableLogic(value = "1", delval = "0")
	private String isDelete;

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
//	 * 设置：规模
//	 */
//	public void setGuimo(String guimo) {
//		this.guimo = guimo;
//	}
//	/**
//	 * 获取：规模
//	 */
//	public String getGuimo() {
//		return guimo;
//	}
//	/**
//	 * 设置：类型
//	 */
//	public void setLeixing(String leixing) {
//		this.leixing = leixing;
//	}
//	/**
//	 * 获取：类型
//	 */
//	public String getLeixing() {
//		return leixing;
//	}
//	/**
//	 * 设置：图片
//	 */
//	public void setTupian(String tupian) {
//		this.tupian = tupian;
//	}
//	/**
//	 * 获取：图片
//	 */
//	public String getTupian() {
//		return tupian;
//	}
//	/**
//	 * 设置：状况
//	 */
//	public void setZhuangkuang(String zhuangkuang) {
//		this.zhuangkuang = zhuangkuang;
//	}
//	/**
//	 * 获取：状况
//	 */
//	public String getZhuangkuang() {
//		return zhuangkuang;
//	}
//	/**
//	 * 设置：可约时间
//	 */
//	public void setKeyueshijian(String keyueshijian) {
//		this.keyueshijian = keyueshijian;
//	}
//	/**
//	 * 获取：可约时间
//	 */
//	public String getKeyueshijian() {
//		return keyueshijian;
//	}
//	/**
//	 * 设置：详情
//	 */
//	public void setXiangqing(String xiangqing) {
//		this.xiangqing = xiangqing;
//	}
//	/**
//	 * 获取：详情
//	 */
//	public String getXiangqing() {
//		return xiangqing;
//	}

}
