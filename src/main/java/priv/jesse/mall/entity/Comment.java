package priv.jesse.mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Comment implements Serializable {


    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column
    private Integer orderId;

    @Column
    private Integer productId;

    @Column
    private String content;
    private static final long serialVersionUID = 1L;

    public Comment(Integer id, Integer orderId, Integer productId, String content) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.content = content;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
