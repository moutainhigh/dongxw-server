package com.kunlong.dongxw.dongxw.domain;

import java.io.Serializable;
import javax.validation.constraints.*;
import org.mybatis.hbatis.core.type.JdbcType;
import org.mybatis.hbatis.core.annotation.*;
import org.mybatis.hbatis.core.*;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import java.lang.Byte;
import org.mybatis.hbatis.orm.criteria.support.query.AbstractQueryParam;
import org.mybatis.hbatis.orm.criteria.support.query.SortOrders;
/**
 * OrderLine 订单产品表
 * @author generator
 * @date 2020年01月04日
 */
@Table(OrderLine.EntityNode.class)
public class OrderLine extends  OrderLineBase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	  * 订单产品标识 
	  * nullable:true,length:11
	  */
	@Column(primaryKey = true,autoIncrement = true,comment = "订单产品标识 ")	
	private Integer id;
	/**
	  * 客户标识 
	  * nullable:false,length:11
	  */
	@Column(comment = "客户标识 ")	
	@NotNull
	private Integer customerId;
	/**
	  * 订单标识 
	  * nullable:false,length:11
	  */
	@Column(comment = "订单标识 ")	
	@NotNull
	private Integer orderId;
	/**
	  * 产品大类 
	  * nullable:false,length:11
	  */
	@Column(comment = "产品大类 ")	
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
	  * 产品标识 
	  * nullable:false,length:11
	  */
	@Column(comment = "产品标识 ")	
	@NotNull
	private Integer productId;
	/**
	  * 客款号 
	  * nullable:false,length:64
	  */
	@Column(comment = "客款号 ")	
	@NotNull
	private String customerCode;
	/**
	  * 图片 
	  * nullable:false,length:128
	  */
	@Column(comment = "图片 ")	
	@NotNull
	private String picUrl;
	/**
	  * 尺寸 
	  * nullable:false,length:64
	  */
	@Column(comment = "尺寸 ")	
	@NotNull
	private String size;
	/**
	  * 配色 
	  * nullable:false,length:16
	  */
	@Column(comment = "配色 ")	
	@NotNull
	private String color;
	/**
	  * 数量 
	  * nullable:false,length:11
	  */
	@Column(comment = "数量 ")	
	@NotNull
	private Integer qty;
	/**
	  * 单位 
	  * nullable:false,length:16
	  */
	@Column(comment = "单位 ")	
	@NotNull
	private String unit;
	/**
	  * 单价 
	  * nullable:false,length:10
	  */
	@Column(comment = "单价 ")	
	@NotNull
	private BigDecimal price;
	/**
	  * 货币 
	  * nullable:false,length:16
	  */
	@Column(comment = "货币 ")	
	@NotNull
	private String currency;
	/**
	  * 金额 
	  * nullable:false,length:12
	  */
	@Column(comment = "金额 ")	
	@NotNull
	private BigDecimal money;
	/**
	  * 供应商 
	  * nullable:false,length:11
	  */
	@Column(comment = "供应商 ")	
	@NotNull
	private Integer supplierId;
	/**
	  * 主料 
	  * nullable:false,length:512
	  */
	@Column(comment = "主料 ")	
	@NotNull
	private String material;
	/**
	  * 内盒数量 
	  * nullable:false,length:11
	  */
	@Column(comment = "内盒数量 ")	
	@NotNull
	private Integer ibQty;
	/**
	  * 毛重 
	  * nullable:false,length:10
	  */
	@Column(comment = "毛重 ")	
	@NotNull
	private BigDecimal ibGw;
	/**
	  * 净重 
	  * nullable:false,length:10
	  */
	@Column(comment = "净重 ")	
	@NotNull
	private BigDecimal ibNw;
	/**
	  * 内盒尺寸 
	  * nullable:false,length:32
	  */
	@Column(comment = "内盒尺寸 ")	
	@NotNull
	private String ibSize;
	/**
	  * 外箱数量 
	  * nullable:false,length:11
	  */
	@Column(comment = "外箱数量 ")	
	@NotNull
	private Integer obQty;
	/**
	  * 毛重 
	  * nullable:false,length:10
	  */
	@Column(comment = "毛重 ")	
	@NotNull
	private BigDecimal obGw;
	/**
	  * 净重 
	  * nullable:false,length:10
	  */
	@Column(comment = "净重 ")	
	@NotNull
	private BigDecimal obNw;
	/**
	  * 外箱尺寸 
	  * nullable:false,length:32
	  */
	@Column(comment = "外箱尺寸 ")	
	@NotNull
	private String obSize;
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
	/**
	  * 备注 
	  * nullable:true,length:256
	  */
	@Column(comment = "备注 ")	
	private String remark;
	/**
	  * 状态 
	  * nullable:false,length:4
	  */
	@Column(comment = "状态 ")	
	@NotNull
	private Byte status;
    public Integer getId(){
    	return this.id;
    }
    public void setId(Integer id){
    	this.id = id;
    }
    public Integer getCustomerId(){
    	return this.customerId;
    }
    public void setCustomerId(Integer customerId){
    	this.customerId = customerId;
    }
    public Integer getOrderId(){
    	return this.orderId;
    }
    public void setOrderId(Integer orderId){
    	this.orderId = orderId;
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
    public Integer getProductId(){
    	return this.productId;
    }
    public void setProductId(Integer productId){
    	this.productId = productId;
    }
    public String getCustomerCode(){
    	return this.customerCode;
    }
    public void setCustomerCode(String customerCode){
    	this.customerCode = customerCode;
    }
    public String getPicUrl(){
    	return this.picUrl;
    }
    public void setPicUrl(String picUrl){
    	this.picUrl = picUrl;
    }
    public String getSize(){
    	return this.size;
    }
    public void setSize(String size){
    	this.size = size;
    }
    public String getColor(){
    	return this.color;
    }
    public void setColor(String color){
    	this.color = color;
    }
    public Integer getQty(){
    	return this.qty;
    }
    public void setQty(Integer qty){
    	this.qty = qty;
    }
    public String getUnit(){
    	return this.unit;
    }
    public void setUnit(String unit){
    	this.unit = unit;
    }
    public BigDecimal getPrice(){
    	return this.price;
    }
    public void setPrice(BigDecimal price){
    	this.price = price;
    }
    public String getCurrency(){
    	return this.currency;
    }
    public void setCurrency(String currency){
    	this.currency = currency;
    }
    public BigDecimal getMoney(){
    	return this.money;
    }
    public void setMoney(BigDecimal money){
    	this.money = money;
    }
    public Integer getSupplierId(){
    	return this.supplierId;
    }
    public void setSupplierId(Integer supplierId){
    	this.supplierId = supplierId;
    }
    public String getMaterial(){
    	return this.material;
    }
    public void setMaterial(String material){
    	this.material = material;
    }
    public Integer getIbQty(){
    	return this.ibQty;
    }
    public void setIbQty(Integer ibQty){
    	this.ibQty = ibQty;
    }
    public BigDecimal getIbGw(){
    	return this.ibGw;
    }
    public void setIbGw(BigDecimal ibGw){
    	this.ibGw = ibGw;
    }
    public BigDecimal getIbNw(){
    	return this.ibNw;
    }
    public void setIbNw(BigDecimal ibNw){
    	this.ibNw = ibNw;
    }
    public String getIbSize(){
    	return this.ibSize;
    }
    public void setIbSize(String ibSize){
    	this.ibSize = ibSize;
    }
    public Integer getObQty(){
    	return this.obQty;
    }
    public void setObQty(Integer obQty){
    	this.obQty = obQty;
    }
    public BigDecimal getObGw(){
    	return this.obGw;
    }
    public void setObGw(BigDecimal obGw){
    	this.obGw = obGw;
    }
    public BigDecimal getObNw(){
    	return this.obNw;
    }
    public void setObNw(BigDecimal obNw){
    	this.obNw = obNw;
    }
    public String getObSize(){
    	return this.obSize;
    }
    public void setObSize(String obSize){
    	this.obSize = obSize;
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
    public String getRemark(){
    	return this.remark;
    }
    public void setRemark(String remark){
    	this.remark = remark;
    }
    public Byte getStatus(){
    	return this.status;
    }
    public void setStatus(Byte status){
    	this.status = status;
    }

    public static class EntityNode extends AbstractEntityNode<OrderLine> {
        public static final EntityNode INSTANCE = new EntityNode("ol");;
    	/** 订单产品标识  */
        public FieldNode<OrderLine, Integer> id =  createFieldNode("id","id",Integer.class,JdbcType.INTEGER);
    	/** 客户标识  */
        public FieldNode<OrderLine, Integer> customerId =  createFieldNode("customerId","customer_id",Integer.class,JdbcType.INTEGER);
    	/** 订单标识  */
        public FieldNode<OrderLine, Integer> orderId =  createFieldNode("orderId","order_id",Integer.class,JdbcType.INTEGER);
    	/** 产品大类  */
        public FieldNode<OrderLine, Integer> parentId =  createFieldNode("parentId","parent_id",Integer.class,JdbcType.INTEGER);
    	/** 产品小类  */
        public FieldNode<OrderLine, Integer> productTypeId =  createFieldNode("productTypeId","product_type_id",Integer.class,JdbcType.INTEGER);
    	/** 产品标识  */
        public FieldNode<OrderLine, Integer> productId =  createFieldNode("productId","product_id",Integer.class,JdbcType.INTEGER);
    	/** 客款号  */
        public FieldNode<OrderLine, String> customerCode =  createFieldNode("customerCode","customer_code",String.class,JdbcType.VARCHAR);
    	/** 图片  */
        public FieldNode<OrderLine, String> picUrl =  createFieldNode("picUrl","pic_url",String.class,JdbcType.VARCHAR);
    	/** 尺寸  */
        public FieldNode<OrderLine, String> size =  createFieldNode("size","size",String.class,JdbcType.VARCHAR);
    	/** 配色  */
        public FieldNode<OrderLine, String> color =  createFieldNode("color","color",String.class,JdbcType.VARCHAR);
    	/** 数量  */
        public FieldNode<OrderLine, Integer> qty =  createFieldNode("qty","qty",Integer.class,JdbcType.INTEGER);
    	/** 单位  */
        public FieldNode<OrderLine, String> unit =  createFieldNode("unit","unit",String.class,JdbcType.VARCHAR);
    	/** 单价  */
        public FieldNode<OrderLine, BigDecimal> price =  createFieldNode("price","price",BigDecimal.class,JdbcType.DECIMAL);
    	/** 货币  */
        public FieldNode<OrderLine, String> currency =  createFieldNode("currency","currency",String.class,JdbcType.VARCHAR);
    	/** 金额  */
        public FieldNode<OrderLine, BigDecimal> money =  createFieldNode("money","money",BigDecimal.class,JdbcType.DECIMAL);
    	/** 供应商  */
        public FieldNode<OrderLine, Integer> supplierId =  createFieldNode("supplierId","supplier_id",Integer.class,JdbcType.INTEGER);
    	/** 主料  */
        public FieldNode<OrderLine, String> material =  createFieldNode("material","material",String.class,JdbcType.VARCHAR);
    	/** 内盒数量  */
        public FieldNode<OrderLine, Integer> ibQty =  createFieldNode("ibQty","ib_qty",Integer.class,JdbcType.INTEGER);
    	/** 毛重  */
        public FieldNode<OrderLine, BigDecimal> ibGw =  createFieldNode("ibGw","ib_gw",BigDecimal.class,JdbcType.DECIMAL);
    	/** 净重  */
        public FieldNode<OrderLine, BigDecimal> ibNw =  createFieldNode("ibNw","ib_nw",BigDecimal.class,JdbcType.DECIMAL);
    	/** 内盒尺寸  */
        public FieldNode<OrderLine, String> ibSize =  createFieldNode("ibSize","ib_size",String.class,JdbcType.VARCHAR);
    	/** 外箱数量  */
        public FieldNode<OrderLine, Integer> obQty =  createFieldNode("obQty","ob_qty",Integer.class,JdbcType.INTEGER);
    	/** 毛重  */
        public FieldNode<OrderLine, BigDecimal> obGw =  createFieldNode("obGw","ob_gw",BigDecimal.class,JdbcType.DECIMAL);
    	/** 净重  */
        public FieldNode<OrderLine, BigDecimal> obNw =  createFieldNode("obNw","ob_nw",BigDecimal.class,JdbcType.DECIMAL);
    	/** 外箱尺寸  */
        public FieldNode<OrderLine, String> obSize =  createFieldNode("obSize","ob_size",String.class,JdbcType.VARCHAR);
    	/** 建档时间  */
        public FieldNode<OrderLine, Date> createDate =  createFieldNode("createDate","create_date",Date.class,JdbcType.TIMESTAMP);
    	/** 建档人  */
        public FieldNode<OrderLine, Integer> createBy =  createFieldNode("createBy","create_by",Integer.class,JdbcType.INTEGER);
    	/** 备注  */
        public FieldNode<OrderLine, String> remark =  createFieldNode("remark","remark",String.class,JdbcType.VARCHAR);
    	/** 状态  */
        public FieldNode<OrderLine, Byte> status =  createFieldNode("status","status",Byte.class,JdbcType.TINYINT);
	
        /**
         * @param alias 别名
         */
        public EntityNode(String alias) {
            super(OrderLine.class,"order_line",alias);
        }
    }
    
    //-- 实体参数(允许新增属性) 
	public static class QueryParam extends AbstractQueryParam<OrderLine> {
		public QueryParam() {
			this.setSortOrders(new SortOrders<OrderLine>(EntityNode.INSTANCE));
		}
	}
	
	public static enum ValueField {
	}
    // ==== 自定义属性 ====
}