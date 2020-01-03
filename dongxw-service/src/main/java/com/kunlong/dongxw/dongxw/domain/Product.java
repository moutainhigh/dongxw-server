package com.kunlong.dongxw.dongxw.domain;

import java.io.Serializable;
import javax.validation.constraints.*;
import org.mybatis.hbatis.core.type.JdbcType;
import org.mybatis.hbatis.core.annotation.*;
import org.mybatis.hbatis.core.*;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import org.mybatis.hbatis.orm.criteria.support.query.AbstractQueryParam;
import org.mybatis.hbatis.orm.criteria.support.query.SortOrders;
/**
 * Product 产品
 * @author generator
 * @date 2020年01月03日
 */
@Table(Product.EntityNode.class)
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	  * 主键
	  * nullable:true,length:11
	  */
	@Column(primaryKey = true,autoIncrement = true,comment = "主键")	
	private Integer id;
	/**
	  * EP款号 
	  * nullable:false,length:32
	  */
	@Column(comment = "EP款号 ")	
	@NotNull
	private String epCode;
	/**
	  * 编码
	  * nullable:false,length:32
	  */
	@Column(comment = "编码")	
	@NotNull
	private String code;
	/**
	  * 描述 
	  * nullable:false,length:128
	  */
	@Column(comment = "描述 ")	
	@NotNull
	private String remark;
	/**
	  * 父类
	  * nullable:false,length:11
	  */
	@Column(comment = "父类")	
	@NotNull
	private Integer parentId;
	/**
	  * 产品小类 
	  * nullable:false,length:11
	  */
	@Column(comment = "产品小类 ")	
	@NotNull
	private Integer productTypeId;
	/**
	  * 图片 
	  * nullable:true,length:128
	  */
	@Column(comment = "图片 ")	
	private String picUrl;
	/**
	  * 条码 
	  * nullable:false,length:4
	  */
	@Column(comment = "条码 ")	
	@NotNull
	private String barCode;
	/**
	  * 配色 
	  * nullable:false,length:16
	  */
	@Column(comment = "配色 ")	
	@NotNull
	private String color;
	/**
	  * 单位 
	  * nullable:false,length:16
	  */
	@Column(comment = "单位 ")	
	@NotNull
	private String unit;
	/**
	  * 尺寸 
	  * nullable:false,length:24
	  */
	@Column(comment = "尺寸 ")	
	@NotNull
	private String size;
	/**
	  * UPC-A 
	  * nullable:false,length:32
	  */
	@Column(comment = "UPC-A ")	
	@NotNull
	private String upcA;
	/**
	  * 状态 1-使用 0-停用
	  * nullable:false,length:11
	  */
	@Column(comment = "状态 1-使用 0-停用")	
	@NotNull
	private Integer status;
	/**
	  * 备注 
	  * nullable:false,length:128
	  */
	@Column(comment = "备注 ")	
	@NotNull
	private String memo;
	/**
	  * 建档时间 
	  * nullable:true,length:19
	  */
	@Column(comment = "建档时间 ")	
	private Date createDate;
	/**
	  * 建档人 
	  * nullable:false,length:11
	  */
	@Column(comment = "建档人 ")	
	@NotNull
	private Integer createBy;
    public Integer getId(){
    	return this.id;
    }
    public void setId(Integer id){
    	this.id = id;
    }
    public String getEpCode(){
    	return this.epCode;
    }
    public void setEpCode(String epCode){
    	this.epCode = epCode;
    }
    public String getCode(){
    	return this.code;
    }
    public void setCode(String code){
    	this.code = code;
    }
    public String getRemark(){
    	return this.remark;
    }
    public void setRemark(String remark){
    	this.remark = remark;
    }
    public Integer getParentId(){
    	return this.parentId;
    }
    public void setParentId(Integer parentId){
    	this.parentId = parentId;
    }
    public Integer getProductTypeId(){
    	return this.productTypeId;
    }
    public void setProductTypeId(Integer productTypeId){
    	this.productTypeId = productTypeId;
    }
    public String getPicUrl(){
    	return this.picUrl;
    }
    public void setPicUrl(String picUrl){
    	this.picUrl = picUrl;
    }
    public String getBarCode(){
    	return this.barCode;
    }
    public void setBarCode(String barCode){
    	this.barCode = barCode;
    }
    public String getColor(){
    	return this.color;
    }
    public void setColor(String color){
    	this.color = color;
    }
    public String getUnit(){
    	return this.unit;
    }
    public void setUnit(String unit){
    	this.unit = unit;
    }
    public String getSize(){
    	return this.size;
    }
    public void setSize(String size){
    	this.size = size;
    }
    public String getUpcA(){
    	return this.upcA;
    }
    public void setUpcA(String upcA){
    	this.upcA = upcA;
    }
    public Integer getStatus(){
    	return this.status;
    }
    public void setStatus(Integer status){
    	this.status = status;
    }
    public String getMemo(){
    	return this.memo;
    }
    public void setMemo(String memo){
    	this.memo = memo;
    }
    public Date getCreateDate(){
    	return this.createDate;
    }
    public void setCreateDate(Date createDate){
    	this.createDate = createDate;
    }
    public Integer getCreateBy(){
    	return this.createBy;
    }
    public void setCreateBy(Integer createBy){
    	this.createBy = createBy;
    }

    public static class EntityNode extends AbstractEntityNode<Product> {
        public static final EntityNode INSTANCE = new EntityNode("p");;
    	/** 主键 */
        public FieldNode<Product, Integer> id =  createFieldNode("id","id",Integer.class,JdbcType.INTEGER);
    	/** EP款号  */
        public FieldNode<Product, String> epCode =  createFieldNode("epCode","ep_code",String.class,JdbcType.VARCHAR);
    	/** 编码 */
        public FieldNode<Product, String> code =  createFieldNode("code","code",String.class,JdbcType.VARCHAR);
    	/** 描述  */
        public FieldNode<Product, String> remark =  createFieldNode("remark","remark",String.class,JdbcType.VARCHAR);
    	/** 父类 */
        public FieldNode<Product, Integer> parentId =  createFieldNode("parentId","parent_id",Integer.class,JdbcType.INTEGER);
    	/** 产品小类  */
        public FieldNode<Product, Integer> productTypeId =  createFieldNode("productTypeId","product_type_id",Integer.class,JdbcType.INTEGER);
    	/** 图片  */
        public FieldNode<Product, String> picUrl =  createFieldNode("picUrl","pic_url",String.class,JdbcType.VARCHAR);
    	/** 条码  */
        public FieldNode<Product, String> barCode =  createFieldNode("barCode","bar_code",String.class,JdbcType.VARCHAR);
    	/** 配色  */
        public FieldNode<Product, String> color =  createFieldNode("color","color",String.class,JdbcType.VARCHAR);
    	/** 单位  */
        public FieldNode<Product, String> unit =  createFieldNode("unit","unit",String.class,JdbcType.VARCHAR);
    	/** 尺寸  */
        public FieldNode<Product, String> size =  createFieldNode("size","size",String.class,JdbcType.VARCHAR);
    	/** UPC-A  */
        public FieldNode<Product, String> upcA =  createFieldNode("upcA","upc_a",String.class,JdbcType.VARCHAR);
    	/** 状态 1-使用 0-停用 */
        public FieldNode<Product, Integer> status =  createFieldNode("status","status",Integer.class,JdbcType.INTEGER);
    	/** 备注  */
        public FieldNode<Product, String> memo =  createFieldNode("memo","memo",String.class,JdbcType.VARCHAR);
    	/** 建档时间  */
        public FieldNode<Product, Date> createDate =  createFieldNode("createDate","create_date",Date.class,JdbcType.TIMESTAMP);
    	/** 建档人  */
        public FieldNode<Product, Integer> createBy =  createFieldNode("createBy","create_by",Integer.class,JdbcType.INTEGER);
	
        /**
         * @param alias 别名
         */
        public EntityNode(String alias) {
            super(Product.class,"product",alias);
        }
    }
    
    //-- 实体参数(允许新增属性) 
	public static class QueryParam extends AbstractQueryParam<Product> {
		public QueryParam() {
			this.setSortOrders(new SortOrders<Product>(EntityNode.INSTANCE));
		}
	}
	
	public static enum ValueField {
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductType getProductSubType() {
		return productSubType;
	}

	public void setProductSubType(ProductType productSubType) {
		this.productSubType = productSubType;
	}

	// ==== 自定义属性 ====
	ProductType productType;
	ProductType productSubType;


}